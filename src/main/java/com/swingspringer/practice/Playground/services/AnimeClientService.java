package com.swingspringer.practice.Playground.services;

import com.swingspringer.practice.Playground.models.AnimePage;
import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class AnimeClientService implements IAniListClientService {
    private static final Logger logger = LoggerFactory.getLogger(AnimeClientService.class.getName());
    private final GraphQLWebClient graphQLWebClient;

    @Override
    public List<AnimePage> getAnimePage(Integer page, Integer fetchSize) {
        Map<String, Object> variables = new HashMap<>();
//        variables.put("page", page);
//        variables.put("perPage", fetchSize);

        GraphQLRequest request = GraphQLRequest.builder()
                .query("""
                            query Page ($page: Int = 0, $perPage: Int = 15, $withNativeTitle: Boolean = true) {
                                currentPage: Page(page: $page, perPage: $perPage) {
                                    ...pageFields
                                },
                                nextPage: Page(page: 1, perPage: $perPage) {
                                    ...pageFields
                                },
                            }
                            fragment pageFields on Page {
                                media {
                                  siteUrl
                                  title {
                                    english
                                  }
                                  title @include(if: $withNativeTitle) {
                                    nativeLang: native
                                  }
                                  description
                                }
                            }
                        """)
                .variables(variables)
                .build();

        return graphQLWebClient.post(request)
                .map(res -> {
                    List<AnimePage> pageList = new ArrayList<>();
                    pageList.add(res.get("currentPage", AnimePage.class));
                    pageList.add(res.get("nextPage", AnimePage.class));
                    return pageList;
                })
                .doOnNext(pageRes -> {
                    logger.info("AnimePage {}", pageRes);
                    logger.info("AnimePage Count: {}", pageRes.size());
                })
                .block();
    }

}

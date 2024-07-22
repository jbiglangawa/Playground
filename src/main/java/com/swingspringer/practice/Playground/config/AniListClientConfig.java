package com.swingspringer.practice.Playground.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "anilist.client")
@Data
public class AniListClientConfig {
    private String url;
}

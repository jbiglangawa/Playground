package com.swingspringer.practice.Playground.controller.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQlModelController {

    @QueryMapping
    public GraphQlModel getGraphQlModel(@Argument int id) {
        return new GraphQlModel(1, "test", 123);
    }

    @MutationMapping
    public GraphQlModel updateGraphQlModel(@Argument GraphQlModelInput input) {
        return new GraphQlModel(input.id(), input.message(), input.code());
    }

}

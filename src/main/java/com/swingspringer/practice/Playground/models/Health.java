package com.swingspringer.practice.Playground.models;

import lombok.Data;

@Data
public class Health {
    private boolean success;

    public Health(boolean success) {
        this.success = success;
    }
}

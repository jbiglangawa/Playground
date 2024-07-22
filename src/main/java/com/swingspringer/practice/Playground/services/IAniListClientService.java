package com.swingspringer.practice.Playground.services;

import com.swingspringer.practice.Playground.models.AnimePage;

import java.util.List;

public interface IAniListClientService {
    List<AnimePage> getAnimePage(Integer page, Integer fetchSize);
}

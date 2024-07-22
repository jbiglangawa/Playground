package com.swingspringer.practice.Playground.controller;

import com.swingspringer.practice.Playground.models.AnimePage;
import com.swingspringer.practice.Playground.services.AnimeClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/anime")
@RequiredArgsConstructor
public class AnimeController {
    private final AnimeClientService animeClientService;

    @GetMapping
    public ResponseEntity<List<AnimePage>> getAnimeList(@PathVariable(name = "page", required = false) Integer page, @PathVariable(name = "pageSize", required = false) Integer pageSize) {
        List<AnimePage> animePage = animeClientService.getAnimePage(page, pageSize);

        return ResponseEntity.ok(animePage);
    }

}

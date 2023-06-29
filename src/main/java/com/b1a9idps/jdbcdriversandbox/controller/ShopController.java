package com.b1a9idps.jdbcdriversandbox.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.jdbcdriversandbox.service.ShopService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/shops")
@RequiredArgsConstructor
@Slf4j
public class ShopController {

    private final ShopService shopService;

    @PostMapping
    public Map<String, Integer> create() {
        var id = shopService.create();
        log.info("saved shop.(id = {})", id);
        return Map.of("id", id);
    }

    @GetMapping
    public Map<String, Integer> list() {
        return shopService.list().stream()
                .collect(Collectors.toUnmodifiableMap(v -> "id", Integer::intValue));
    }
}

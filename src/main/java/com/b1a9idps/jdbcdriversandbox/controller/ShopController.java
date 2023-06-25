package com.b1a9idps.jdbcdriversandbox.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.jdbcdriversandbox.service.ShopService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/shops")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @PostMapping
    public Map<String, Integer> create() {
        var id = shopService.create();
        return Map.of("id", id);
    }
}

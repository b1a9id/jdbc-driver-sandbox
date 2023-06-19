package com.b1a9idps.jdbcdriversandbox;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.b1a9idps.jdbcdriversandbox.service.ShopService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Runner implements ApplicationRunner {

    private final ShopService shopService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            shopService.create();
        }
    }
}

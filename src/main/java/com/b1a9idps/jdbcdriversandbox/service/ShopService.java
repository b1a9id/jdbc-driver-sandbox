package com.b1a9idps.jdbcdriversandbox.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.b1a9idps.jdbcdriversandbox.entity.Shop;
import com.b1a9idps.jdbcdriversandbox.repository.ShopRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    @Transactional
    public void create() {
        var shop = shopRepository.save(new Shop("shop-name"));
        log.info("saved shop.(id = {})", shop.getId());
    }

}

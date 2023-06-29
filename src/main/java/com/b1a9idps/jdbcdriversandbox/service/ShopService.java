package com.b1a9idps.jdbcdriversandbox.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.b1a9idps.jdbcdriversandbox.entity.Shop;
import com.b1a9idps.jdbcdriversandbox.repository.ShopRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    @Transactional
    public Integer create() {
        var shop = shopRepository.save(new Shop("shop-name"));
        return shop.getId();
    }

    @Transactional(readOnly = true)
    public List<Integer> list() {
        return shopRepository.findAll(Pageable.ofSize(10)).stream()
                .map(Shop::getId)
                .toList();
    }

}

package com.cloneproject.teslaclone.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ItemContoller {

    @GetMapping(value = "/shop/item/new")
    public String itemForm() {
        return "페이지 설정";
    }
}

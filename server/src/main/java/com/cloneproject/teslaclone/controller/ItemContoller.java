package com.cloneproject.teslaclone.controller;

import org.springframework.ui.Model;
import com.cloneproject.teslaclone.dto.ItemFormDto;
import org.springframework.web.bind.annotation.GetMapping;

public class ItemContoller {

    @GetMapping(value = "/shop/item/new")
//    public String itemForm() {
//        return "페이지 설정";
//    }
    public String itemForm(Model model){
        model.addAttribute("itemFormDto", new ItemFormDto());
        return "item/itemForm";
    }
}

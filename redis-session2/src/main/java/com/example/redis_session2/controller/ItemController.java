package com.example.redis_session2.controller;

import com.example.redis_session2.services.ItemService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/")
    public ArrayList<String> getAllItems() {
        return itemService.getItems();
    }
}

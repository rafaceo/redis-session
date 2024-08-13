package com.example.redis_session1.controller;

import com.example.redis_session1.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/")
    public ArrayList<String> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping()
    public void addItems(@RequestBody String name){
        itemService.addItem(name);
    }
}

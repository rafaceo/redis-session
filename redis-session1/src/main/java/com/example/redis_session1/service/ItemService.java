package com.example.redis_session1.service;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final HttpSession httpSession;

    public ArrayList<String> getAllItems() {
        ArrayList<String> items =(ArrayList<String>) httpSession.getAttribute("My-literally");
        if(!Objects.isNull(items)) {
            return items;
        }
        return new ArrayList<>();
    }

    public void addItem(String item) {
        ArrayList<String> listOfItems = getAllItems();
        listOfItems.add(item);
        httpSession.setAttribute("My-literally", listOfItems);
    }
}

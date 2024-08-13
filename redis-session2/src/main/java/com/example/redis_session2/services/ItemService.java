package com.example.redis_session2.services;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final HttpSession httpSession;

    public ArrayList<String> getItems(){
        ArrayList<String> items = (ArrayList<String>) httpSession.getAttribute("My-literally");
        if(!Objects.isNull(items)){
            return items;
        }
        return new ArrayList<>();
    }

    public void setItems(String items){
        ArrayList<String> item = getItems();
        item.add(items);
        httpSession.setAttribute("items", item);
    }


}

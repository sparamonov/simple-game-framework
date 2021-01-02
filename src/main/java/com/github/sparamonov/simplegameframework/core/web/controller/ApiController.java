package com.github.sparamonov.simplegameframework.core.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/rooms")
    public List<Map<String, String>> getRooms() {
        List<Map<String, String>> rooms = new ArrayList<>();
        Map<String, String> room1 = new HashMap<>();
        room1.put("id", "1");
        room1.put("name", "room1");
        Map<String, String> room2 = new HashMap<>();
        room2.put("id", "2");
        room2.put("name", "room2");
        rooms.add(room1);
        rooms.add(room2);
        return rooms;
    }


}

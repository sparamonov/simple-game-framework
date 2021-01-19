package com.github.sparamonov.simplegameframework.core.web.controller;

import com.github.sparamonov.simplegameframework.core.domain.Room;
import com.github.sparamonov.simplegameframework.core.service.GameService;
import com.github.sparamonov.simplegameframework.core.service.UserService;
import com.github.sparamonov.simplegameframework.core.web.dto.RoomData;
import com.github.sparamonov.simplegameframework.core.web.dto.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final UserService userService;

    private final GameService gameService;

    @PostMapping("/user/save")
    public UserData saveUser(@RequestHeader(value = "x-user-id", required = false) UUID userId,
                             @Valid @RequestBody UserData request) {

        if (userId != null) {
            throw new RuntimeException("Not implemented yet");
        }
        return UserData.of(userService.createUser(request.getName()));
    }

    @GetMapping("/rooms")
    public List<RoomData> getRooms(@RequestHeader("x-user-id") UUID userId) {

        return userService.getUserRooms(userId).stream()
                .map(RoomData::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/room")
    public RoomData getRoom(@RequestHeader("x-user-id") UUID userId, @RequestParam("id") UUID roomId) {
        Room room = userService.getRoom(userId, roomId);
        return RoomData.of(room, gameService.getRoomGames(room));
    }

    @PostMapping("/rooms/save")
    public RoomData saveRoom(@RequestHeader("x-user-id") UUID userId, @Valid @RequestBody RoomData request) {

        if (StringUtils.hasText(request.getId())) {
            throw new RuntimeException("Not implemented yet");
        }
        return RoomData.of(userService.createRoom(userId, request.getName()));
    }
}

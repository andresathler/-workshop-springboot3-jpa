package com.educandoweb.course.controller;

import com.educandoweb.course.model.user.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @GetMapping(value="/findAll")
    public ResponseEntity<UserEntity> findAll() {
        UserEntity u = new UserEntity(1L, "M", "m@gmail.com", "999999999", "123");

        return ResponseEntity.ok().body(u);
    }
}

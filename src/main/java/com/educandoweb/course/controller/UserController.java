package com.educandoweb.course.controller;

import com.educandoweb.course.model.user.UserEntity;
import com.educandoweb.course.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/findAll")
    public ResponseEntity<LinkedList<UserEntity>> findAll() {
        List<UserEntity> users = userService.findAll();

        return ResponseEntity.ok().body(new LinkedList<>(users));
    }

    @GetMapping(value="/findUserById/{id}")
    public ResponseEntity<?> findUserById(@PathVariable Long id) {
        UserEntity user = userService.findUserById(id);

        if(user == null) return ResponseEntity.badRequest().body("Usuario não encontrado");

        return ResponseEntity.ok().body(user);
    }
}

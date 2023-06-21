package com.softdebugs.javapracticemodule.controller;

import com.softdebugs.javapracticemodule.entity.UserInfo;
import com.softdebugs.javapracticemodule.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/create/user")
    public ResponseEntity<UserInfo> response(@RequestBody UserInfo user) {
        return ResponseEntity.ok(userService.saveUser(user));

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Integer> getById(@PathVariable int id) {
        return ResponseEntity.ok(userService.getById(id));
    }
}

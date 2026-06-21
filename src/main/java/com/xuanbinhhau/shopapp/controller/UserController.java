package com.xuanbinhhau.shopapp.controller;

import com.xuanbinhhau.shopapp.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("${server.servlet.context-path}/users")
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body("Creater account successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body("This is token");
    }
}

package org.cripsy.authenticationservice.controller;

import org.cripsy.authenticationservice.dto.UsersDTO;
import org.cripsy.authenticationservice.model.Users;
import org.cripsy.authenticationservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public Users signup(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Users user) {it add
        return userService.verifyUser(user);
    }
}

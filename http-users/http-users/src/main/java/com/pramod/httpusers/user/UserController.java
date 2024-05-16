package com.pramod.httpusers.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserHttpClient client;

    public UserController(UserHttpClient client){
        this.client=client;
    }
    @GetMapping("")
    List<User> findAll(){
        return client.findAll();
    }
    @GetMapping("/{id}")
    User findById(@PathVariable Integer id){
        return client.findById(id);
    }
}

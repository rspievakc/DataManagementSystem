package uk.co.rspievakc.springcassandrademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.co.rspievakc.springcassandrademo.domain.User;
import uk.co.rspievakc.springcassandrademo.service.UserService;

import java.util.List;

@RestController("/items")
public class Controller {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public List<User> get() {
        return null;
    }

    @PostMapping("/")
    public @ResponseBody List<User> save(User entity) {
        return null;
    }

    @PutMapping("/")
    public List<User> update(User entity) {
        return null;
    }

    @DeleteMapping("/")
    public List<User> delete(User entity) {
        return null;
    }
}

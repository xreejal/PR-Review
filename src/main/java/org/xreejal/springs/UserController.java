package org.xreejal.springs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers(@RequestParam(defaultValue = "10") Integer X) {

        if (X == null) {
            X = 10;
        }

        List<User> users = new ArrayList<>();

        for (int i = 0; i < X; i++) {
            users.add(new User("meow", i, "3324234"));
        }

        return users;
    }
}
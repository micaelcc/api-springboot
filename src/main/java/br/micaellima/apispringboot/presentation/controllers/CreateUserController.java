package br.micaellima.apispringboot.presentation.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.micaellima.apispringboot.domain.User;
import br.micaellima.apispringboot.usecases.CreateUser;

@RestController
public class CreateUserController {
    private final CreateUser createUser;
    
    public CreateUserController(CreateUser createUser) {
        this.createUser = createUser;
    }
    
    @PostMapping(value = "/api/users")
    public User handle(@RequestBody User user) {
        return createUser.execute(user);
    }
}

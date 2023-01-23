package br.micaellima.apispringboot.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.micaellima.apispringboot.domain.User;
import br.micaellima.apispringboot.usecases.ListUser;

@RestController
public class ListUserController {
    private final ListUser listUser;
    
    public ListUserController(ListUser listUser) {
        this.listUser = listUser;
    }

    @GetMapping(value = "/api/users")
    public List<User> handle() {
        return listUser.execute();
    }
}

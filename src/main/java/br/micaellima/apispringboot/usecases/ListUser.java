package br.micaellima.apispringboot.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.micaellima.apispringboot.domain.User;
import br.micaellima.apispringboot.domain.UserRepository;
import br.micaellima.apispringboot.infra.database.repositories.UserRepositoryJpa;

@Service
@Transactional
public class ListUser {
    private final UserRepository userRepository;
    
    @Autowired
    public ListUser(final UserRepositoryJpa userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }
}

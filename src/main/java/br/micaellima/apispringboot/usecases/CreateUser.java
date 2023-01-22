package br.micaellima.apispringboot.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.micaellima.apispringboot.domain.User;
import br.micaellima.apispringboot.domain.UserRepository;
import br.micaellima.apispringboot.infra.database.repositories.UserRepositoryJpa;

@Service
@Transactional
public class CreateUser {
    private final UserRepository userRepository;
    
    @Autowired
    public CreateUser(final UserRepositoryJpa userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return userRepository.save(user);
    }
}

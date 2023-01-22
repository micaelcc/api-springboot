package br.micaellima.apispringboot.infra.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.micaellima.apispringboot.domain.User;
import br.micaellima.apispringboot.domain.UserRepository;

public interface UserRepositoryJpa extends JpaRepository<User, Long>, UserRepository {
}

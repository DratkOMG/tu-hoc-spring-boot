package ru.itis.tuhocspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.itis.tuhocspringboot.models.User;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);

    User findByEmail(String email);
}

package com.vladimirpandurov.springbootblogapp.repository;

import com.vladimirpandurov.springbootblogapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

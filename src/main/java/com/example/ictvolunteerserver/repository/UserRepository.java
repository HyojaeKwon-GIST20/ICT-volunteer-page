package com.example.ictvolunteerserver.repository;

import com.example.ictvolunteerserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

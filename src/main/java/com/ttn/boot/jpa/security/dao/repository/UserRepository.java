package com.ttn.boot.jpa.security.dao.repository;

import com.ttn.boot.jpa.security.dao.entity.Role;
import com.ttn.boot.jpa.security.dao.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findByUserName(String userName);
}

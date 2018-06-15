package com.ttn.boot.jpa.security.service;

import com.ttn.boot.jpa.security.dao.entity.CustomUserDetails;
import com.ttn.boot.jpa.security.dao.entity.Users;
import com.ttn.boot.jpa.security.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users =  userRepository.findByUserName(username);
        CustomUserDetails customUserDetails = new CustomUserDetails(users);
        return customUserDetails;
    }

}

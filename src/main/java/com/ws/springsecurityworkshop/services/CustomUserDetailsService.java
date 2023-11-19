package com.ws.springsecurityworkshop.services;

import com.ws.springsecurityworkshop.entities.CustomUser;
import com.ws.springsecurityworkshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {

        CustomUser user = userRepository.findByEmail(username);

        if(user == null) {
            throw new UsernameNotFoundException("No user found with provided email");
        }

        return user;

    }
}

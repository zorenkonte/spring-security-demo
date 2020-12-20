package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customService")
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        var user = userService.findByUsername(name);

        user.orElseThrow(() -> new UsernameNotFoundException(String.format("User not found : %s", name)));

        return user.map(CustomUserDetails::new).get();
    }
}

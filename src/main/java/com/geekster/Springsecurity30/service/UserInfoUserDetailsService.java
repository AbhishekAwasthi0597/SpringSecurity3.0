package com.geekster.Springsecurity30.service;

import com.geekster.Springsecurity30.entity.UserInfo;
import com.geekster.Springsecurity30.repo.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class  UserInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoRepo userInfoRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userInfo= Optional.ofNullable(userInfoRepo.findByName(username));
        return userInfo.map(UserInfoUserDetails::new).orElseThrow(()->new UsernameNotFoundException("user not found"));
    }
}

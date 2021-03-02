package com.hzy.gpspringbootfreemarker.service.impl;

import com.hzy.gpspringbootfreemarker.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Aauthor zhengyang.hu
 * @Date 2021/3/2
 **/
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String password = "$2a$10$n45esCN.DpQw3h5Du03MQuXSt/La2qgkV8WGiJiilVUOzLBzT7ZOe";
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority("USER1"));
        UserDetails userDetails = new User(s, password, list);
        return userDetails;
    }

}

package com.poc.rolesadmin.services;



import com.poc.rolesadmin.model.AC_Users;
import com.poc.rolesadmin.model.UserExtension;
import com.poc.rolesadmin.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserService implements UserDetailsService {

    @Autowired
    private UserDAO userDao;

//    @Autowired
//    private PasswordEncoder bcryptEncoder;

    @Override
    public UserExtension loadUserByUsername(String userName) throws UsernameNotFoundException {
        AC_Users user = new AC_Users();
        user = userDao.findByUsername(userName);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
        UserExtension jwtUserExtension= new UserExtension(user.getUsername(), user.getPassword(), new ArrayList<>());
        jwtUserExtension.setUserId(user.getUserId());
        return jwtUserExtension;
    }
}
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.dao.UsersDAO;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UsersDAO usersDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users appUser = this.usersDAO.findUserAccount(userName);

        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User "
                    + userName + " was not found in the database");
        }

        System.out.println("Found User: " + appUser);

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

        UserDetails userDetails = (UserDetails) new User(appUser.getEmail(), //
                appUser.getPassword(), grantList);

///////////////////
//        UserDetails userDetailsImpl = (UserDetails) org.springframework.security.core.context.SecurityContextHolder
//                .getContext().getAuthentication().getPrincipal();
//
//        String first_name = userDetailsImpl.getAuthorities();
//        String field... = userDetailsImpl.getField();..
///////////////////

        return userDetails;
    }
}

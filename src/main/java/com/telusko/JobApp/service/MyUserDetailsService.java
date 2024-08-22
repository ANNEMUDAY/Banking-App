package com.telusko.JobApp.service;



import com.telusko.JobApp.model.User;
import com.telusko.JobApp.model.UserPrincipal;
import com.telusko.JobApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user= repo.findByUsername(username);

        if (user==null) {
            System.out.println("404 : User Details not found ,Please SignUp");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }

}
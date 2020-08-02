//package com.yashuLearns.LearningProject.service;
//
//import com.yashuLearns.LearningProject.dao.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Optional;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        Optional<User> user = userRepository.findByUsername(username);
////        user.orElseThrow(()->new UsernameNotFoundException(" not found "+s));
////        return user.map(MyUserDetails::new).get();
//
//        return new User("user","user", new ArrayList<>());
//    }
//}

//package com.yashuLearns.LearningProject.controller;
//
//import com.yashuLearns.LearningProject.model.AuthenticationRequest;
//import com.yashuLearns.LearningProject.model.AuthenticationResponse;
//import com.yashuLearns.LearningProject.util.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Autowired
//    JwtUtil jwtUtil;
//
//    @GetMapping("/")
//    public String home() {
//        return "welcome home";
//    }
////    @GetMapping("/user")
////    public String user()
////    {
////        return "welcome user";
////    }
////
////    @GetMapping("/admin")
////    public String admin()
////    {
////        return "welcome admin";
////    }
//
//    @PostMapping("/authentiate")
//    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
//        } catch (BadCredentialsException badcredenticalException) {
//            throw new Exception("Incorrect username and password", badcredenticalException);
//        }
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//        final String jwt=jwtUtil.generateToken(userDetails);
//        System.out.println(jwt);
//        return ResponseEntity.ok(new AuthenticationResponse(jwt));
//    }
//}

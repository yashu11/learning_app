//package com.yashuLearns.LearningProject.filters;
//
//import com.yashuLearns.LearningProject.service.MyUserDetailsService;
//import com.yashuLearns.LearningProject.util.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class JWTAuthenticationTokenFilter extends OncePerRequestFilter {
//    @Autowired
//    private MyUserDetailsService userDetailsService;
//    @Autowired
//    JwtUtil jwtUtil;
//
//    @Override
//    protected void doFilterInternal
//            (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
//            throws ServletException, IOException {
//        String username = null;
//        String jwt = null;
//        final String authorizationHeader = httpServletRequest.getHeader("Authorization");
//        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//            jwt = authorizationHeader.substring(7);
//            username = jwtUtil.extractUsername(jwt);
//        }
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() != null) {
//            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//            if (jwtUtil.validateToken(jwt, userDetails)) {
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//
//            }
//        }
//        filterChain.doFilter(httpServletRequest, httpServletResponse);
//    }
//}

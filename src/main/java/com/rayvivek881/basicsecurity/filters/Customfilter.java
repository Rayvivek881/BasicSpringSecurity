package com.rayvivek881.basicsecurity.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class Customfilter extends OncePerRequestFilter {

  private final AuthenticationManager authenticationManager;

  @Override
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res,
                                  FilterChain chain) throws ServletException, IOException {
    var uname = req.getHeader("uname");
    var pwd = req.getHeader("password");
    UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(uname, pwd);
    Authentication auth =  authenticationManager.authenticate(token);
    SecurityContextHolder.getContext().setAuthentication(auth);
    chain.doFilter(req, res);
  }

}

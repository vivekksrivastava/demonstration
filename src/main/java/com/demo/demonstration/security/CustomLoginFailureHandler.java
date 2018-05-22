package com.demo.demonstration.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

@Configuration
public class CustomLoginFailureHandler implements AuthenticationFailureHandler {

	 private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
	/*	String message = "";

		if(exception.getClass() == UsernameNotFoundException.class) {
			message = "cannot find a user";
		} else if(exception.getClass() == BadCredentialsException.class) {
			message = "check your password";
		}
		System.out.println("Inside handler");*/
		request.setAttribute("exception", exception);
		 redirectStrategy.sendRedirect(request, response, "/error?msg=Bad Credentials");

	}

}

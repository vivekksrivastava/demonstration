package com.demo.demonstration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demo.demonstration.model.Users;
import com.demo.demonstration.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class MainClass implements CommandLineRunner
{
	
	@Autowired
	UserServiceImpl usi;
	
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        SpringApplication.run(MainClass.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Not Implementing anything from command line runner");
	}
	@PostConstruct
	public void abcd()
	{
		Users user1 = new Users("abc123", "abc", "a@hcl.com", "ROLE_admin", 1);
		Users user2 = new Users("bcd123", "bcd", "b@hcl.com", "ROLE_user", 1);
		System.out.println("saving user1");
		usi.saveUser(user1);
		System.out.println("saving user2");
		usi.saveUser(user2);
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
}

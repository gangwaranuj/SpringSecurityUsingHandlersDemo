package com.thinksys.security.serviceImpl;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.thinksys.security.model.User;


@Service
public class UserDetailsServiceImpl
implements UserDetailsService,com.thinksys.security.service.UserDetailsService
{
	@Autowired
	Properties myProperties;
//	@Autowired 	JavaMailSender mailSender;



	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User user =new User();
		user.setUsername("anuj");
		user.setPassword("anuj");
		
		return  (UserDetails)user;
	}



	
}
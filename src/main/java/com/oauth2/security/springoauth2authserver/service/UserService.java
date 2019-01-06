package com.oauth2.security.springoauth2authserver.service;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.oauth2.security.springoauth2authserver.model.User;
import com.oauth2.security.springoauth2authserver.repository.UsersRepository;




@Service ("UserService")
public class UserService implements UserDetailsService  {
	
	
	
	@Autowired
    private UsersRepository userRepository ;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
/*
	TO TEST 
	@PostConstruct
	public void creataNewUsers()

	{
		
		User user = new User();
		user.setUsername("tawfik");
		user.setPasword(bCryptPasswordEncoder.encode("123"));
		user.setEnabled(true);
		userRepository.save(user);
		
		User user1 = new User();
		user1.setUsername("amir");
		user1.setPasword(bCryptPasswordEncoder.encode("546"));
		user1.setEnabled(true);
		userRepository.save(user1);
	}
	
*/
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepository.findByUsername(username);
		if (user == null )
		{
			throw new UsernameNotFoundException("invalid username or password");
		}
		return new org.springframework.security.core.userdetails.User(
				
				user.getUsername(),
				user.getPasword(),
				Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"))
				
				);
				
	}
	
	

}

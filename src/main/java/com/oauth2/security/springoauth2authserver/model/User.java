package com.oauth2.security.springoauth2authserver.model;

import javax.persistence.*;

@Entity 
@Table (name="user")
public class User {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
		private int id;
	   
	   @Column(name = "username")
		private String username;
	   
	   @Column(name = "password")
		private String password;
	   
	   @Column(name = "enabled")
		private Boolean enabled;
	
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return password;
	}
	public void setPasword(String password) {
		this.password = password;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}

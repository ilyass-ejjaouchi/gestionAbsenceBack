package com.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String roles = "";
    private String permissions = "";
    @ManyToMany
    List<User> users ;
	public Role(String roles, String permissions) {
		super();
		this.roles = roles;
		this.permissions = permissions;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
  
}

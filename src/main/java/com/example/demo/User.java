package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "useraop")
public class User {
	
	@Id
	Integer id;
	
	String title;
	Boolean completed;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public User(Integer id, String title, Boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	
	public User() {}
	
}
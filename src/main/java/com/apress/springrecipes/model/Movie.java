package com.apress.springrecipes.model;

public class Movie {
	private String name; 
	public Movie(String string, int i) {
		this.name = string; 
		this.score = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	private Integer score ; 
	
	
}

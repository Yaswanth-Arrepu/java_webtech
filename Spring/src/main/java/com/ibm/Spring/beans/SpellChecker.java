package com.ibm.Spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	public SpellChecker() {
		System.out.println("Inside spell checker constructor.");
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void CheckSpelling() {
		System.out.println("Inside checkSpelling.");
	}
	
}
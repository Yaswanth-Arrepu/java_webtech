package com.ibm.Spring.beans;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("Inside TextEditor Constructor.");
		this.spellChecker = spellChecker;
	}

	public TextEditor() {
		super();
		System.out.println("Inside TextEditor no-args Constructor.");
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.CheckSpelling();
	}
	
	public void init() {
		System.out.println("Text Editor Initialized");
	}
	
	public void destroy() {
		System.out.println("Text Editor Destroyed");
	}

}
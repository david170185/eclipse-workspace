package com.mega.mvc37.test;

public class TV {
	int ch;
	String color;
	
	public TV(int ch, String color) {
		super();
		this.ch = ch;
		this.color = color;
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", color=" + color + "]";
	}
	
	
}

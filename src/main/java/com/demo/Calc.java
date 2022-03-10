package com.demo;

public class Calc {
	
	public int add(int i, int j) {
		return i+j;
	}
	public String convertCase(String s) {
		String temp="";
		for(int i = 0; i<s.length();i++) {
			int x = s.charAt(i);
			x=x-32;
			temp = temp+ (char)x;
		}
		return temp;
	}
}

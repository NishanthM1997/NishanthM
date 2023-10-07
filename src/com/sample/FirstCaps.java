package com.sample;

public class FirstCaps {
	
	public static void main(String[] args) {
		
		String s="hi anitha how are you";
		
		String res=" ";
		
		String[] sp = s.split(" ");
		
		for (String word : sp) {
			char first = word.charAt(0);
			char firstLetter = Character.toUpperCase(first);
			String rem = word.substring(1);
			res=res + firstLetter + rem+" ";
		}
		
		System.out.println(res.trim());
	}
}
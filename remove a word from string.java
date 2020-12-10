package com.mfg.beginner;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.Scanner;
 public class Client{
	 
	 public static String remove(String str, String word) {
		 if(str.contains(word)) {
			 String new_word = word + " ";
			 str = str.replaceAll(new_word, " ");
			 new_word = " "+ word;
			 str= str.replaceAll(new_word, " ");
			
		 }
		 return str;
	 }
	 
	 public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Enter your string -    ");
		 String str1 = reader.nextLine();
		 System.out.println("Enter the word you want to remove -   ");
		 String word1 = reader.nextLine();
		 System.out.println(remove(str1,word1));
		 
	 }
 }
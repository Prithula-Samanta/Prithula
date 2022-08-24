/*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
 depending on the user input. If the user input is not a letter (between a and z or A and Z), print an error message
*/



package com.loop.java;
import java .util.Scanner;
public class VowelsCons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    char ch;
	    System.out.println("Enter An Alphabet : ");
	    ch=sc.next().charAt(0);
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
	    	
	    	System.out.println(ch+ " This is vowel");
	    }
	    else if((ch>='a'&&ch<='z') ||(ch>='A'&&ch<='Z')){
	    	
	    	System.out.println(ch+ " This is Consonent");

	    	}
	    else {
	    	System.out.println(" You entered worng input.");
	    }
	    
		}
	}



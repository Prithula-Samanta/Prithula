/*
 * Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.
 */
package com.exception;
import java.util.Scanner;


public class MainBookLIb {
	public static void qestion(String str[],String bookName,int size) throws BookNotFoundException {
		int i, flag=0;
		for(i=0;i<size;i++) {
			if(bookName.equals(str[i])) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==1)
		{
			System.out.println(" Yes this book is present on this Library ");

			}
			else {
				throw new BookNotFoundException("This book is not avaliable");

			}
		
	}
	public static void main(String args[]) {
		String str[]= {"Physics","Chemistry","Math","CS","Biology"};
		int size=str.length;
		System.out.println(" Library have : ");
		for(String val:str) {
			System.out.println(val);

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the book name : ");
		String bname=sc.nextLine();

		try {
			MainBookLIb.qestion(str,bname,size);
		}
		catch(BookNotFoundException ec) {
			System.out.println(ec.getMessage());

		}
	}

}


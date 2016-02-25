package com.itech.librarymanagement.Main;


import java.util.Scanner;

import com.itech.librarymanagement.domain.Books;
import com.itech.librarymanagement.domain.User;
import com.itech.librarymanagement.services.BookServiceImplementation;
import com.itech.librarymanagement.services.BookServiceInterface;
import com.itech.librarymanagement.services.UserServiceImplementation;
import com.itech.librarymanagement.services.UserServiceInterface;

public class Execution {
	private static Scanner sc;

	public static void main(String []args) throws Exception
	{
		Menu menu=new Menu();
		
		sc = new Scanner(System.in);
		int  input=sc.nextInt();
		 switch(input)
		 {
		 case 1:UserServiceInterface userserviceinterface=new UserServiceImplementation();
		 
                User user =new User();
                userserviceinterface.addUser(user);
     			userserviceinterface.addUser(user);
     			 System.out.println("hello");
     			break;

		 case 2:
			 BookServiceInterface bookserviceinterface=new BookServiceImplementation();
			 Books book =new Books();
             System.out.println("Enter the book name");
			 Scanner bookname=new Scanner(System.in);
			 String bookName=bookname.nextLine();
		     book.setBookName(bookName);
		     System.out.println("Enter the name of the author");
		     Scanner authorname=new Scanner(System.in);
		     String author=authorname.nextLine();
		     book.setAuthor(author);
		     System.out.println("Enter the book name");
			 Scanner booktitle=new Scanner(System.in);
			 String bookTitle=booktitle.nextLine();
		     book.setBookName(bookTitle);
		     bookserviceinterface.addBook(book);
		    break;
		 case 3:UserServiceInterface userserviceinterface2=new UserServiceImplementation();
		        User userd=new User();
		         System.out.println("Enter the user Id");
		         Scanner userIdi=new Scanner(System.in);
				 String userid1=userIdi.nextLine();
			     userd.setUserid(userid1);
			     userserviceinterface2.deleteUser(userd);
			    
                 break;
			 
		 case 4:
			 BookServiceInterface bookserviceinterface1=new BookServiceImplementation();
	         User user1=new User();
	         System.out.println("Enter the user Id");
	         Scanner userId=new Scanner(System.in);
			 String userid=userId.nextLine();
		     user1.setUserid(userid);
		     bookserviceinterface1.removeBook(user1);
		     break;
		 case 5:UserServiceInterface userserviceinterface3=new UserServiceImplementation();
		        User usera=new User();
		        System.out.println("Enter the user Id");
		         Scanner userIda=new Scanner(System.in);
				 String userid2=userIda.nextLine();
			     usera.setUserid(userid2);
			     userserviceinterface3.addavailablebooks(usera);
			     break;
		 case 6:
			 UserServiceInterface userserviceinterface4=new UserServiceImplementation();
		        User usere=new User();
		        System.out.println("Enter the user Id");
		         Scanner userIde=new Scanner(System.in);
				 String userid3=userIde.nextLine();
			     usere.setUserid(userid3);
			     userserviceinterface4.addissuebook(usere);

		 }
	
	}

}

package com.itech.librarymanagement.services;

import java.util.Scanner;

import com.itech.librarymanagement.Database.Db_Util_Library;
import com.itech.librarymanagement.domain.User;

public class UserServiceImplementation implements UserServiceInterface  {

	public UserServiceImplementation() throws Exception
	{
		Db_Util_Library.connectDB();
	}
	
	@Override
	public void addUser(User user) { 
		String sql="insert into user(name,contact,address,email)values('"+user.getName() +"','"+user.getContact()+"','"+user.getAddresss()+"','"+user.getEmail()+"')";
			User user1=new User();
 			System.out.println("Enter your name");
 			Scanner name1=new Scanner(System.in);
 			String name=name1.nextLine();
		    user1.setName(name);   
		    System.out.println("Enter your address");
		    Scanner add=new Scanner(System.in);
 			String address=add.nextLine();
 			user1.setAddresss(address);
 			System.out.println("Enter your conatact no.");
 			Scanner conc=new Scanner(System.in);	
 			String contact=conc.nextLine();
 			user1.setContact(contact);
 			System.out.println("Enter your email id");
 			Scanner email1=new Scanner(System.in);
 			String email=email1.nextLine();
 			user1.setEmail(email);	
 			try {
			Db_Util_Library.update(sql);
			System.out.println("user data updated succesfully ");
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
		}

	@Override
	public void deleteUser(User user) {
		String sql="delete from user where='"+user.getUserid()+"'";
		try {
			Db_Util_Library.update(sql);
			System.out.println("user data deleted succesfully ");
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
		}
	@Override
	public void addavailablebooks(User user) {
		String sql="Select from user where user_id='"+user.getUserid()+"'set availablebooks='1'";
		
	}
	@Override
	public void addissuebook(User user) {
		
		
	}
	
	}


package com.itech.librarymanagement.services;


import com.itech.librarymanagement.Database.Db_Util_Library;
import com.itech.librarymanagement.domain.Books;
import com.itech.librarymanagement.domain.User;

public class BookServiceImplementation implements BookServiceInterface {
	
	public BookServiceImplementation() throws Exception
	{
		Db_Util_Library.connectDB();
	}
	public void addBook(Books books) {
		
		String sql="insert into book(title,author,book)values('"+books.getTitle()+"','"+books.getAuthor()+"','"+books.getBookName()+"')";
	     try {
			Db_Util_Library.update(sql);
			System.out.println("Book issued succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeBook(User user) {
		String sql="delete from book where user_id='"+user.getUserid()+"'";
		try {
			Db_Util_Library.update(sql);
			System.out.println("Book removed succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getAllAvailableBook(Books books) {
		// TODO Auto-generated method stub
		
	}
	

}

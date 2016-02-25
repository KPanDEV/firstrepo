package com.itech.librarymanagement.services;



import com.itech.librarymanagement.domain.Books;
import com.itech.librarymanagement.domain.User;

public interface BookServiceInterface {
	public void removeBook(User user);
	public void getAllAvailableBook(Books books);
	public void addBook(Books books);

}

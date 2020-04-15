package com.capgemini.client;

import com.capgemini.entities.Author;
import com.capgemini.service.AuthorService;
import com.capgemini.service.AuthorServiceImp;

public class Client {
	public static void main(String ar[])
	{
		AuthorService authorservice=new AuthorServiceImp();
		
		Author author=new Author();
		author.setAuthorId(1);
		author.setAuthorFirstName("Rohit");
		author.setAuthorLastName("Kumar");
		author.setAuthorPhoneNumber("1234567890");
		authorservice.addAuthor(author);
		
		Author author2=new Author();
		author2.setAuthorId(2);
		author2.setAuthorFirstName("Rohit");
		author2.setAuthorLastName("Sinha");
		author2.setAuthorPhoneNumber("1234561230");
		authorservice.addAuthor(author);
		
		System.out.println(authorservice.findAuthorById(1));
		author.setAuthorPhoneNumber("678954327878");
		authorservice.updateAuthor(authorservice);
		
		
		System.out.println(authorservice.findAuthorById(1));
		authorservice.removeAuthor(author2);
		
	}

}

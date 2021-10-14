package com.neosoft.sessiontasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookListSearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<Books> books = new ArrayList<Books>();
		Scanner b = new Scanner(System.in);
		
		while(true) {
			System.out.print("Choose : \n 1. Add book \n 2. View Books : \n 3. Search Book:");
			int choice = b.nextInt();
			
			
			if(choice == 1) {
				System.out.print("Enter No. of books you want to add : ");
				int no = b.nextInt();
				for(int i=0;i<no;i++) {
					System.out.print("Enter Book Id : ");
					int bookId = b.nextInt();
					b.nextLine();
					System.out.print("Enter Book Name : ");
					String bookName = b.nextLine();
				
					System.out.print("Enter Book Author name : ");
					String bookAuthor = b.nextLine();
					
					System.out.println("Enter Book Price : ");
					int bookPrice = b.nextInt();
					
					books.add(new Books(bookId,bookName,bookAuthor,bookPrice));
					System.out.println("------------------------");
					
				}
				
			}
			else if(choice == 2) {
				/*
				 * Iterator<Books> itr = books.iterator(); while (itr.hasNext()) { Books book =
				 * itr.next(); System.out.println(books); }
				 */
				System.out.println(books);
			}
			else if(choice == 3) {
				System.out.println("Search By : ");
				System.out.println("1. ID : \n 2. Name : \n 3. Author : \n 4. Price : ");
				System.out.println("Enter Choice : ");
				int search = b.nextInt();
				switch(search) {
				case 1:
					System.out.print("Enter ID : ");
					int id = b.nextInt();
					for(Books book : books) {
						if(books.contains(id)) {
							System.out.println(books);
						}
						else {
							System.out.println("Book Not Found!");
						}
					}
					
				}
			}
			else  {
				System.out.println("Invalid choice!");
			}
		}
	
	
		
		
	}

}


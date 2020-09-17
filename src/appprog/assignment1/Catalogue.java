/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appprog.assignment1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hanisamohamed
 */
public class Catalogue {
    private Library library;
		private List<Book> booksOnShelf;
		private List<Book> booksOnLoan;
		private List<Genre> genres;
		private List<Author> authors;
		// write your solution below

		public Catalogue(Library library){
			this.library = library;
			booksOnShelf = new ArrayList<Book>();
			booksOnLoan = new ArrayList<Book>();
			genres = new ArrayList<Genre>();
			authors = new ArrayList<Author>();

		}


		public void use(){
			menu();
			String input;
			while (!(input=readInput()).equals("R")){
				switch(input){
					case "1":
						displayBooks();
						return;
					case "2":
						break;
					case "3":
						break;
					case "4":
						break;
					case "5":
                                            displayAllAuthors();
						break;
					case "6":
						break;
					case "7":
                                            borrowBook();
						break;
					case "8":
						break;
					case "9":
						break;
					default:
						menu();

				}

			}
			library.use();


		}
                
                public void borrowBook(){
                    // add to Patrons currently borrwed and borrowhistory
                    // add to list of book on loan
                }

                
                void displayAllAuthors() {
                    System.out.println("The following authors have books in this Library:");
                    for (Author author: authors){
                        System.out.println(author);
                    }
                }
                
		void displayBooks(){
			System.out.println("The Library has the following books:");
			for(Book book: booksOnShelf){
				System.out.println(book);
			}
			use();
		}

		private String readInput(){
			System.out.print("Enter a choice: ");
			String input = In.nextLine();
			return input;

		}

		public void addBookToShelf(Book book){
			booksOnShelf.add(book);
		}

		private void menu(){
			System.out.println("Welcome to the Catalogue! Please make a selection from the menu:");
			System.out.println("1. Display all books.");
			System.out.println("2. Display all available books.");
			System.out.println("3. Display all genres.");
			System.out.println("4. Display books in a genre.");
			System.out.println("5. Display all authors.");
			System.out.println("6. Display all books by an author.");
			System.out.println("7. Borrow a book.");
			System.out.println("8. Return a book.");
			System.out.println("9. Place a hold.");
			System.out.println("R. Return to previous menu.");
		}








}

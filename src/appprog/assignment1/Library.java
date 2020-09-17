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
public class Library {
    private Catalogue catalogue;
    private List<Patron> patrons;
    // write your solution below

    public Library(){
        catalogue = new Catalogue(this);
        patrons = new ArrayList<Patron>();

    }

    public static void main(String[] args){

        Library library = new Library();
        library.use();

	}

    public void use() {
        System.out.println("Welcome to the Library! Please make a selection from the menu:");
        menu();
        String selection;
        while (!(selection=readInput()).equals("X")){
            switch (selection){
                case "1":
                    catalogue.use();
                    return;
                case "2":
                    return;
                case "3":
                    return;
                case "4":
                    adminAccess();
                    return;
                default:
                    menu();
            }
        }
    }


    private String readInput(){
        System.out.print("Enter a choice: ");
        String selection = In.nextLine();
        return selection;
    }

    private void menu(){
        System.out.println("1. Explore the catalogue.");
        System.out.println("2. View your patron record.");
        System.out.println("3. Show you favourite books.");
        System.out.println("4. Enter Admin Mode.");
        System.out.println("X. Exit the system.");

    }




// ------------------ Admin Methods -----------------------

    private void adminAccess(){
        adminMenu();
        String selection;
        while (!(selection=readInput()).equals("R")){
            switch (selection){
                case "1":
                    addPatron();
                    return;
                case "2":
                    break;
                case "3":
                    addBook();
                    return;
                case "4":
                    break;
                default:
                    adminMenu();
            }  
        }
        // Executed when selection=R
        use();
    }


    private void addBook(){
        System.out.println("Adding a new book.");
        System.out.print("Enter the title of the book: ");
        String title = In.nextLine();
        System.out.print("Enter the author's name: ");
        // Creating Author
        String authorString = In.nextLine();
        Author author = new Author(authorString);

        // Creating Genre
        System.out.print("Enter the genre: ");
        String genreString = In.nextLine();
        Genre genre = new Genre(genreString);

        //Creating book
        Book newBook = new Book(title, author, genre);

        //adding book to catalogue
        catalogue.addBookToShelf(newBook);

        System.out.println("Added " + title +" to catalogue.");
         adminAccess();

    }

    private void addPatron(){
        System.out.println("Adding a new patron.");
        System.out.print("Enter a new ID: ");
        int id = In.nextInt();
        System.out.print("Enter the patron's name: ");
        String name = In.nextLine();
        //Creating patron
        Patron newPatron = new Patron(id, name);

        //adding patron to list
        patrons.add(newPatron);

        System.out.println("Patron added.");
        adminAccess();

    }

    
    private void adminMenu(){
        System.out.println("Welcome to the administration menu:");
        System.out.println("1. Add a patron.");
        System.out.println("2. Remove a patron.");
        System.out.println("3. Add a book to the catalogue.");
        System.out.println("4. Remove a book from the catalogue.");
        System.out.println("R. Return to the previous menu.");

    }

    


}

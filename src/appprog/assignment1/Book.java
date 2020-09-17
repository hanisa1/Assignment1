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
public class Book {
    
    private String title;
	private Author author;
	private Genre genre;
	private List<Patron> holds;
	// write your solution below

	public Book(String title, Author author, Genre genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	@Override
	public String toString(){
		return author + ", " + title;
	}
    
}

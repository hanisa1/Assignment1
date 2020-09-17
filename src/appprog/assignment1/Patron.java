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
public class Patron {
    private int ID;
    private String name;
    private List<Book> currentlyBorrowed;
    private List<Book> borrowingHistory;
    // write your solution below

    public Patron(int ID, String name) {
	this.ID = ID;
	this.name = name;
        currentlyBorrowed = new ArrayList<Book>();
        borrowingHistory = new ArrayList<Book>();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appprog.assignment1;

/**
 *
 * @author hanisamohamed
 */
public class Author {
    private String name;
	// write your solution below

	public Author(String name){
		this.name = name;
	}

	@Override
	public String toString(){
		return name;
	}
}

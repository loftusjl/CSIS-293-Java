// File: Tree.java - model the 'general' tree
// Author: Mike Qualls

package simpleInheritance;

public class Tree {
	// instance variables
	private int height;
	private int age;
	
	// methods, constructors first
	public Tree () {
		setHeight (1);
		setAge (1);
	}
	public Tree (int height, int age) {
		setHeight (height);
		setAge (age);
	}
	
	// sets/gets
	public void setHeight (int height) {
		this.height = height;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public int getHeight () {
		return height;
	}
	public int getAge () {
		return age;
	}
	
	// utility
	public void older () {
		this.age++;
	}
	public void grow () {
		this.height++;
	}
	
	public String toString () {
		return String.format ("height: %d, age: %d", getHeight (), getAge ());
	}

}  // end class Tree

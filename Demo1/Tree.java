package demo1;

public class Tree {
	// declare instance variables
	private int height;
	private int age;
	
	// methods
	public Tree () {
		// initialize an object
		this.height = 5;
		this.age = 2;
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
}  // end class Tree

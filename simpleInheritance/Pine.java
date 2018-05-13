<<<<<<< HEAD
// File: Pine.java - model Pine Trees in our simple hierarchy
// Author:  Mike Qualls

package simpleInheritance;

public class Pine extends Tree {
	// instance variables - none here.  Defined at superclass level and shared
	
	// methods - must supply constructors
	public Pine () {
		// implicitly call the no-argument constructor in class Tree
		
	}  // end no-argument constructor
	public Pine (int height, int age) {
		super (height, age);
	}  // end constructor using parameters
	
	// set/gets - none here.  Defined at superclass level and shared
	
	// the toString method for a Pine tree
	public String toString () {
		return String.format ("Pine: %s", super.toString ());
	}

}  // end class Pine
=======
// File: Pine.java - model Pine Trees in our simple hierarchy
// Author:  Mike Qualls

package simpleInheritance;

public class Pine extends Tree {
	// instance variables - none here.  Defined at superclass level and shared
	
	// methods - must supply constructors
	public Pine () {
		// implicitly call the no-argument constructor in class Tree
		
	}  // end no-argument constructor
	public Pine (int height, int age) {
		super (height, age);
	}  // end constructor using parameters
	
	// set/gets - none here.  Defined at superclass level and shared
	
	// the toString method for a Pine tree
	public String toString () {
		return String.format ("Pine: %s", super.toString ());
	}

}  // end class Pine
>>>>>>> 6bb1f4c330632809cb8d2fd272330bf90bc46547

// File: Oak.java - the other tree in our hierarchy
// Author: Mike Qualls

package simpleInheritance;

public class Oak extends Tree  {
	// instance variables - none here.  Defined at superclass level and shared
	
	// methods - must supply constructors
	public Oak () {
		// implicitly call the no-argument constructor in class Tree
		
	}  // end no-argument constructor
	public Oak (int height, int age) {
		super (height, age);
	}  // end constructor using parameters
	
	// set/gets - none here.  Defined at superclass level and shared
	
	// the toString method for a Pine tree
	public String toString () {
		return String.format ("Oak: %s", super.toString ());
	}


}  // end class Oak
// File: Oak.java - the other tree in our hierarchy
// Author: Mike Qualls

package simpleInheritance;

public class Oak extends Tree  {
	// instance variables - none here.  Defined at superclass level and shared
	
	// methods - must supply constructors
	public Oak () {
		// implicitly call the no-argument constructor in class Tree
		
	}  // end no-argument constructor
	public Oak (int height, int age) {
		super (height, age);
	}  // end constructor using parameters
	
	// set/gets - none here.  Defined at superclass level and shared
	
	// the toString method for a Pine tree
	public String toString () {
		return String.format ("Oak: %s", super.toString ());
	}


}  // end class Oak

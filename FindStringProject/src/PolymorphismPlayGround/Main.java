package PolymorphismPlayGround;

public class Main {

	public static void main(String[] args) {

		Mother obj = new child();
		
		//even if you cast the class to mother class still it prints the something method from child
		((Mother)obj).something();
		//the only way to call the mother class soi to use super inside the child given ur object is created by mother = new child

		//passing a subclass object to a method that accepts mother class objects
		Mother obj1 = new child();
		obj1.edgeCase(new child());
		//

	}

}

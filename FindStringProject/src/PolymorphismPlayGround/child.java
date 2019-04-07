package PolymorphismPlayGround;

public class child extends Mother {
	
	@Override
	public void something() {
		System.out.println("inside child");
		super.something();
	}

//	//can't override the method with subclass object signature
//	@Override
//	public void edgeCase(child obj)
//	{
//		System.out.println("edgeCase in child that accepts child object as argument");
//	}
//	//


	//can't override the method with subclass object signature -> mother class function will be called in mother obj = new child settings
	//@Override
	public void edgeCase(child obj)
	{
		System.out.println("edgeCase in child that accepts child object as argument");
	}
	//
	
//this is correct over riding with mother class obkect
//	@Override 
//	public void edgeCase(Mother obj) {
//		System.out.println("inside child class edgecase");
//}
	
}

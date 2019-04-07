package PolymorphismPlayGround;

public class Mother {
	
	public void something () {
		System.out.println("inside mother");
	}
	
	public void edgeCase(Mother obj)
	{
		System.out.println("edgeCase in mother class that accepts mother object as argument");
	}

}

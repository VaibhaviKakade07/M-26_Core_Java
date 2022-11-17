package org.tnsindia.Constructor;

public class Constructor {
	String name;
	int rollno;

	public Constructor(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
		
	}

	public static void main(String[] args) 
	{
		Constructor t1 = new Constructor ("vaibhavi",01);
		Constructor t2 = new Constructor ("Yash",02);
		
	 System.out.println(t1.name+" "+t1.rollno);
	 System.out.println(t2.name+" "+t2.rollno);
		
		

	}

}

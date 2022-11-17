package org.tnsindia.Constructor;

//parameterized constructor

public class Constructor01 {
	String name;
	int rollno;
	char division;
	
	public Constructor01(String name, int rollno, char division)
	{
		super();
		this.name = name;
		this.rollno = rollno;
		this.division = division;
	
	    }

	public static void main(String[] args) {
		
		Constructor01 s1 = new Constructor01 ("vaibhavi",01,'A');
		Constructor01 s2 = new Constructor01 ("Yash",02,'B');
		Constructor01 s3 = new Constructor01 ("Rahul",03,'C');
		
		System.out.println(s1.name+" "+s1.rollno+" "+s1.division);
		System.out.println(s2.name+" "+s2.rollno+" "+s2.division);
		System.out.println(s3.name+" "+s3.rollno+" "+s3.division);
		
		
		

	}

}

package cjc.test.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		 Student s=new Student();
		  s.setRoll(1);
		  s.setName("shilla");
		  s.setMarks(67);
		  
	System.out.println(s.getRoll());
	System.out.println(s.getName());	
	System.out.println(s.getMarks());
	System.out.println(s);
	  
		  
		  
		  
		  
		Student s1=new Student();
		  s1.setRoll(2);
		  s1.setName("kirti");
		  s1.setMarks(89);
		  
		 System.out.println(s1.getRoll());
	     System.out.println(s1.getName());	
	     System.out.println(s1.getMarks());
	     System.out.println(s1);
		
		  
		  
	Student s2=new Student();
		  s2.setRoll(3);
		  s2.setName("mina");
		  s2.setMarks(88);
		  
		System.out.println(s2.getRoll());
	    System.out.println(s2.getName());	
		System.out.println(s2.getMarks());
	    System.out.println(s2);
	
		  
		  
	  List<Student> li=new ArrayList<>();
	        li.add(s2);
	        li.add(s1);
	        li.add(s);
	     System.out.println(li);
	        

	        
	        
	        
	  
	  
		
	}

}

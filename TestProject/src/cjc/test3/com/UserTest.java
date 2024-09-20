package cjc.test3.com;

import java.util.Scanner;

public class UserTest
{
	

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Age");
		 int age=sc.nextInt();
		 System.out.println("Enter the weight");
		  int weight=sc.nextInt();
		
		   if(age==21||age==60 )
		   {
			  if( weight==40||weight== 70)
			  {
				System.out.println("user is valid ");
			  
		   }
        }
		   else
		   {
			 System.out.println("user is invalidDonar");
		}
	
	   }




	 
		 
		
		
		

}

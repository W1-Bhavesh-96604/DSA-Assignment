package com.sunbeam;

//3. Create array of employees and search employee by empid ,name
import java.util.Scanner;

class Employee{
				

	int id ;
	String name;
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	
}
public class QThree {

		public static void main(String args []) {
			
			
			
	
			
			Employee[] emp = {
					new Employee(1, "Ayush"),
					new Employee(2, "Bhavesh"),
					new Employee(3, "Om"),
					new Employee(4, "Raju")
			};
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Id for find name :");
			int searchId= sc.nextInt();
			boolean found1 = false;
			
			for(Employee e : emp) {
				
				// Search by id
				
				if(e.id==searchId) {
					System.out.println("found by id :" + e.name);
					found1= true;
					break;
					
				}
				
			}
			System.out.println("Enter Name to find id : " );
			String searchName =sc.next();
			
			boolean found = false;
				
				for(Employee e: emp) {
					
					
				// Search by name 
				
				
				if(e.name.equalsIgnoreCase(searchName)) {
				
					
					 System.out.println("Found by Name: Employee ID is " + e.id);
					 found = true;
					 continue;
				}
				
				//System.out.println("Not Found");
			}
			
			
	}
		
}

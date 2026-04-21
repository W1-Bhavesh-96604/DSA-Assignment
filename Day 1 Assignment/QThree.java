package com.sunbeam.LSearch;

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
			
			
			
	// 3. Create array of employees and search employee by empid,name
//			
//			int searchId =1;
//			String searchName="Balaji";
	
//			Employee[] emp = new Employee[4];
//			
//			emp[0] = new Employee(1, "Aarush");
//			emp[1] = new Employee(2, "Balaji");
//			emp[2] = new Employee(3,"Sahil");
//			emp[3] = new Employee(4, "Prajwal");
			
			Employee[] emp = {
					new Employee(1, "Aarush"),
					new Employee(2, "Balaji"),
					new Employee(3, "Sahil"),
					new Employee(4, "Prajwal")
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

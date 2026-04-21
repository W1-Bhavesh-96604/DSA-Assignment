package com.sunbeam.LSearch;

public class Qtwo {
	
	//  Write a program to print no of comparisons done to search a key in
	// linear search

	public static void main(String args[] ){
		
		int key=3;
		int index=0;
		int count=1;
				
			int arr[] = {1,2,3,4,5,5,7};
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]==key) {
					
					index =i;
					count ++;
					
					
				}
				
			}
			System.out.println("No of Comparisons done is  : " + count);
			
		}

	}

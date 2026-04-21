package com.sunbeam.LSearch;

public class QoneSecondMethod {
	
	// 1. Write a linear search algorithm to return index of last occurrence of key.
	
		public static void main(String args[] ){
			
		int k=3;
		int index=0;
				
			int arr[] = {1,2,3,4,5,5,3,7};
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]==k) {
					
					index =i;
					
				}
				
			}
			System.out.println("index of element is : " + index);
			
		}

	}

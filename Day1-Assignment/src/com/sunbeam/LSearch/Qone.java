package com.sunbeam.LSearch;

public class Qone {
	// 1. Write a linear search algorithm to return index of last occurrence of key.
	
	public static void main(String args[] ){
	int 	k=3;
			
		int arr[] = {1,2,3,4,5,5,3,7};
		int i=arr.length-1;
		
		for(int n=i; n>=0; n--) {
			if(arr[n]==k) {
				System.out.println("index of the key is :" + n);
				break;
			}
		}
		
	}

}

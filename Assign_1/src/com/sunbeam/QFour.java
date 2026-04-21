package com.sunbeam;

//4. (Optional => Find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Output: 3

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class QFour {
	
	public static void main(String args[]) {
	int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int  n : arr) {
			set.add(n);
		}
	
		System.out.println("non repeating element is :" + set);
	
}
}
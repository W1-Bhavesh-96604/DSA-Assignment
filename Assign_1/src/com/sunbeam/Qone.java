package com.sunbeam;

// 1. Write a linear search algorithm to return index of last occurrence of key.

public class Qone {
    public static void main(String args[]) {
        int k = 3;
        int arr[] = {1,2,3,4,5,5,3,7};

        int index = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == k) {
                index = i;
                break;
            }
        }

        if(index != -1)
            System.out.println("Index of the key is: " + index);
        else
            System.out.println("Key not found");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;
        int low = 0;
        int high = arr.length - 1;
    
        int index = runBinarySearchIteratively(arr, key, low, high);
    
        if (index == Integer.MAX_VALUE) {
            System.out.println("Key not found in array.");
        } else {
            System.out.println("Key found at index " + index + " in array.");
        }
    }
    

    //The Time complexity of this program is O(log n) - The algorithm divides the search space in half at each step
    //The Space Complexity of this program is O(1) - it only uses a constant amount of extra space to store the indices of the first and last elements in the array, the key, and the index variable.

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javasearch;

import java.util.Random;

/**
 *
 * @author djohanne
 */
public class JavaSearch {
    
    public static void main(String[] args) 
    {
        //Linear search array
        int[] linearSearchArray = {0,1,2,3,4,5,6,7,8,9,10};   //Linear search performs search from position 0 to the end of the array. Data does not have to be sorted.
        Search l = new Search();    //Instantiate new object for Linear Search
        System.out.println("Linear Search results\n----------------------");
        l.linearSearch(linearSearchArray, 5);   //Execute Linear search method
        
        System.out.println("");
        
        //Binary search array
        int[] binarySearchArray = {0,1,2,3,4,5,6,7,8,9,10};   //Binary search requires data to be sorted
        Search b = new Search();    //Instantiate new object for Binary Search
        System.out.println("Binary Search results\n----------------------");
        b.BinarySearch(binarySearchArray, 5);  //Execute Binary search method
    }
}

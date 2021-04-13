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
        int[] numbers = {10, 4, 6, 8, 7, 1, 0, 3, 9, 2, 5};
        
        Search s = new Search();
        s.linearSearch(numbers, 4);
    }
    
}

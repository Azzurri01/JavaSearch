/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javasearch;


public class Search 
{
    public int linearSearch(int[] data, int value)
    {
        int position=-1;
        boolean found = false;
        
        for(int i=0; i<data.length && found==false; i++)
        {
            if(data[i]==value)
            {
                found=true;
                position=i;
                System.out.println("Value " + data[i] + " found! Location: " + position + ".");
            }
                else
                {
                    System.out.println("Value " + value + " not found in position:" + data[i] + " of the data array!");
                }
        }
        return position;
    }
    
    /*public int BinarySearch()
    {
        
    }*/
}

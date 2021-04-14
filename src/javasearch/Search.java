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
        int counter=1;
        
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
                    System.out.println("Data not found! Runtime attempt: " + counter);
                    counter++;
                }
        }
        return position;
    }
    
    public int BinarySearch(int[] data, int value)
    {
        //variables
        int position=-1;
        int left = 0;
        int right = data.length-1;
        boolean found=false;
        int counter=1;
        
        //Algorithm
        while(!found)
        {
            int middle =(left+right)/2;
            
            if(data[middle]==value)
            {
                found=true;
                position=middle;
            }
                else if(data[middle]<value)
                {
                    left=middle+1;
                }
                    else if(data[middle]>value)
                    {
                        right=middle-1;
                    }

            //Count how many time loop was executed
            System.out.println("Data not found! Runtime attempt: " + counter);
            counter++;
        }
        
        //Return array position of value
        System.out.println("Value: " + value + " found! Location: " + position + ".");
        return position;
    }
}

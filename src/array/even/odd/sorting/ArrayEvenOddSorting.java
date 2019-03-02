
package array.even.odd.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayEvenOddSorting {


    public static void main(String[] args) 
    {
    
int[] array_sort = {91,1,5, 12, 3, 21, 8, 7, 19, 102, 201 };

List<Integer> odd = new ArrayList<Integer>();
List<Integer> even = new ArrayList<Integer>();

for (int i : array_sort) 
{
    if ((i & 1) == 1)  /* any Number
                         & 0001
                         ___________
                         
                      */ 
                       
    {
        odd.add(i);
    } else 
    {
        even.add(i);
    }
}

Collections.sort(odd);
Collections.sort(even);
System.out.println("Odd:" + odd);
System.out.println("Even:" + even);  
        
    }
    
}


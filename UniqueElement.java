//Q4) Given a non-empty array of integers, every element appears twice except for one. Find that single one.
import java.util.*;
class UniqueElement
{
  static int unique(int arr[],int size)
  { 
   int unq_ele=arr[0];
   for(int i=1;i<size;i++)
    unq_ele=unq_ele^arr[i];
	return unq_ele;
	}
	public static void main(String arg[])
	{
	  int ar[]={1,2,3,1,2};
	  int n=ar.length;
	  System.out.println(unique(ar,n));
	}
}
   

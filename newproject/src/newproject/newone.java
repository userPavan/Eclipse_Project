
package newproject;

import java.util.ArrayList;
import java.util.*;

public class newone 
{

	public static void main(String[] args) 
	{
		// Integer array sort ascending order
		System.out.println("hello");
		int[] arr={5,2,87,64,3,0,1,2,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		//Integer array sort descending order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		for(int i:arr)
		{
			System.out.println(+i+" ");
		}
		
		//Integer largest number in array
		int larg=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(larg<arr[i])
			{
				larg=arr[i];
			}
		}
		System.out.println("\nThe largest is "+larg);
		
		
		//Integer smallest number in array
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("\nThe smallest is "+small+"\n");
		
		
		//Integer ArrayList sort ascending and descending
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(5);
		obj.add(15);
		obj.add(15);
		Collections.sort(obj);
		System.out.println("Listed are : "+obj+"\n");
		Collections.sort(obj,Collections.reverseOrder());
		System.out.println("Listed are : "+obj+"\n");
		
		//Integer count of repeated elements in ArrayList
		HashSet<Integer> list=new HashSet<Integer>(obj);
		for(int i:list)
		{
			System.out.println(i+"---"+Collections.frequency(obj, i));
		}
		
		
		//Integer HashSet sort ascending and descending 
		HashSet<Integer> obj1=new HashSet<Integer>();
		obj1.add(25);
		obj1.add(25);
		obj1.add(35);
		obj1.add(5);
		obj1.add(5);
		obj1.add(95);
		obj1.add(85);
		System.out.println("Listed two : "+obj1+"\n");
		ArrayList<Integer> obj2=new ArrayList<Integer>(obj1);
		Collections.sort(obj2);
		System.out.println("Listed two : "+obj2+"\n");
		Collections.sort(obj2,Collections.reverseOrder());
		System.out.println("Listed are : "+obj2+"\n");
		
		
		//Integer count of repeated elements in ArrayList
		for(int i:obj2)
		{
			System.out.println(i+"---"+Collections.frequency(obj2, i));
		}

	}

}

package newproject;
import java.util.*;
public class NewString
{

	public static void main(String[] args)
	{
		// String sort ascending order
		String[] arr={"ram","bam","pam","acl"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.print(Arrays.toString(arr)+"\n");
		
		// String sort descending order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i].compareTo(arr[j])<0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.print(Arrays.toString(arr)+"\n");
		
		//String ArrayList sort ascending and descending
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Ram");
		obj.add("Bam");
		obj.add("Bam");
		obj.add("Sam");
		Collections.sort(obj);
		System.out.println("Listed are : "+obj+"\n");
		Collections.sort(obj,Collections.reverseOrder());
		System.out.println("Listed are : "+obj+"\n");
		
		//Integer count of repeated elements in ArrayList
		HashSet<String> list=new HashSet<String>(obj);
		for(String i:list)
		{
			System.out.println(i+"---"+Collections.frequency(obj, i));
		}
		
		
		//String HashSet sort ascending and descending 
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("cal");
		obj1.add("cal");
		obj1.add("bal");
		obj1.add("pal");
		obj1.add("pal");
		obj1.add("sam");
		obj1.add("sam");
		System.out.println("Listed two : "+obj1+"\n");
		ArrayList<String> obj2=new ArrayList<String>(obj1);
		Collections.sort(obj2);
		System.out.println("Listed two : "+obj2+"\n");
		Collections.sort(obj2,Collections.reverseOrder());
		System.out.println("Listed are : "+obj2+"\n");
		
		
		//String count of repeated elements in ArrayList
		for(String i:obj2)
		{
			System.out.println(i+"---"+Collections.frequency(obj2, i));
		}


	}

}

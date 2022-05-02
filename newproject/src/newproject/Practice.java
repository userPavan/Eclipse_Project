package newproject;
import java.util.*;

public class Practice 
{

	public static void main(String[] args) 
	{
		Scanner obj1=new Scanner(System.in);
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		System.out.print(obj+"\n");
		Collections.sort(obj);
		obj1.close();
		Iterator<Integer> it=obj.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
	
	}

}

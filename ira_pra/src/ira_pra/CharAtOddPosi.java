package ira_pra;


import java.util.Scanner;

public class CharAtOddPosi {

	public static void main(String[] args) {
		
		
		Scanner obj1=new Scanner(System.in);
		
		//obj1.nextLine();
		String str=obj1.nextLine();
		obj1.close();
		for(int i=0;i<(int)str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}

package ira_pra;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		System.out.println(""+"\n");
		obj.nextLine();
		String str=obj.nextLine();
		obj.close();
	    StringBuffer str1=new StringBuffer();
	    str1=str1.append(str);
	    System.out.print("The Reverse of the number is "+ str1.reverse());
	    
	}
}

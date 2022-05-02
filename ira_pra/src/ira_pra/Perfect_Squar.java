package ira_pra;

import java.util.Scanner;

public class Perfect_Squar {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int num = obj.nextInt();
		obj.close();
		System.out.println("Enter number to be checked for perfect square : "+ num);
		int sqr=(int) Math.sqrt(num);
		int product=sqr*sqr;
		if(product==num) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		

	}

}

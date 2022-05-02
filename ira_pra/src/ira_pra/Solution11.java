package ira_pra;

import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {
	
	public static Sim2[] transferCircle(Sim2 obj1[],String circle1,String circle2) {
		Sim2[] temp=new Sim2[0];
		for(int i=0;i<obj1.length;i++) {
			if(obj1[i].getCircle().equalsIgnoreCase(circle1)) {
				
				temp=Arrays.copyOf(temp, temp.length+1);
				temp[temp.length-1].setCircle(circle2);
			}
		}
		 for(int i=0;i<temp.length-1;i++){
	            for(int j=0;j<temp.length-i-1;j++){
	            	if(temp[j].getRatePerSecond()<temp[j+1].getRatePerSecond())
	                {
	                     Sim2 temp1=temp[j];
	                     temp[j]=temp[j+1];
	                     temp[j+1]=temp1;
	                }

	            }
		 }
		 return temp;
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Sim2[] obj1=new Sim2[4];
		for(int i=0;i<4;i++) {
			int SimId=obj.nextInt();
			String CustomerName=obj.next();
			double balance=obj.nextInt();
			double ratePerSecond=obj.nextDouble();
			String circle=obj.next();
			
			obj1[i]=new Sim2(SimId,CustomerName,balance,ratePerSecond,circle);
		}
		String circle1=obj.next();
		String circle2=obj.next();
		obj.close();
		Sim2[] ans=transferCircle(obj1,circle1,circle2);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i].getSimId()+" "+ans[i].getCustomerName()+" "+ans[i].getCircle()+" "+ans[i].getRatePerSecond());
		}

	}

}

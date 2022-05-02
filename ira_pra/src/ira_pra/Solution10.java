package ira_pra;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10 {
	
	public static Sim[]  matchAndSort(Sim obj1[], String search_circle, Double search_rate) {
		Sim[] temp=new Sim[0];
		for(int i=0;i<obj1.length;i++) {
			if(obj1[i].getCircle().equalsIgnoreCase(search_circle)) {
				if( obj1[i].getRatePerSecond()<search_rate){
					 temp=Arrays.copyOf(temp, temp.length+1);
					 temp[temp.length-1]=obj1[i];
				}
			}
		}
		 for(int i=0;i<temp.length-1;i++){
	            for(int j=0;j<temp.length-i-1;j++){
	                if(temp[j].getBalance()<temp[j+1].getBalance()){
	                     Sim temp1=temp[j];
	                     temp[j]=temp[j+1];
	                     temp[j+1]=temp1;
	                }

	            }
		
	}
		return temp;
}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Sim[] obj1=new Sim[4];
		for(int i=0;i<4;i++) {
			int id=obj.nextInt();
			String company=obj.next();
			int balance=obj.nextInt();
			double ratePerSecond=obj.nextDouble();
			String circle=obj.next();
			
			obj1[i]=new Sim(id,company,balance,ratePerSecond,circle);
		}
		String search_circle=obj.next();
		Double search_rate =obj.nextDouble();
		obj.close();
		Sim[] ans=matchAndSort(obj1,search_circle,search_rate);
			for(int i=0;i<ans.length;i++) {
				System.out.println(ans[i].getId());
			}
		}

}

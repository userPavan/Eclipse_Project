package ira_pra;

import java.util.Scanner;

public class Solution3 extends Inventory {
	
	public Solution3(String inventorId, int maximumQuantity2, int currentQuantity2, int threshold2) {
		super(inventorId, maximumQuantity2, currentQuantity2, threshold2);
		
	}


	public static Inventory replenish(Inventory obj2[],int num) {
		
		for(int i=0;i<obj2.length;i++) {
			if(obj2[i].getThreshold()<=num) {
				for(i=0;i<obj2.length;i++) {
				return obj2[i];
				}
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Inventory[] obj2=new Inventory[4];
		for(int i=0;i<obj2.length;i++) {
			String inventorId=obj.next();
			int maximumQuantity=obj.nextInt();
			int currentQuantity=obj.nextInt();
			int threshold=obj.nextInt();
			
			obj2[i] =new Inventory(inventorId,maximumQuantity,currentQuantity,threshold);
		}
		
		//System.out.println("hi");
		int num=obj.nextInt();
		obj.close();
		Inventory ans=replenish(obj2,num);
		if(ans==null) {
			if(ans.getThreshold()>75) {
				System.out.println("Critical Filling");
			}
			else if(ans.getThreshold()>=50&&ans.getThreshold()<=70) {
				System.out.println("Moderate Filling");
			}
			else {
				System.out.println(ans.getInventoryId()+" "+"Non-Critical Filling");
			}
		}

	}

}

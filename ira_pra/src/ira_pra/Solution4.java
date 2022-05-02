package ira_pra;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution4 {
	
	public static List<Integer> getPriceByDisease(Medicine[] obj1,String dise) {
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<4;i++) {
			if(obj1[i].getDisease().equalsIgnoreCase(dise)) {
				arr.add(obj1[i].getPrice());
				Collections.sort(arr);
			}
		}
		return arr;	
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Medicine[] obj1=new Medicine[4];
		for(int i=0;i<4;i++) {
			String MedicineName=obj.next();
			String batch=obj.next();
			String disease=obj.next();
			int price=obj.nextInt();
			
			obj1[i]=new Medicine(MedicineName,batch,disease,price);
		}
		String dise=obj.next();
		obj.close();
		List<Integer> ans = getPriceByDisease(obj1,dise);
		
		if(ans!=null) {
			for(Integer s: ans){
				   System.out.println(s);
				}
		}	
	}
	
}

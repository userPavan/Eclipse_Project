package ira_pra;

import java.util.Scanner;

public class Solution12 {
	
	public static int findAgencyWithHighestPackagePrice(TravelAgency obj1[]) {
		int num=obj1[0].getPrice();
		int k=0;
		for(int i=0;i<4;i++) {
			if(num>obj1[i].getPrice());
			num=obj1[i].getPrice();
		}
		return k;
	}
	
	public static TravelAgency agencyDetailsforGivenIdAndType(TravelAgency obj1[],int regNum,String packaeType) {
		TravelAgency temp=null;
		for(int i=0;i<4;i++) {
			if(obj1[i].isFlightFacility()==true&&obj1[i].getRegNo()==regNum&&obj1[i].getPakageType().equalsIgnoreCase(packaeType)) {
				temp=obj1[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		TravelAgency[] obj1=new TravelAgency[4];
		for(int i=0;i<4;i++) {
			int regNo=obj.nextInt();
			String agencyName=obj.next();
			String packageType=obj.next();
			int price=obj.nextInt();
			boolean flightFacility=obj.nextBoolean();
			
			obj1[i] =new TravelAgency(regNo,agencyName,packageType,price,flightFacility);
		}
		int regNum=obj.nextInt();
		obj.nextLine();
		String packaeType=obj.nextLine();
		obj.close();
		int ans=findAgencyWithHighestPackagePrice(obj1);
		if(ans!=0) {
			System.out.print(ans);
		}
		TravelAgency ans2=agencyDetailsforGivenIdAndType(obj1,regNum,packaeType);
		if(ans2!=null) {
			System.out.println(ans2.getAgencyName()+" "+ans2.getPrice());
		}	
	}

}

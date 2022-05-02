package ira_pra;

import java.util.Scanner;

public class Solution7 {
	
	public static int findAvgVoyagesByPct(NavalVessel obj1[],int percentage) {
		int sum=0,count=0,avg=0,percent;
		for(int i=0;i<4;i++) {
			percent=((obj1[i].getNoOfVoyagesCompleted()*100)/obj1[i].getNoOfVoyagesPlanned());
			if(percent>=percentage) {
				sum=sum+obj1[i].getNoOfVoyagesCompleted();
				count++;
			}
			avg=(sum/count);
			
		}
		return avg;
	}
	
	public static NavalVessel findVesselByGrade(NavalVessel obj1[],String purpose) {
		int percent1;
		for(int i=0;i<4;i++) {
			if(obj1[i].getPurpose().equalsIgnoreCase(purpose)) {
				percent1=((obj1[i].getNoOfVoyagesCompleted()*100)/obj1[i].getNoOfVoyagesPlanned());
				if(percent1==100) {
					obj1[i].setClassifiaction("Star");
				}
				else if(percent1>80 && percent1<99) {
					obj1[i].setClassifiaction("Leader");
					
				}
				else if(percent1>55 && percent1<79) {
					obj1[i].setClassifiaction("Strive");
					
				}
				return obj1[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		NavalVessel[] obj1=new NavalVessel[4];
		for(int i=0;i<4;i++) {
			int vesselId = obj.nextInt();
			String vesselName =obj.next();
			int noOfVoyagesPlanned =obj.nextInt();
			int noOfVoyagesCompleted = obj.nextInt();
			String purpose = obj.next();
			
			obj1[i] =new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned,noOfVoyagesCompleted,purpose);
		}
		int percentage=obj.nextInt();
		String purpose=obj.next();
		obj.close();
		int ans=findAvgVoyagesByPct(obj1,percentage);
		if(ans!=0) {
			System.out.println(ans);
		}
		NavalVessel ans2=findVesselByGrade(obj1,purpose);
		if(ans2!=null) {
			System.out.println(ans2.getVesselName()+"%"+ans2.getClassifiaction());
		}
		else {
			System.out.println("No Naval Vessel is available with the specified purpose");
		}

	}

}

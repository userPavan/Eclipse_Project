package ira_pra;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution8 {
	
	public static ArrayList<Integer> findAverageOfRuns(Player obj1[],int target) {
		ArrayList<Integer> arr=new ArrayList<>();
		int avg=0;
		for(int i=0;i<4;i++) {
			if(target<=obj1[i].getMatchsPlayed()) {
				avg=(obj1[i].getRunsScored()/obj1[i].getMatchsPlayed());
				arr.add(avg);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Player[] obj1=new Player[4];
		for(int i=0;i<4;i++) {
			int id=obj.nextInt();
			String name=obj.next();
			int iccRank=obj.nextInt();
			int matchsPlayed=obj.nextInt();
			int runsScored=obj.nextInt();
			
			obj1[i]=new Player(id,name,iccRank,matchsPlayed,runsScored);
		}
		int target=obj.nextInt();
		obj.close();
		ArrayList<Integer> ans=findAverageOfRuns(obj1,target);
		for(int i:ans) {
			if(i>=80&&i<=100) {
				System.out.println("Grade A");
			}
			else if(i>=50&&i<=79) {
				System.out.println("Grade B");
			}
			else {
				System.out.println("Grade C");
			}
		}		
	}

}

package ira_pra;

import java.util.Scanner;

public class Solution9 {
	
	public static int findPointsForGivenSkill(Player1 obj1[],String skill) {
		int sum=0;
		for(int i=0;i<4;i++) {
			if(obj1[i].getSkill().equalsIgnoreCase(skill)) {
				sum=sum+obj1[i].getPoints();
			}
		}
		return sum;
	}
	
	public static Player1 getPlayerBasedOnLevel(Player1 obj1[],String skill,String level) {
		Player1 temp=null;
		for(int i=0;i<4;i++) {
			if(obj1[i].getSkill().equalsIgnoreCase(skill)&&obj1[i].getLevel().equalsIgnoreCase(level)&&obj1[i].getPoints()>=20) {
				temp=obj1[i];
			}
			
		}
		return temp;
		
	}

	public static void main(String[] args) {
		 
		Scanner obj=new Scanner(System.in);
		Player1[] obj1=new Player1[4];
		for(int i=0;i<4;i++) {
			
			int playerId=obj.nextInt();
			String skill=obj.next();
			String level=obj.next();
			int points=obj.nextInt();
		
			obj1[i]=new Player1(playerId,skill,level,points);
		}
		String skill=obj.next();
		String level=obj.next();
		obj.close();
		int ans=findPointsForGivenSkill(obj1,skill);
		if(ans>0) {
			System.out.println(ans);
		}
		else {
			System.out.println("The given Skill is not available");
		}
		Player1 ans2=getPlayerBasedOnLevel(obj1,skill,level);
		if(ans2!=null) {
			System.out.println(ans2.getPlayerId());
		}
		else {
			System.out.println("No player is available with specified level, skill and eligibility points");
		}

	}

}

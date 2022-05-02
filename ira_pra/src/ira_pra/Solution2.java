package ira_pra;

import java.util.Scanner;

public class Solution2 extends Institution {

	public Solution2(int institutionId2, String institutionName, int noOfStudentsPlaced2, int noOfStudentsCleared2,
			String location2) {
		super(institutionId2, institutionName, noOfStudentsPlaced2, noOfStudentsCleared2, location2);
		
	}
	
	
	public static int findNumClearancedByLoc(Institution obj1[],String str) {
		/*This method will take two input parameters - 
		 * array of Institution objects and string parameter location. 
		 * The method will return the sum of the noOfStudentsCleared attribute from institution
		 *  objects for the location passed as parameter.
		 *   If no institution with the given location is present in the array of institution 
		 *   objects, then the method should return 0.*/
		int sum=0;
		for(int i=0;i<obj1.length;i++){
			if(obj1[i].getLocation().equalsIgnoreCase(str)) {
				sum=sum+obj1[i].getNoOfStudentsCleared();
			}
		}
		return sum;
	}
	
	public static Institution updateInstitutionGrade(Institution obj1[],String isname) {
		/*This method will take a String parameter institutionName, 
		 * along with the array of Institution objects. 
		 * The method will return the institution object, if the input String parameter matches with the institutionName
		 *  attribute of the institution object. Before returning the object, the grade should be arrived 
		 *  based on the rating calculation mentioned below. This grade value should be assigned to the object.
		 *  If any of the above conditions are not met, then the method should return null.

			The grade attribute should be calculated as follows: rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared 
			If the rating &gt= 80 , then grade should be 'A'. Else, then grade should be 'B'

			Note: No institution object would have the same value for institutionName attribute. 
			All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value. 
			All the searches should be case insensitive.*/
		//Institution temp=null;
		int rating;
		
		for(int i=0;i<obj1.length;i++) {
			if(obj1[i].getInistitutionName().equalsIgnoreCase(isname)) {
				
				rating=((obj1[i].getNoOfStudentsPlaced()*100)/obj1[i].getNoOfStudentsCleared());
				if(rating>=80) {
					obj1[i].setGrade("A");
				}
				else {
					obj1[i].setGrade("B");
				}
				return obj1[i];
			}
		
		}
		return null;
		
	}

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		//obj.close();
		Institution[] obj1=new Institution[4];
		for(int i=0;i<obj1.length;i++) {
			int institutionId=obj.nextInt();
			String institutionName=obj.next();
			int noOfStudentsPlaced=obj.nextInt();
			int noOfStudentsCleared=obj.nextInt();
			String location=obj.next();
			//String grade=obj.next();
			
			obj1[i]=new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
		}
		obj.close();
		String str=obj.next();
		String isname=obj.next();
		
		int ans1=findNumClearancedByLoc(obj1,str);
		if(ans1==0) {
			System.out.println("There are no cleared students in this particular location");
		}
		else {
			
			System.out.println(ans1);
		}
		
		Institution ans2=updateInstitutionGrade(obj1, isname);
		if(ans2!=null) {
				System.out.println(ans2.getInistitutionName()+"::"+ans2.getGrade());
			
		}
		else {
			System.out.println("No Institute is available with the specified name");
		}

	}

}

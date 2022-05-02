package ira_pra;

import java.util.Scanner;

public class Solution extends AutonomusCar {
	
	public Solution(int carId, String brand, int noOFTestConducted, int noOfTestPassed, String environment) {
		super(carId, brand, noOFTestConducted, noOfTestPassed, environment);
	
	}

	static int findTestPassedByEnv(AutonomusCar acar[],String avi) {
		
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(acar[i].getEnvironment().equalsIgnoreCase(avi))
			{
				sum=sum+acar[i].getNoOfTestPassed();
			}
			else {
				return 0;
			}
			//return sum;
		}
		return sum;
	}
	
	public static AutonomusCar updateCarGrade(AutonomusCar acar[],String bran) {
		int rateing;
		for(int i=0;i<4;i++)
		{
			if(acar[i].getBrand().equalsIgnoreCase(bran))
			{
				rateing=((acar[i].getNoOfTestPassed() * 100)/acar[i].getNoOFTestConducted());
				if(rateing>80) {
					acar[i].setGrade("A1");
				}
				else {
					acar[i].setGrade("B1");
				}
				return acar[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		AutonomusCar[] acar=new AutonomusCar[4];
		for(int i=0;i<4;i++)
		{
			int cardId=obj.nextInt();
			String brand=obj.next();
			int noOfTestConducted=obj.nextInt();
			int noOfTestPassed=obj.nextInt();
			String environment=obj.next();
			//String grade=obj.next();
			
			acar[i]=new AutonomusCar(cardId,brand,noOfTestConducted,noOfTestPassed,environment);
		}
		obj.close();
		String evi=obj.next();
		String bran=obj.next();
		
		int testsPassed = findTestPassedByEnv(acar, evi);
		if (testsPassed == 0) {
		System.out.println("There are no tests passed in this particular environment");
		  }
		else {
		   System.out.println(testsPassed);
		  }
		 AutonomusCar updatedCar = updateCarGrade(acar, bran);
		 if (updatedCar == null) {
		   System.out.println("No Car is available with the specified brand");
		 }
		  else {
		   System.out.println(updatedCar.getBrand() + "::" + updatedCar.getGrade());
		 }


	}

}

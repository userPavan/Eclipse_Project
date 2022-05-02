package ira_pra;

import java.util.Scanner;

public class Solution5 {
	
	public static int findAvgBudgetByDirector(Movie obj1[],String director) {
		int sum=0,count=0,avg=0;
		for(int i=0;i<4;i++) {
			if(obj1[i].getDirector().equalsIgnoreCase(director)) {
				sum=sum+obj1[i].getBudget();
				count ++;
			}
			avg=sum/count;
		}
		return avg;
	}
	
	public static Movie getMovieByRatingBudget(Movie obj1[],int rateing,int budget) {
		for(int i=0;i<4;i++) {
			if(obj1[i].getRating()==rateing&&obj1[i].getBudget()==budget) {
				if((obj1[i].getRating()/obj1[i].getBudget())==0) {
				return obj1[i];
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Movie[] obj1=new Movie[4];
		for(int i=0;i<4;i++) {
			int movieId=obj.nextInt();
			String director=obj.next();
			int rateing=obj.nextInt();
			int budget=obj.nextInt();
			
			obj1[i]=new Movie(movieId,director,rateing,budget);
		}
		String director=obj.next();
		int rateing=obj.nextInt();
		int budget=obj.nextInt();
		obj.close();
		int ans1=findAvgBudgetByDirector(obj1,director);
		if(ans1>0) {
			System.out.println(ans1);	
		}
		else {
			System.out.println("Sorry - The given director has not yet directed any movie");
		}
		Movie ans2=getMovieByRatingBudget(obj1,rateing,budget);
		if(ans2!=null) {
			System.out.println(ans2.getMovieId());
		}
		else {
			System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
			
		}
		

	}

}

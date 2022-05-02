package ira_pra;

import java.util.ArrayList;

import java.util.Scanner;

public class Solution6 {
	
	public static ArrayList<Movie2> getMovieByGenre(Movie2 obj2[],String gener) {
		ArrayList<Movie2> arr=new ArrayList<>();
		
		for(int i=0;i<4;i++) {
			if(obj2[i].getGenre().equalsIgnoreCase(gener)){
				arr.add(obj2[i]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		Movie2[] obj2=new Movie2[4];
		for(int i=0;i<4;i++) {
			String movieName=obj.next();
			String company=obj.next();
			String gener=obj.next();
			int budget=obj.nextInt();
			
			obj2[i]=new Movie2(movieName,company,gener,budget);
		}
		String gener=obj.next();
		obj.close();
		ArrayList<Movie2> ans=getMovieByGenre(obj2,gener);
		//System.out.println(ans.);
	
		if(ans!=null) {
			for(Movie2 i:ans) {
				if(i.getBudget()>80000000) {
				System.out.println("High Budget Movie");
			}
			else {
				System.out.println("Low Budget Movie");
				
			}
			
		}

	}
}
}

package ira_pra;


import java.util.Scanner;

public class LastChar {

	public static void main(String[] args) {
		
		
		Scanner obj1=new Scanner(System.in);
		String k=obj1.nextLine();
	    obj1.close();
        char[] result = k.toCharArray();
        for(int i=0;i<result.length;i++){
            if(Character.isWhitespace(result[i]) && !Character.isDigit(result[i-1]) && !Character.isWhitespace(result[i-1])){
                System.out.print(result[i-1]);
            }
            else if(i == result.length-1 && !Character.isDigit(result[i])){
                System.out.print(result[i]);
            }
        }
	}
}
	



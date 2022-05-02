package ira_pra;

import java.util.Scanner;

public class SmallestVowel {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String str=obj.next();
		String[] vowels= {"a","e","i","o","u"};
		for(int i=0;i<vowels.length;i++)
		{
			if(str.contains(vowels[i])) {
				System.out.println(vowels[i]);
				break;
			}
		}
		obj.nextLine();
		String str2=obj.nextLine();
		int count1=0,count2=0;
		obj.close();
		char[] chr=str2.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(Character.isWhitespace(chr[i])) {
				count1++;
			}
			else if(!Character.isDigit(chr[i])) {
				count2++;
			}
	
		}
		System.out.println("Spaces : "+count1+" letters : "+count2);
		

	}

}

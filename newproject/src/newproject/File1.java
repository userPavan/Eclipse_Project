package newproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class File1
{
    public static void main(String[] args)
    {
    	File F1=new File("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\New folder\\\\conten.txt");
    	try 
    	{
    		if(F1.exists())
    		{
    			System.out.println("File alreday present");
    		}
    		else
    		{
    			F1.createNewFile();
    		}
    		FileWriter fil=new FileWriter(F1 ,true);
    		fil.write("hi hiuhj all ");
    		fil.close();
    		
    		
    		FileReader red=new FileReader(F1);
    		Scanner read=new Scanner(red);
    	    while (read.hasNextLine()) 
    	    {
    	        String data = read.nextLine();
    	        System.out.println(data);
    	      }
    	      read.close();
    	      
			
		} 
    	catch (IOException e) 
    	{
			
    		System.out.println("An error occured");
			e.printStackTrace();
		}
    	

    }
}


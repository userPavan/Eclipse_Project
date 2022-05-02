package newproject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileHandeling 
{

	public static void main(String[] args) 
	
	//To create a file
	throws IOException
	{
		File f1=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\New folder\\content1.txt");
		if(f1.exists())
		{
			System.out.println("The file has already present");
		}
		else
		{
			f1.createNewFile();
		}
		System.out.println("File name is  : "+f1.getName());
		
		
		//To list the files
		/*File f1=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\New folder");
		File[] list=f1.listFiles();
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].getName());
			
		}*/
		
		System.out.println("File       : "+f1.getAbsolutePath());
		System.out.println("File       : "+f1.getCanonicalPath());
		System.out.println("File       : "+f1.getFreeSpace());
		System.out.println("File       : "+f1.getName().toString());
		System.out.println("File       : "+f1.length());
		System.out.println("File       : "+f1.list());
		
		//To write in file
		FileWriter write=new FileWriter(f1);
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the content to the file");
		String arr=obj.nextLine();
		obj.close();
		write.write(arr);
		write.close();
		System.out.println("File content has been created");
		
		//To read the file content
		FileReader read=new FileReader(f1);
		Scanner myReader = new Scanner(read);
	    while (myReader.hasNextLine()) 
	    {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	      
	      System.out.println("File       : "+f1.getName().toString());
	      System.out.println(f1.listFiles());
	      
	}

}



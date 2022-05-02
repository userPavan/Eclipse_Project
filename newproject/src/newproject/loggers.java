package newproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggers 
{
	
private static Logger logr=  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	

	public static void setup()throws IOException
	{
	FileHandler fh;
	try 
	{
		fh=new FileHandler("mylog.log",true);
		logr.addHandler(fh);
		SimpleFormatter format=new SimpleFormatter();
		fh.setFormatter(format);
		
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
		logr.log(Level.WARNING,"Exception");
	}
	}
	public static void main(String[] args) throws IOException {
		
		setup();
		try {
			int a=20/0;
		}
		catch(ArithmeticException e)
		{
			
			logr.log(Level.WARNING,"Exceptiom", e);
		}
		
		
	}

}

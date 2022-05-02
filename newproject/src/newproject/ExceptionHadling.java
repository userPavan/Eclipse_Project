package newproject;


public class ExceptionHadling 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int a=20/2;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Math error occured");
			
		}
		finally
		{
			System.out.println("Provide a suitable input");
		}
		
		

	}

}

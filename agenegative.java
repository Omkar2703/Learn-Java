import java.util.*;
class agenegative extends Exception
{
	public void display()
	{
		System.out.println("Age is Negative.");
	}
}
class test
{
	public static void main(String x[])
	{
		try
		{
			Scanner t= new Scanner(System.in);
			System.out.print("Enter the age:");
			int age = t.nextInt();
			if(age<0)
			{
				throw new agenegative();
			}
			else
			{
				System.out.println("Age is "+age);
			}
		}
		catch(agenegative ae)
		{
			ae.display();
		}
		finally
		{
			System.out.println("Always Input the positive age, negative age cannot be acceptable");
		}
	}
}

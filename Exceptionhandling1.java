import java.util.*;
class test
{
	public static void main(String x[])
	{
		try
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Enter the number:");
		                   int a = t.nextInt();
			int b = t.nextInt();
			int c = a/b;
			System.out.println("Division is = "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic Exception Occured.");
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Input Mismatch Exception Occured.");
		}
		finally
		{
			System.out.println("If Error occured the Kindly try to Debug them.");
		}
	}
}
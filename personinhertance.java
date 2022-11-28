import java.util.*;
class person
{
	int id;
	String name;
	person()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the id and name:");
		id = t.nextInt();
		name = t.next();
	}
	void display()
	{
		System.out.println("Name =  "+name+"\n"+"Id = "+id);
	}
}
class account extends person
{
	int accno;
	account()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the account number:");
		accno = t.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("account number = "+accno);
	}
}
class customer extends account
{
	double blnce;
	customer()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the balance:");
		blnce = t.nextDouble();
	}
	void display()
	{
		super.display();
		System.out.println("balance = "+blnce);
	}
}
class person1
{
	public static void main(String x[])
	{
		customer c = new customer();
		c.display();
	}
}
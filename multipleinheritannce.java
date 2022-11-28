import java.util.*;
interface acc
{
	int ac = 10;
	void show();
}
class person
{
	int id;
	void accept()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the Id:");
		id = t.nextInt();
	}
	void display()
	{
		System.out.println("ID = "+id);
	}
}
class customer extends person implements acc
{
	int blnce;
	void accept()
	{
		super.accept();
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the blnce:");
		blnce = t.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("blnce = "+blnce);
	}
	public void show()
	{
		System.out.println("Acc no = "+ac);
	}
}
class customer1
{
	public static void main(String x[])
	{
		customer c = new customer();
		c.accept();
		c.display();
		c.show();
	}
}

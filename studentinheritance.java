import java.util.*;
class student
{
	int roll;
	String name;
	student()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the roll number and name:");
		roll = t.nextInt();
		name = t.next();
	}
	void display()
	{
		System.out.println("Name =  "+name+"\n"+"Roll number = "+roll);
	}
}
class test extends student
{
	int m1, m2;
	test()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the M1:");
		m1 = t.nextInt();
		System.out.print("Enter the M2:");
		m2 = t.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("M1 = "+m1);
		System.out.println("M2 = "+m2);
	}
}
class score extends student
{
	int score;
	score()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the score:");
		score = t.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Score = "+score);
	}
}
class student1
{
	public static void main(String x[])
	{
		test c = new test();
		c.display();
		score s = new score();		
		s.display();
	}
}
import java.util.*;
class student
{
	String name;
	int roll_no;
	student()
	{
		Scanner t =new Scanner(System.in);
		System.out.print("Enter the name of the student:");
		name = t.next();
		System.out.print("Enter the Roll number of the student:");
		roll_no = t.nextInt();
	}
	void display()
	{
		System.out.println("Name of the student:"+name);
		System.out.println("Roll Number of the student:"+roll_no);
	}
}
class student1
{
	public static void main(String x[])
	{
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the number of student:");
		int n = t.nextInt();
		student s[] = new student[n];
		for(int i=0; i<n; i++)
		{
			s[i] = new student();
			s[i].display();
		}	
	}
}
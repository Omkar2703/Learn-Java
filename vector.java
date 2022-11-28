import java.util.*;
class vector
{
	public static void main(String x[])
	{
		Scanner t = new Scanner(System.in);
	Vector v = new Vector();
	System.out.print("\nEnter the number of students:");
	int n = t.nextInt();
	for(int i=0; i<n; i++)
	{
		System.out.print("Enter the name of student:");
		String s = t.next();	
		v.addElement(s);
	}
	while(true)
	{
		System.out.println("\nMenu\n1. Insert record\n2. Delete record\n3. Display Records\n4. Exit\n");
		System.out.print("Enter the choice:");
		int ch = t.nextInt();
		if(ch==4)
		{
			System.out.println("Exit Satisfied.");
			break;
		}
		switch(ch)
		{
			case 1:
			{
				System.out.print("\nEnter the name and position");
				String s1 = t.next();
				int p = t.nextInt();
				v.insertElementAt(s1, p);
				System.out.println("Record Inserted Successfully");
			}
			break;
			case 2:
			{
				System.out.print("\nEnter the Element to be deleted:");
				String s2 = t.next();
				v.removeElement(s2);
				System.out.println("Record Deleted Successfully");
			}
			break;
			case 3:
			{
				for(int i=0; i<v.size(); i++)
				{
					System.out.println(v.elementAt(i).toString());
				}
			}
			break;
			default:
			{
				System.out.println("Invalid Choice.");
			}
		}
	}
	}
}
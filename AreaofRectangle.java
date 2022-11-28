import java.util.*;
class Rectangle
{
int length, breadth;
Scanner t = new Scanner(System.in);
void accept()
 {
 	System.out.print("Enter the Length and breadth:");
	length = t.nextInt();
	breadth = t.nextInt();
 }
void Area()
 {
 	int area = length*breadth;
	System.out.println("Area of the rectangle:"+area);
 }
}
class Rectangle1
{
 public static void main(String x[])
 {
 	Rectangle r1 = new Rectangle();	
	Rectangle r2 = new Rectangle();
	r1.accept();
	r1.Area();
	r2.accept();
	r2.Area();  
 }
}

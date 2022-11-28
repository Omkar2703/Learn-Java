import java.util.*;
class A extends Thread
{
	public void  run()
	{
		for(int i=2; i<=20; i=i+2)
		{
			System.out.println("Even number:"+i);
		}
	}
}
class B extends Thread
{
	public void  run()
	{
		for(int i=1; i<=20; i=i+2)
		{
			System.out.println("Odd number:"+i);
		}
	}
}
class test
{
	public static void main(String x[]) throws InterruptedException
	{
		A a = new A();
		B b = new B();
		a.start();
		a.join();
		b.start();
		b.join();
		System.out.println("End");
	}
}
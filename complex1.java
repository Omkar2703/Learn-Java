class complex
{
	int x, y;
	void accept(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println(x+" +i "+y);
	}
	void add(complex p, complex q)
	{
		x = p.x + q.x;
		y = p.y + q.y;
	}
}
class complex1
{
	public static void main(String x[])
	{
		complex c1 = new complex();
		complex c2 = new complex();
		complex c3 = new complex();
		c1.accept(2, 3);
		c1.display();
		c2.accept(4, 5);
		c2.display();
		System.out.println("--------");
		c3.add(c1, c2);
		c3.display();
	}
}
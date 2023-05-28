class A
{
	A()
	{
		this(2554);
		System.out.println("Hello Java");
	}
	A(int x)
	{
		System.out.println(x);
	}
}
class Test
{
	public static void main(String args[])
	{
		A obj=new A();
	}
}
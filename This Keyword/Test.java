class Account
{
	Account();
	{
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	Account(int x)
	{
		this();
		System.out.print(x);
	}
}
class Test
{
	public static void main(String args[])
	{
		Accont obj=new Account(2554);
	}
}

class Account
{
	int n;
	static int roi=5;
	void input(int n)
	{
		this.n=n;
		System.out.print(n);
	}
	static void disp()
	{
		System.out.print(roi);
	}
}
class This
{
	public static void main(String args[])
	{
		Account obj=new Account();
		obj.input(12345);
		Account.disp();
	}
}
class A
{
	public static void main(String a[])
	{
		System.out.print("A");
	}
}
class B extends A
{
	A a=new A();
	public static void main(String ar[])
	{
		System.out.print("B");
		A.main(ar);
	}
}


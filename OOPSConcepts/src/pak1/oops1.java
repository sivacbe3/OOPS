package pak1;

public class oops1 {
	
	public static void main(String[] args) 
	{
		oops1 obj = new oops2();
		obj.f1();
	}

	public void f1()
	{
		System.out.println("Function 1");
	}

	public static void f1(int i)
	{
		System.out.println("Function 2: "+i);
	}
	
	public static class oops2 extends oops1 {
		
		public void f1()
		{
			System.out.println("Function 3");
		}
	}
}
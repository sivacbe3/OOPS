package pak1;

public class eCo {

	public static void main(String[] args) 
	{
		f1();
		f2();
	}
	
	public static void f1()
	{
		try {
			System.out.println("Exception : "+1/0);
			}
		catch (ArithmeticException e)
			{
				System.out.println("e : "+e);
			}
	}
	
	public static void f2()
	{
		try {
				String[] TD = new String [2];
				System.out.println("#### : "+TD[3]);
			}
		
		catch (ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("e1 : "+e1);
		}
	}
}
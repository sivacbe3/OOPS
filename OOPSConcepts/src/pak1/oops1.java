package pak1;

public class oops1 {
	
	private int items; 	
	public static void main(String[] args) 
	{
		oops1 obj = new oops2();
		oops2 obj1 = (oops2) obj;
		obj.f1();
		obj1.f1();
		
	}

	@SuppressWarnings("static-access")
	public void f1()
	{
		System.out.println("Function 1");
		this.f1(getItems());
	}

	public static void f1(int i)
	{
		int j =0;
		System.out.println("Function 2: "+i);
	}
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public static class oops2 extends oops1 {
		
		public void f1()
		{
			System.out.println("Function 3");
		}
	}
}
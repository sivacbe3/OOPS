package pak1;
public class infy implements inf1, inf2 {
	public static void main (String[] args) 
	{
		inf1 obj1 = new infy();
		inf2 obj2 = new infy();
		
		obj1.f1();
		obj2.f2();
		System.out.println(obj1.f1("Test"));
	}

	public void f1() {
		System.out.println("Implementing From Inferface F1");		
	}

	public void f2() {
		System.out.println("Implementing From Inferface F2 : "+w1);	
	}

	public String f1(String S1) {
		System.out.println("Implementing From Inferface F3 : "+S1);
		return S1;
	}
}
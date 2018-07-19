package com.impl;





 public class DemoStatic {
	
	static int x=1;
	
	public int y;
	
	public static class A{
		
		public static void display()
		{
			System.out.println("A called");
		}
		
		public void show()
		{
			System.out.println(x);
			x++;
			
		}
	}
	
	public class B{
		
		public void focus()
		{
			System.out.println(y);
			System.out.println(x);
		}
	}

}

// class DemoStatic{
//	public static void main(String[] args)
//	{
//		A.display();
//		Impl.A a = new Impl.A();
//		a.show();
//		a.show();
//		Impl im =  new Impl();
//		Impl.B b = im.new B();
//		b.focus();
//	}
//	
//}

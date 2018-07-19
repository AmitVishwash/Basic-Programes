package com.impl;

import com.impl.DemoStatic.A;








public class StaticImplDemo {

	public static void main(String[] args) {
		A.display();
		DemoStatic.A a = new DemoStatic.A();
		a.show();
		a.show();
		DemoStatic d = new DemoStatic();
		DemoStatic.B b = d.new B();
		b.focus();
		
		
		
		
		
	}

}

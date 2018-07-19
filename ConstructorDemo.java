package com.impl;



class Const{
	
	protected int x,y;
	public Const(int _x,int _y)
	{
		this.x=_x;
		this.y=_y;
	}

	public Const() {
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println("x:"+ x+" y: "+y);
		
	}
	
	
}
public class ConstructorDemo {
	
	public static void main(String[] args)
	{
		//Demo d = new Demo(2,3);
		Const d =  new Const();
		System.out.println(d.x);
		
	}

}

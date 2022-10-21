package com.java;
@FunctionalInterface
interface MyInterface{
	void display();
}
public class InstanceMethod {
public void myMethod() {
	System.out.println("Instance Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InstanceMethod im=new InstanceMethod();
    im.myMethod();
    MyInterface ref=im::myMethod;
    ref.display();
	}

}

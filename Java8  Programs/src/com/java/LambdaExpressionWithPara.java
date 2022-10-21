package com.java;

 interface Test1{
	 void print();
 }
 

 interface Test2{
	 public int  print(Integer p);
		
	 
 } 

 interface Test3{
	 void print(Integer p1,Integer p2);
	 
 }
 
 
public class LambdaExpressionWithPara {
 static void noParameter(Test1 t) {
	t.print();
}
 static void singleParameter(Test2 t1,Integer p) {
	t1.print(p);
}
 
 static void multiParameter(Test3 t2,Integer p1,Integer p2) {
	t2.print(p1,p2);
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("No Parameter:");
	 noParameter(()->System.out.println("Hello"));
	 
	 System.out.print("single Parameter:");
	 //Test2(p->System.out.println(p),10);
	 
	 Test2 sp=(num)->{
		 if(num%2==0) {
			 return 0;
		 }else{
			 return 1;
		 }
	 };
	 System.out.println("check even odd:"+sp.print(12));
	 System.out.print("Multiparameter:");
	 multiParameter((p1,p2)->System.out.println(p1+","+p2),10,20);
	}

}

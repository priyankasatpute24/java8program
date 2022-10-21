package com.designpat;

 interface Car1{
	public void build();
}
 
 class  Chevrolet implements Car1{
	 public void build() {
		System.out.println(" Chevrolet Car Has been Build");
	}
 }
 class BMW implements Car1{
	 public void build() {
		 System.out.println("BMW Car Has Been Build");
	 }
 }
 class Renault implements Car1{
	 public void build() {
		 System.out.println(" Renault Car Has Been Build");
	 }
 }
 
 class FacadeCar{
	 private Car1 Chevrolet;
	 private Car1 BMW;
	 private Car1 Renault;
	 
	 public FacadeCar() {
		 this.Chevrolet=new Chevrolet();
		 this.BMW=new BMW();
		 this.Renault=new Renault();
	 }
	 public void buildChevrolet(){
	        Chevrolet.build();
	    }
	 public void buildBmw(){
	        BMW.build();
	    } 
	    public void buildRenault(){
	        Renault.build();
	    }
 }
public class FacadePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 FacadeCar fc = new  FacadeCar();
	         fc.buildChevrolet();
	         fc.buildBmw();
	         fc.buildRenault();
	}

}

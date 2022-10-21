package com.designpat;

class Database {
	private static Database dbObject; 
		
		
 static Database getInstance() {
		if(dbObject==null) {
			dbObject=new Database();
		}
		return dbObject;
	}
	public void getConnection() {
		System.out.println("You are now connected to the database..");
	}
}
public class SingletonDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Database db1;
          db1=Database.getInstance();
          db1.getConnection();
	}

}

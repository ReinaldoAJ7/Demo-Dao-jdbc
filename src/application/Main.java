package application;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Department dept = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Bob Brown", " bob@gmail.com", new java.util.Date(), 3000.0, dept);
		
		System.out.println(seller);
		
		System.out.println(dept);
	}

}

//Program to test Product class
public class ProductDemo {
	public static void main(String[] args) {

		//Create two product objects
		Product p1 = new Product("Hammer", 7.99,new Date(1,2,2015));
		Product p2 = new Product();
		Product p3 = new Product("Television", 1000.00, new Date(4,22,2012));

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
			
	}
}



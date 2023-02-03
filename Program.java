import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner input = new Scanner(System.in);
		System.out.println("Product name: ");
		String name = input.nextLine();
		System.out.println("Product price: ");
		double price = input.nextDouble();
		System.out.println("Product quantity in stock: ");
		int quantity = input.nextInt();
			Product product =  new Product(name, price, quantity);
			
System.out.println(product);
}
}
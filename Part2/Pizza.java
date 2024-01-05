package lab5.Lab5Part2;

import java.util.Scanner;

public class Pizza extends Food{
	String type;
	String size;
	@Override
	public void customize() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pizza type: ");
		type = scan.next();
		System.out.println("Enter the pizza size (small/medium/large): ");
		size = scan.next();
		scan.close();
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + size + " " + type + " pizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing " + size + " " + type + " pizza");
	}
}

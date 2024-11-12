package assignment;

import java.util.Scanner;

public class asgone {

	public static void main(String[] args) {
		
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("enter ur name:");
			String name=scan.nextLine();
			
			System.out.println("enter ur rollnumber:");
			Double rollnum= scan.nextDouble();
			
			System.out.println("enter ur Letter:");
			char letter=scan.next().charAt(0);
			
			System.out.println("enter ur percentage:");
			float percent=scan.nextFloat();
			
			System.out.println(name);
			System.out.println(rollnum);
			System.out.println(letter);
			System.out.println(percent+"%");

	}

}

package project1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");

		String name=sc.nextLine();
		System.out.println("enter your num:");
		int rollnum=sc.nextInt();
		System.out.println("enter your CHARACTER:");
		char app=sc.next().charAt(0);
		System.out.println("enter your PERCENTAGE:");
		float perc=sc.nextFloat();
		System.out.println(name);
		System.out.println(rollnum);
		System.out.println(app);
		System.out.println(perc+"%");
	}

}

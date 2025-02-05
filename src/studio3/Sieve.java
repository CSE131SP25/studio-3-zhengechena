package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		System.out.println("Initial Number: " + n);
		boolean [] number = new boolean [n];
		for (int i = 1; i < number.length; i++) {
			number[i] = true;
			if (i%2==0) {
				number[i]= false;
			}
			else {
			System.out.println(i);
			}
			
		}
		

	}
}

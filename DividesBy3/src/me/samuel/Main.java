//package me.samuel;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	System.out.println("\n \nEnter a number to divide by 3: ");
//	double input = in.nextInt();
//	double result = input/3;
//	System.out.println(result);
//	}
//
//
//public class main {}
//}



package me.samuel;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n \nEnter a number to divide by 3 and multiply by 2: ");
		Scanner input = new Scanner(System.in);
		int theInteger = input.nextInt();

		System.out.println("Your number is: " + theInteger);

		int numSum = divideBy3(theInteger);
		System.out.println("The result = " + numSum);

		int numProduct = multBy2(theInteger);
		System.out.println("The result = " +numProduct);
	}

	public static int divideBy3(int theInteger){
		int x = theInteger / 2;
		return x;
	}

	public static int multBy2(int theInteger) {
		int x = theInteger * 2;
		return x;
	}
}
package me.samuel;

//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Enter a random number");
//        Scanner userInput = new Scanner(System.in);
//        int numberHolder = userInput.nextInt();
//        userInput.nextLine();
//            System.out.println("You typed "+numberHolder);
//
//    }
//}

//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        double result;
//        String inches;
//
//        for (int value=1; value<= 15; value+=1){
//
//            Scanner keyboard = new Scanner(System.in);
//
//            System.out.println("Enter a measurement in inches: ");
//            inches = keyboard.next();
//            result = Integer.parseInt(inches) * 25.4;
//            System.out.println("Your measurement in millimeters is: " + result);
//
//            System.out.println(value);
//        }
//    }
//}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inches = 1;

//        do{
//            System.out.println("Enter a value: ");
//            int userInput = input.nextInt();
//            double millimeter = userInput*25.4;
//            System.out.println(userInput+" inches = "+millimeter+" millimeters.");
//            inches++;
//        }while (inches<= 15);

        while(inches<=15){
            System.out.println("Enter a value: ");
            int userInput = input.nextInt();
            double millimeter = userInput*25.4;
            System.out.println(userInput+" inches = "+millimeter+" millimeters.");
            inches++;

        }
    }
}

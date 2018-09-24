package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Box, oval, or diamond? ");
        String answer = input.nextLine();

        if (answer.equals("box") || answer.equals("Box"))
            System.out.println("********" + "\n*      *" + "\n*      *" + "\n*      *" + "\n********");

        else if (answer.equals("oval") || answer.equals("Oval"))
            System.out.println("  ***  " + "\n *   * " + "\n*     *" + "\n*     *" + "\n *   * " + "\n  ***  ");

        else if (answer.equals("diamond") || answer.equals("Diamond"))
            System.out.println("   *   " + "\n  * *  " + "\n *   * " + "\n  * *  " + "\n   *   ");

        else
            System.out.println("That is not a valid option.");
    }
}
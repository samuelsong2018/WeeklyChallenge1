package me.samuel;

import java.util.Random;

public class Main
{
    public static void main ( String[] args )
    {
        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println( "My random number is " + x );

        System.out.println( "Here are some numbers from 1 to 5!" );
        System.out.print( 1 + r.nextInt(1) + " " );
        System.out.print( 1 + r.nextInt(3) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(7) + " " );
        System.out.print( 1 + r.nextInt(9) + " " );
        System.out.print( 1 + r.nextInt(10) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print( 1 + r.nextInt(1) + "\t" );
        System.out.print( 1 + r.nextInt(20) + "\t" );
        System.out.print( 1 + r.nextInt(40) + "\t" );
        System.out.print( 1 + r.nextInt(60) + "\t" );
        System.out.print( 1 + r.nextInt(80) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }
    }
}

package com.codewithmosh;

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner num11 = new Scanner(System.in);
        System.out.print("enter number1 :");
        int number1 = num11.nextInt();

        Scanner num22 = new Scanner(System.in);
        System.out.print("enter number2 :");
        int number2 = num22.nextInt();

        Scanner num = new Scanner(System.in);
        System.out.print("enter number3 :");
        int number3 = num.nextInt();


        if( number1>=number2 && number1>=number3 )

            System.out.println( number1 + " is the largest number");
        else if ( number2>=number1 && number2>=number3 )
            System.out.println( number2 + " is the largest number");

        else if (number3>=number1 && number3>=number2)
        System.out.println(number3 + " is the largest number");

    }



}

//Ethan Andrews
//Period 8
//Program 21
//This program calculates if an iteger is even or odd and tells the user what number it ends with.

import java.util.Scanner;
public class Program21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,onesDigit, evenOdd;
        System.out.println("Enter an integer greater than 10 and less than 1000:");
        num1 = sc.nextInt();
        evenOdd = num1%2;
        onesDigit = num1%10;
        switch(evenOdd){
            case 0: System.out.println(num1+" is an even number");
            break;
            case 1: System.out.println(num1+" is an odd number");
        }
        switch(onesDigit){
            case 0: System.out.println(num1+" ends with a 0");
            break;
            case 1: System.out.println(num1+" ends with a 1.");
            break;
            case 2: System.out.println(num1+" ends with a 2.");
            break;
            case 3: System.out.println(num1+" ends with a 3.");
            break;
            case 4: System.out.println(num1+" ends with a 4.");
            break;
            case 5: System.out.println(num1+" ends with a 5.");
            break;
            case 6: System.out.println(num1+" ends with a 6.");
            break;
            case 7: System.out.println(num1+" ends with a 7.");
            break;
            case 8: System.out.println(num1+" ends with a 8.");
            break;
            case 9: System.out.println(num1+" ends with a 9.");
        }
    }
}
/*
Enter an integer greater than 10 and less than 1000:
996
996 is an even number
996 ends with a 6.

Enter an integer greater than 10 and less than 1000:
123
123 is an odd number
123 ends with a 3.
 */
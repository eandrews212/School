//Ethan Andrews
//Period 8
//Program 12
//This program finds the number of quaters dimes nickels and pennies to give back to the customer.

import java.util.Scanner;
public class Program12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c, q, d, n, p;
        
        System.out.print("Enter change [0...99]: "); 
        c = sc.nextInt();
        
        q = c/25;
        c = c % 25;
        d = c/10;
        c = c % 10;
        n = c/5;
        c = c % 5;
        p = c;
        
        System.out.println("The coins: Quater(s):  "+q);
        System.out.println("           Dime(s):    "+d);
        System.out.println("           Nickel(s):  "+n);
        System.out.println("           Penny(ies): "+p);
    }
}
/*
Enter change [0...99]: 16
The coins: Quater(s):  0
           Dime(s):    1
           Nickel(s):  1
           Penny(ies): 1

Enter change [0...99]: 91
The coins: Quater(s):  3
           Dime(s):    1
           Nickel(s):  1
           Penny(ies): 1

Enter change [0...99]: 83
The coins: Quater(s):  3
           Dime(s):    0
           Nickel(s):  1
           Penny(ies): 3
           
Enter change [0...99]: 85
The coins: Quater(s):  3
           Dime(s):    1
           Nickel(s):  0
           Penny(ies): 0
           
Enter change [0...99]: 99
The coins: Quater(s):  3
           Dime(s):    2
           Nickel(s):  0
           Penny(ies): 4

 */
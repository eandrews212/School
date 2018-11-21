//Ethan Andrews
//Period 8
//Program18
//This program determines if an integer is a multiple of another integer.

import java.util.Scanner;
public class Program18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, remainder;
        boolean multiple = false;
        
        System.out.println("Enter two integers (larger first):");
        a = sc.nextInt();
        b = sc.nextInt();
        remainder = a%b;
        
        if(remainder==0){
           multiple = true;
        }
        if(multiple == true){
           System.out.println(a+" is a multiple of "+b);   
        }
        if(multiple == false){
           System.out.println(a+" is not a multiple of "+b);
        }  
    }
}
/*
Enter two integers (larger first):
30
10
30 is a multiple of 10
 */
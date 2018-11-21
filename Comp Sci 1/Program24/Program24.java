//Ethan Andrews
//Period 8
//Program24
//This program writes my name out as many times as I enter using a for loop.

import java.util.Scanner;
public class Program24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any integer from 1 to 20: ");
        num = sc.nextInt();
        for (int x=1;x<=num;x++){
            System.out.println("Ethan");
        }
    }
}
/*
Enter any integer from 1 to 20: 3
Ethan
Ethan
Ethan

Enter any integer from 1 to 20: 7
Ethan
Ethan
Ethan
Ethan
Ethan
Ethan
Ethan
 */
//Ethan Andrews
//Period 8
//Program22
//This program determines if a year is or was an election year. If a year is or was not an election year it determines how close (in years) it was to an election year.

import java.util.Scanner;
public class Program22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter any year: ");
        year = sc.nextInt();
        
        year = year%4;
        switch(year){
            case 0: System.out.println("Election Year"); 
            break;
            case 1: System.out.println("Last Year Was An Election Year"); 
            break;
            case 2: System.out.println("The Election Was Two Years Ago"); 
            break;
            case 3: System.out.println("The Next Year Is An Election Year");
        }
    }
}
/*
Enter any year: 1956
Election Year

Enter any year: 2016
Election Year

Enter any year: 2017
Last Year Was An Election Year

Enter any year: 2018
The Election Was Two Years Ago

Enter any year: 2015
The Next Year Is An Election Year
 */
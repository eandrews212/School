//Ethan Andrews
//Period 8
//ProgramTrip
//This program calculates how long a persons trip will be depending on what vehicle they drive in and if they stop for food.

import java.util.Scanner;
import java.text.*;
public class ProgramTrip{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        DecimalFormat round=new DecimalFormat("0");
        double miles, hours, minutes, hm;
        char vehicle, food;
        System.out.print("How many miles will you be traveling? ");
        miles = sc.nextDouble();
        System.out.println("***Key: T=Truck, S=SUV, V=Van, C=Car");
        System.out.print("Enter type of vehicle you will drive(T, S, V, or C): ");
        vehicle = sc.next(".").charAt(0);
        System.out.print("Will you be stopping for food(Y/N)? ");
        food = sc.next(".").charAt(0);
        if (food=='Y'){
            miles=miles+30;
        }
        if (vehicle=='C'||vehicle=='T'){
            hm=miles/60;
        }else
            hm=miles/50;
        hours=Math.floor(hm);    
        minutes=(hm-hours)*60;
        System.out.println("Total time for your trip will be: "+round.format(hours)+" hours and "+round.format(minutes)+" minutes");                        
    }
}
/*
How many miles will you be traveling? 250
***Key: T=Truck, S=SUV, V=Van, C=Car
Enter type of vehicle you will drive(T, S, V, or C): C
Will you be stopping for food(Y/N)? N
Total time for your trip will be: 4 hours and 10 minutes

How many miles will you be traveling? 180
***Key: T=Truck, S=SUV, V=Van, C=Car
Enter type of vehicle you will drive(T, S, V, or C): S
Will you be stopping for food(Y/N)? Y
Total time for your trip will be: 4 hours and 12 minutes

How many miles will you be traveling? 842
***Key: T=Truck, S=SUV, V=Van, C=Car
Enter type of vehicle you will drive(T, S, V, or C): T
Will you be stopping for food(Y/N)? Y
Total time for your trip will be: 14 hours and 32 minutes
 */
//Ethan Andrews
//Period 8
//Program 19
//This program determines the pay a worker will get based on their hours and their hourly rate of pay.

import java.util.Scanner;
import java.text.*;
public class Program19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double rate, hours, pay;
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Enter hours: ");
        hours = sc.nextDouble();
        System.out.print("Enter rate: ");
        rate = sc.nextDouble();
        if (hours > 40){
            pay = (hours-40.0)*(rate*1.5)+(rate*40); 
        }else
            pay = rate*hours;
        System.out.print("Pay: $"+df.format(pay));
    }
}
/*
Enter hours: 25
Enter rate: 8
Pay: $200.00

Enter hours: 40
Enter rate: 10
Pay: $400.00

Enter hours: 48
Enter rate: 12
Pay: $624.00

Enter hours: 49.5
Enter rate: 8.80
Pay: $477.40
 */
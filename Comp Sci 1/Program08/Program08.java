//Ethan Andrews
//Period08
//Program08
//This program finds the compound intrest of money you deposit into a bank.
import java.util.Scanner;
import java.text.*;
public class Program08{
    public static void main(String args[]){
        double A, P, I, C, N;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter the principal: ");
        P = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        N = sc.nextDouble();
        System.out.print("Enter the number of times compounded: ");
        C = sc.nextDouble();
        System.out.print("Enter the interest rate: ");
        I = sc.nextDouble();
        A = P*Math.pow((1+I/100/C),N*C);
        System.out.print("\nSaving $"+P+" for "+N+" years at "+I+"% interest compounded "+C+" times a year will result in $"+(df.format(A)));
    }
}
/*
Enter the principal: 1000
Enter the number of years: 2
Enter the number of times compounded: 4
Enter the interest rate: 6

Saving $1000.0 for 2.0 years at 6.0% interest compounded 4.0 times a year will result in $1126.49

Enter the principal: 2500
Enter the number of years: 5
Enter the number of times compounded: 360
Enter the interest rate: 5.7

Saving $2500.0 for 5.0 years at 5.7% interest compounded 360.0 times a year will result in $3324.33

Enter the principal: 24
Enter the number of years: 394
Enter the number of times compounded: 2
Enter the interest rate: 6

Saving $24.0 for 394.0 years at 6.0% interest compounded 2.0 times a year will result in $313288396140.69
 */
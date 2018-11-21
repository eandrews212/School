//Ethan Andrews
//Period 8
//Program10
//This program reverses an inputed 2 digit number.
import java.util.Scanner;
public class Program11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, num1, num2;
        
        System.out.print("Enter any 2-digit number: ");
        num = sc.nextInt();
        num1 = num % 10;
        num2 = num/10;
        System.out.print("The number in reverse is: "+num1+num2);
    }
}
/*
Enter any 2-digit number: 89
The number in reverse is: 98
 */
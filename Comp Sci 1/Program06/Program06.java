//Ethan Andrews
//Period 8
//Program06
//This program find the roots of a line using the quadratic formula
import java.util.Scanner;
public class Program06{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, x2;
        System.out.print("Enter the first coefficient: ");
        a = sc.nextDouble();
        System.out.print("Enter the second coefficient: ");
        b = sc.nextDouble();
        System.out.print("Enter the third coefficient: ");
        c = sc.nextDouble();
        x = ((-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
        x2 = ((-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
        System.out.print("\nThe roots are "+x+" and "+x2);
    }
}
/*
Enter the first coefficient: 1
Enter the second coefficient: -1
Enter the third coefficient: -6

The roots are 3.0 and -2.0

Enter the first coefficient: 2
Enter the second coefficient: -11
Enter the third coefficient: -21

The roots are 7.0 and -1.5

Enter the first coefficient: 1
Enter the second coefficient: 0
Enter the third coefficient: -49

The roots are 7.0 and -7.0

Enter the first coefficient: 3
Enter the second coefficient: 7
Enter the third coefficient: -8

The roots are 0.8402657631320493 and -3.1735990964653826

Enter the first coefficient: 1
Enter the second coefficient: -360
Enter the third coefficient: 32400

The roots are 180.0 and 180.0
 */
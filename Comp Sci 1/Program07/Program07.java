//Ethan Andrews
//Period 8
//Program08
//This program finds the slope, midpoint, length, and equation of a line using 2 points.
import java.util.Scanner;
public class Program07{
    public static void main(String args[]){
        double x1, x2, y1, y2, m, b, midpt1, midpt2, dist;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter point 1:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter point 2:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        m = (y2-y1)/(x2-x1);
        System.out.println("\nThe slope is "+m);
        midpt1 = (x1+x2)/2;
        midpt2 = (y1+y2)/2;
        System.out.println("The midpt is("+midpt1+","+midpt2+")");
        dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The length is "+dist);
        b = y1-m*x1;
        System.out.println("The equation is y="+m+"x+"+b);
    }
}
/*
Enter point 1:
2
3
Enter point 2:
4
5

The slope is 1.0
The midpt is(3.0,4.0)
The length is 2.8284271247461903
The equation is y=1.0x+1.0

Enter point 1:
4
0
Enter point 2:
0
6

The slope is -1.5
The midpt is(2.0,3.0)
The length is 7.211102550927978
The equation is y=-1.5x+6.0

Enter point 1:
5
7
Enter point 2:
-2
1

The slope is 0.8571428571428571
The midpt is(1.5,4.0)
The length is 9.219544457292887
The equation is y=0.8571428571428571x+2.7142857142857144

Enter point 1:
1
-8
Enter point 2:
-7
-8

The slope is -0.0
The midpt is(-3.0,-8.0)
The length is 8.0
The equation is y=-0.0x+-8.0
 */
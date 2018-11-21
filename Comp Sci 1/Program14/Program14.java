//Ethan Andrews
//Period 8
//Program 14
//This program determines if three numbers are in ascending order or not.
import java.util.Scanner;
public class Program14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Enter 3 integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a<b&&b<c){
            System.out.println(a+" "+b+" "+c+" are in ascending order.");
        }else{
            System.out.println("The numbers are not in ascending order.");
        }
    }
}
/*
Enter 3 integers:
37
70
80
37 70 80 are in ascending order.

Enter 3 integers:
90
65
75
The numbers are not in ascending order.

Enter 3 integers:
85
50
40
The numbers are not in ascending order.

Enter 3 integers:
65
67
52
The numbers are not in ascending order.

Enter 3 integers:
80
78
76
The numbers are not in ascending order.

Enter 3 integers:
62
58
42
The numbers are not in ascending order.

Enter 3 integers:
-19
-18
0
-19 -18 0 are in ascending order.

Enter 3 integers:
-19
-22
0
The numbers are not in ascending order.
 */
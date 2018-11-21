//Ethan Andrews
//Period 8
//Program15
//This program determines if three lengths can form a triangle.
import java.util.Scanner;
public class Program15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, tri;
        
        System.out.println("Enter three integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("A triangle is formed.");
        }else
            System.out.println("No triangle can be formed.");
    }
}
/*
Enter three integers:
4
5
6
A triangle is formed.

Enter three integers:
10
10
10
A triangle is formed.

Enter three integers:
1
2
3
No triangle can be formed.

Enter three integers:
3
4
8
No triangle can be formed.

Enter three integers:
8
7
1
No triangle can be formed.

Enter three integers:
2
50
5
No triangle can be formed.

Enter three integers:
9
60
61
A triangle is formed.
 */
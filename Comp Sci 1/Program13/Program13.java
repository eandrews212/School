//Ethan Andrews
//Period 8
//Program13
//This program determines if 3 lengths of a triangle form a right triangle.

import java.util.Scanner;
public class Program13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Enter 3 integer lengths for the sides \nof a triangle (smallest to largest): "); 
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("Lengths "+a+", "+b+", and "+c+" form a right triangle.");
        }else{
            System.out.println("Lengths "+a+", "+b+", and "+c+" do not form a right triangle.");
        }
    }
}
/*
Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
1
2
3
Lengths 1, 2, and 3 do not form a right triangle.

Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
6
7
8
Lengths 6, 7, and 8 do not form a right triangle.

Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
5
12
13
Lengths 5, 12, and 13 form a right triangle.

Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
9
40
41
Lengths 9, 40, and 41 form a right triangle.

Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
8
15
17
Lengths 8, 15, and 17 form a right triangle.

Enter 3 integer lengths for the sides 
of a triangle (smallest to largest): 
10
11
20
Lengths 10, 11, and 20 do not form a right triangle.
 */
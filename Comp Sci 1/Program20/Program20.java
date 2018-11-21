//Ethan Andrews
//Period 8
//Program 20
//This program determines if a student is passing or failing based on three test grades. It also gives them feedback on how well they are doing.

import java.util.Scanner;
public class Program20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test1, test2, test3, average;
        
        System.out.println("Enter three test grades:");
        test1 = sc.nextInt();
        test2 = sc.nextInt();
        test3 = sc.nextInt();
        
        average = (test1+test2+test3)/3;
        System.out.println("Average: "+average);
        
        if (average>=65){
            System.out.println("Passing");
            if (average>=90){
                System.out.println("Stellar");
            }
            if (average<75){
                System.out.println("Needs improvement");
            }
        }else
            System.out.println("Failing");
    }
}
/*
Enter three test grades:
90
95
100
Average: 95
Passing
Stellar

Enter three test grades:
50
60
70
Average: 60
Failing

Enter three test grades:
78
62
80
Average: 73
Passing
Needs improvement
 */
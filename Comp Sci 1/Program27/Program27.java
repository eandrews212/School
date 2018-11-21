//Ethan Andrews
//Period 8
//Program27
//This program calculates a persons average based on 9 scores.

import java.util.Scanner;
public class Program27{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int score, sum=0; 
        double average;        
        for (int x=1;x<=9;x++){
            System.out.print("Enter score "+x+": ");
            score = sc.nextInt();
            sum = sum+score;
        }
        average = sum/9.0;
        System.out.print("The average is: "+average);        
    }
}
/*
Enter score 1: 3
Enter score 2: 2
Enter score 3: 6
Enter score 4: 1
Enter score 5: 7
Enter score 6: -3
Enter score 7: 8
Enter score 8: -2
Enter score 9: 15
The average is: 4.111111111111111
 */
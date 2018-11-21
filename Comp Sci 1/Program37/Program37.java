//Ethan Andrews
//Period 8
//Program37
//This program calculates each factor for any integer.
import java.util.Scanner;
public class Program37{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        num = sc.nextInt();
        System.out.print("Factors are:");
        for(int x=1;x<=num;x++){
            if(num%x==0){
                if(x==1){
                    System.out.println("\t"+x);
                }else
                System.out.println("\t\t"+x);
            }
        }
    }
}
/*
Enter any integer: 15
Factors are:	1
		3
		5
		15

Enter any integer: 451
Factors are:	1
		11
		41
		451
		
Enter any integer: 4
Factors are:	1
		2
		4
 */
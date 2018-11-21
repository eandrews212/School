//Ethan Andrews
//Period 8
//Program17
//This program determines if a person can receive credit based upon their income, assets, and liabilities.

import java.util.Scanner;
public class Program17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income, assets, liabilities;
        boolean CreditOk = false;
        
        System.out.println("Enter income, assets, and liabilities:");
        income = sc.nextInt();
        assets = sc.nextInt();
        liabilities = sc.nextInt();
        
        
        if((income>=25000||assets>=100000)&&liabilities<50000){
           CreditOk = true;
        }
        if(CreditOk == true){
           System.out.println("CREDIT");   
        }
        if(CreditOk == false){
           System.out.println("NO CREDIT");
        }  
    }
}
/*
Enter income, assets, and liabilities:
35000
90000
60000
NO CREDIT

Enter income, assets, and liabilities:
35000
90000
40000
CREDIT

Enter income, assets, and liabilities:
12000
120000
38000
CREDIT
 */
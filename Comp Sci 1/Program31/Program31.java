//Ethan Andrews
//Period 8
//Program31
//This program calculates the pay and total amount of money a person would make for 23 days if they had a job that started at $0.01 a day but doubled each day.
import java.text.*;
public class Program31{
    public static void main(String args[]){
        double money=0, total=0;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Day\t\tPay\t\tTotal");
        for (int x=1;x<=23;x++){
            System.out.print(x+"\t\t");
            if(x==1){
                money=.01*1;
            }else
            money=money*2;
            if(x>=18){
                System.out.print("$"+df.format(money)+"\t");
            }else
            System.out.print("$"+df.format(money)+"\t\t");            
            total=total+money;
            System.out.println("$"+df.format(total));
        }
    }
}
/*
Day		Pay		Total
1		$0.01		$0.01
2		$0.02		$0.03
3		$0.04		$0.07
4		$0.08		$0.15
5		$0.16		$0.31
6		$0.32		$0.63
7		$0.64		$1.27
8		$1.28		$2.55
9		$2.56		$5.11
10		$5.12		$10.23
11		$10.24		$20.47
12		$20.48		$40.95
13		$40.96		$81.91
14		$81.92		$163.83
15		$163.84		$327.67
16		$327.68		$655.35
17		$655.36		$1310.71
18		$1310.72	$2621.43
19		$2621.44	$5242.87
20		$5242.88	$10485.75
21		$10485.76	$20971.51
22		$20971.52	$41943.03
23		$41943.04	$83886.07
 */
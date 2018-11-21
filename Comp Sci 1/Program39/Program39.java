///Ethan Andrews
//Period 8
//Program39
//This program finds the four-digit numbers with a special property in which the first 2 digit number plus the last 2 digit number squared is equal to the original number.
public class Program39{
    public static void main(String args[]){
        int num1, num2, num3;
        System.out.println("All four-digit numbers with this property:");
        for(int x=1000;x<9091;x++){
            num1=x%100;
            num2=x%10000/100;
            num3=num1+num2;
            if(x==Math.pow(num3,2)){
                System.out.println(x);
            }
        }
    }
}
/*
All four-digit numbers with this property:
2025
3025
 */
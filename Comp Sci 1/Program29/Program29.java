//Ethan Andrews
//Period 8
//Program28
//This program calculates a pattern of numbers up to 36 and then calculates their total.

public class Program29{
    public static void main(String args[]){
        int y=1, sum=0;
        System.out.print("The numbers are ");
        for (int x=1;x<=36;x=x+y){
            y=y+1;
            sum=x+sum;
            if (x==36){
                System.out.println(x+".");
                break;
            }
            System.out.print(x+", ");
        }
        System.out.println("Total="+sum);
    }
}
/*
The numbers are 1, 3, 6, 10, 15, 21, 28, 36.
Total=120
 */
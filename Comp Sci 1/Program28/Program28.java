//Ethan Andrews
//Period 8
//Program28
//This program calculates the first 19 multiples of 7 starting with 2 and finds their sum.

public class Program28{
    public static void main(String args[]){
        int z=21, y=0, total=0;
        for (int x=0;x<=18;x++){
            y=z+7*x;
            System.out.println("Multiple "+(x+1)+" is "+y);
            total=total+y;
        }
        System.out.println("The sum is "+total);
    }
}
/*
Multiple 1 is 21
Multiple 2 is 28
Multiple 3 is 35
Multiple 4 is 42
Multiple 5 is 49
Multiple 6 is 56
Multiple 7 is 63
Multiple 8 is 70
Multiple 9 is 77
Multiple 10 is 84
Multiple 11 is 91
Multiple 12 is 98
Multiple 13 is 105
Multiple 14 is 112
Multiple 15 is 119
Multiple 16 is 126
Multiple 17 is 133
Multiple 18 is 140
Multiple 19 is 147
The sum is 294
 */
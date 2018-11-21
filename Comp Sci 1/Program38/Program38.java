//Ethan Andrews
//Period 8
//Program38
//This program calculates all 3-digit Armstrong numbers.
public class Program38{
    public static void main(String args[]){
        int num1, num2, num3;
        System.out.println("Armstrong Numbers:");
        for(int x=100;x<1000;x++){
            num1=x%10;
            num2=x%100/10;
            num3=x%1000/100;
            if(x==Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3)){
                System.out.println(x);
            }
        }
    }
}
/*
Armstrong Numbers:
153
370
371
407
 */
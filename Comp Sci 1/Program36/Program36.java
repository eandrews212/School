//Ethan Andrews
//Period 8
//Program36
//This program calculates the value of pi based on John Wallis' formula.
import java.text.*;
public class Program36{
    public static void main(String args[]){
        double pi=1.0, num=0.0, denom=1.0;
        DecimalFormat wholeNumber = new DecimalFormat("0");
        for(int x=2;x<=21;x++){
            if(x%2==0){
                num=num+2.0;
                System.out.print(wholeNumber.format(num)+"/");
            }else
                System.out.print(wholeNumber.format(num)+"/");
            if(x%2!=0){
                denom=denom+2.0;                
                System.out.println(wholeNumber.format(denom));
            }else                
                System.out.println(wholeNumber.format(denom));  
            pi=pi*(num/denom); 
        }
        System.out.println("Pi="+pi*2);
    }
}
/*
2/1
2/3
4/3
4/5
6/5
6/7
8/7
8/9
10/9
10/11
12/11
12/13
14/13
14/15
16/15
16/17
18/17
18/19
20/19
20/21
Pi=3.067703806643497
 */
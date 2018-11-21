//Ethan Andrews
//Period 8
//Program34
//This program calculates the facotorials from 1 to 20.
import java.util.Scanner;
public class Program34{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long y;
        System.out.print("Enter any integer: ");
        y = sc.nextInt();
        for (long x=y;x>=1;x--){
            if(x==y){
                System.out.print(y+"!=");  
            }
            y=y*x;
            if(x<y&&x>1){
                System.out.print(x+"*");
            }else if(x==1){
                System.out.println(x+"="+y);            
            }
        }
    }
}
/*
Enter any integer: 8
8!=8*7*6*5*4*3*2*1=322560

Enter any integer: 9
9!=9*8*7*6*5*4*3*2*1=3265920
 */
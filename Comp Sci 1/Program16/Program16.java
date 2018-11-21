//Ethan Andrews
//Period 8
//Program16
//This program determines if a pesticide can be sprayed based on the temperature, relative humidity, and wind speed.

import java.util.Scanner;
public class Program16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t, r, w;
        Boolean OkToSpray = false;
        
        System.out.println("Enter temperature, relative humidity, and wind speed:");
        t = sc.nextInt();
        r = sc.nextInt();
        w = sc.nextInt();
        
        if(t>=70 && r>15 && r<35 && w<=10){
            OkToSpray = true;
        }
        if(OkToSpray == true){
            System.out.println("SPRAY");   
        }
        if(OkToSpray == false){
            System.out.println("DON'T SPRAY");
        }     
    }
}
/*
Enter temperature, relative humidity, and wind speed:
80
10
8
DON'T SPRAY

Enter temperature, relative humidity, and wind speed:
80
20
5
SPRAY

Enter temperature, relative humidity, and wind speed:
70
36
10
DON'T SPRAY

Enter temperature, relative humidity, and wind speed:
68
17
9
DON'T SPRAY
 */
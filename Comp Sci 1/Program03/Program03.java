//Ethan Andrews
//Period 8
//Program03
//This program will find the circumfrence and area of multiple circles

public class Program03{
    public static void main(String args[]){
        int radius = 7;
        final double PI = 3.14159;
        double circumference = radius * 2 * PI;
        double area = radius * radius * PI; 
        System.out.print("radius: "+radius); 
        System.out.print("\tcircumference: "+circumference );
        System.out.println("\tarea: "+area);
    }
}
/*
 * radius: 7.0  circumfrence: 43.98226  area: 153.93791
 * radius: 8.3     circumfrence: 52.150394000000006    area: 216.42413510000003
 * radius: 5.27    circumfrence: 33.11235859999999 area: 87.25106491099999
 */


//Ethan Andrews
//Period 8
//Program02
//This program will find the area and perimeter of a rectangle
public class Program02{
    public static void main(String args[]){
        double lengthRect = 34.7;
        int widthRect = 23;
        double areaRect = lengthRect * widthRect;
        double perimeterRect = lengthRect * 2 + widthRect * 2;
        
        System.out.println("The length of the rectangle is "+lengthRect);
        System.out.println("The width of the rectangle is \t"+widthRect);
        System.out.print("The perimeter of the rectangle is "+perimeterRect);
        System.out.println("The area of the rectangle is ");
        System.out.println(areaRect);
    }
}
/*The length of the rectangle is 34.7
The width of the rectangle is 	23.0
The perimeter of the rectangle is 115.4
The area of the rectangle is 
798.1
 */
//Ethan Andrews
//Period 8
//Program25
//This program prints all the odd numbers from 97 to 15 using a for loop.

public class Program25{
    public static void main(String args[]){ 
        for (int x=97;x>=15;x=x-2){
            if(x==15){
                System.out.print(x);
                break;
            }
            System.out.print(x+", ");
        }
    }
}
//97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15
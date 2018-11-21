//Ethan Andrews
//Period 8
//Program05
//This program finds the length of a hypotenuse using 2 legs inputed by the user
import java.util.Scanner;
public class Program05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double leg1, leg2, hyp;
        System.out.print("Enter the length of the first leg of the right triangle ");
        leg1 = sc.nextDouble();
        System.out.print("Enter the length of the second leg of the right triangle ");
        leg2 = sc.nextDouble();
        hyp = Math.sqrt(Math.pow(leg1,2)+Math.pow(leg2,2));
        System.out.println("The length of the hypotenuse is "+hyp);
    }
}
/*Enter the length of the first leg of the right triangle 3
 * Enter the length of the second leg of the right triangle 4
 * The length of the hypotenuse is 5.0
 * 
 * Enter the length of the first leg of the right triangle 5
 * Enter the length of the second leg of the right triangle 12
 * The length of the hypotenuse is 13.0
 * 
 * Enter the length of the first leg of the right triangle 9
 * Enter the length of the second leg of the right triangle 40
 * The length of the hypotenuse is 41.0
 * 
 * Enter the length of the first leg of the right triangle 15
 * Enter the length of the second leg of the right triangle 23
 * The length of the hypotenuse is 27.459060435491963
 * 
 * Enter the length of the first leg of the right triangle 13.2
 * Enter the length of the second leg of the right triangle 18.7
 * The length of the hypotenuse is 22.889517251353293
 */
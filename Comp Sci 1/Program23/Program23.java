//Ethan Andrews
//Period 8
//Program23
//This program has a person enter their weight on Earth and then calculates their weight on another planet.

import java.util.Scanner;
public class Program23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double weight, planetWeight=0;
        int planet;
        
        System.out.print("Enter your weight on Earth: ");
        weight = sc.nextInt();
        System.out.println("#\tPlanet\t\tMultiply By\n1\tMercury\t\t0.37\n2\tVenus\t\t0.88\n3\tMars\t\t0.38\n4\tJupiter\t\t2.64\n5\tSaturn\t\t1.15\n6\tUranus\t\t1.15\n7\tNeptune\t\t1.12");
        System.out.print("Choose a planet from the menu above: ");
        planet = sc.nextInt();
        
        switch(planet){
            case 1: planetWeight=0.37;
                break;
            case 2: planetWeight=0.88;
                break;
            case 3: planetWeight=0.38;
                break;
            case 4: planetWeight=2.64;
                break;
            case 5: planetWeight=1.15;
                break;
            case 6: planetWeight=1.15;
                break;
            case 7: planetWeight=1.12;
        }
        weight = planetWeight*weight;
        System.out.println("Your weight on that planet is: "+weight);
    }
}
/*
Enter your weight on Earth: 127
#   Planet      Multiply By
1   Mercury     0.37
2   Venus       0.88
3   Mars        0.38
4   Jupiter     2.64
5   Saturn      1.15
6   Uranus      1.15
7   Neptune     1.12
Choose a planet from the menu above: 7
Your weight on that planet is: 142.24

Enter your weight on Earth: 345
#   Planet      Multiply By
1   Mercury     0.37
2   Venus       0.88
3   Mars        0.38
4   Jupiter     2.64
5   Saturn      1.15
6   Uranus      1.15
7   Neptune     1.12
Choose a planet from the menu above: 3
Your weight on that planet is: 131.1

Enter your weight on Earth: 204
#   Planet      Multiply By
1   Mercury     0.37
2   Venus       0.88
3   Mars        0.38
4   Jupiter     2.64
5   Saturn      1.15
6   Uranus      1.15
7   Neptune     1.12
Choose a planet from the menu above: 4
Your weight on that planet is: 538.5600000000001
 */
//Ethan Andrews
//Period 8
//Program04
//This program converts fahrenheit to celcius.
public class Program04{
    public static void main(String args[]){
        double F = 100;
        double C = (F - 32) * (5.0/9.0);
        System.out.println("A temperature of " + F + " degrees F is " +C+" degrees C.");
    }
}
/*
 * A temperature of 212.0 degrees F is 100.0 degrees C
 * A temperature of 0.0 degrees F is -17.77777777777778 degrees C.
 * A temperature of -20.0 degrees F is -28.88888888888889 degrees C.
 * A temperature of 14.7 degrees F is -9.611111111111112 degrees C.
 * A temperature of 100.0 degrees F is 37.77777777777778 degrees C.
 */
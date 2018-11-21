//Ethan Andrews
//Period 8
//Program35
//This program calculates the first 25 terms of the Fibonacci Sequence.
public class Program35{
    public static void main(String args[]){
        int current, previous1=0, previous2=1;
        System.out.println("The Fibonacci Sequence:");
        for (int x=1;x<=25;x++){
            current=previous1+previous2;
            if(current==1){
                System.out.print(current+", "+current+", ");
            }else if(x>1&&x<25){
                System.out.print(current+", ");
            }else if(x==25){
                System.out.print(current);
            }
            previous1=previous2;
            previous2=current;            
        }
    }
}
/*
The Fibonacci Sequence:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393
 */
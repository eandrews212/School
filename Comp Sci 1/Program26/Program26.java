//Ethan Andrews
//Period 8
//Program26
//This program prints the first 20 multiples of 3 then says That's all folks!

public class Program26{
    public static void main(String args[]){
        int y=0;
        for (int x=1;x<=20;x++){
            y=x*3;
            System.out.print(y+" ");
            if (x==20){
                System.out.print("\nThat's all folks!");
            }
        }
    }
}
/*
3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 
That's all folks!
 */
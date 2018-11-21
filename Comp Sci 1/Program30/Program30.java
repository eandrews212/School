//Ethan Andrews
//Period 8
//Program30
//This program prints the first 16 multiples of 2 then finds their product.

public class Program30{
    public static void main(String args[]){
        int y=0;
        long product = 1;
        for (int x=1;x<=16;x++){
            y=x*2;
            product = y*product;            
            if (x==16){
                System.out.println(y);
                break;
            }
            System.out.print(y+" ");
        }
        System.out.print("The product is "+product);
    }
}
/*
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32
The product is 1371195958099968000
 */
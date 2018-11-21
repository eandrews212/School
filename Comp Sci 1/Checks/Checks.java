
/**
 * Write a description of class Checks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checks
{
    public static void main(String args[]){
        int p=50, x;
        for(x=5;x>=1;x--){
            p=p-2;
            System.out.print(p+" ");
            if(p%4==0){
                System.out.println("Ms. Avellino is great");
            }
        }
    }
}

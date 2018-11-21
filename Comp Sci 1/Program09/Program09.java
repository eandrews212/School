//Ethan Andrews
//Period 8
//Program09

//This program uses dialog boxes to have the user input 3 numbers and the program then finds the largest number, the sum of the numbers, and the average of all three numbers.
import javax.swing.JOptionPane;
public class Program09{
    public static void main(String args[]){
        String num1, num2, num3;
        int num11, num22, num33;
        int sum=0;
        float avg=1;
        
        num1 = JOptionPane.showInputDialog("Enter first integer");
        num2 = JOptionPane.showInputDialog("Enter second integer");
        num3 = JOptionPane.showInputDialog("Enter third integer");
        num11 = Integer.parseInt(num1);
        num22 = Integer.parseInt(num2);
        num33 = Integer.parseInt(num3);
        
        if(num11>num22&&num11>num33){
             JOptionPane.showMessageDialog(null,"The largest number is "+num11, "Max", JOptionPane.PLAIN_MESSAGE);
        }
        else if(num22>num33&&num22>num11){
             JOptionPane.showMessageDialog(null,"The largest number is "+num22, "Max", JOptionPane.PLAIN_MESSAGE); 
        }
        else if(num33>num22&&num33>num11){
             JOptionPane.showMessageDialog(null,"The largest number is "+num33, "Max", JOptionPane.PLAIN_MESSAGE); 
        }
        
        sum = num11+num22+num33;
        avg = (float)(sum/3.0);
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"The average is "+avg,"Average", JOptionPane.WARNING_MESSAGE);
    }
}

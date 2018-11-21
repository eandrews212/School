//Ethan Andrews
//Period 8
//Program 10
//This program take the distance from a building and the angle of elevation to the top of the building and finds the buildings height.

import javax.swing.JOptionPane;
public class Program10{
    public static void main(String args[]){
        String dis, ang;
        int dis2, ang2;
        double height=1;
        double rad;
        
        dis = JOptionPane.showInputDialog("Enter distance from building");
        ang = JOptionPane.showInputDialog("Enter angle to top of building");
        dis2 = Integer.parseInt(dis);
        ang2 = Integer.parseInt(ang);
        rad = (ang2/180.0)*3.14159;
        
        height = (Math.tan(rad))*dis2;
        JOptionPane.showMessageDialog(null,"The height is "+height,"Height", JOptionPane.INFORMATION_MESSAGE);
    }
}

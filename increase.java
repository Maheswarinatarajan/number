import javax.swing.JOptionPane;
import java.util.*;
 
public class Exercise613{
 
    public static void main(String [] args){  
      int[] ArrayList={1,2};  
 
      System.out.println(doubleCapacity(ArrayList));
 }  
 public static int[] doubleCapacity(int[] list){  
 
     int[] Newlist = new int[list.length *2];
     return Newlist;
 }  
}
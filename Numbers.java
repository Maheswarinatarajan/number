/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i>=0){
            System.out.println("positive");
        }
        else
            System.out.println("negative");
    }
}

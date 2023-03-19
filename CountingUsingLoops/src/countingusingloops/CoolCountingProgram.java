/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author vanes
 */
public class CoolCountingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run_app = true;
        while (run_app == true){
            Scanner input = new Scanner(System.in);
        System.out.println("--- Cool Counting Program ---");
        System.out.println("");
        System.out.println("Please enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... count from 6000 to 1000 by 1000");
        System.out.println("5... Exit program");
        System.out.println("Please enter your choice: ");
        int user_choice = input.nextInt();
        System.out.println("");
        System.out.println("------------------------------------");
        
        switch (user_choice) {
            case 1:
                System.out.println("You have chosen to count from 0 to 10 by 1:");
                for (int i = 0; i <= 10; i = i + 1) {
                    System.out.println(i);
                }
                System.out.println("------------------------------------");
                break;
            case 2:
                System.out.println("You have chosen to count from 100 to 0 by 10:");
                for (int i = 100; i >= 0; i = i - 10) {
                    System.out.println(i);
                }
                System.out.println("------------------------------------");
                break;
            case 3:
                System.out.println("You have chosen to count from 50 to 500 by 50:");
                for (int i = 50; i <= 500; i = i + 50) {
                    System.out.println(i);
                }
                System.out.println("------------------------------------");
                break;
            case 4:
                System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
                for (int i = 6000; i >= 1000; i = i - 1000) {
                    System.out.println(i);   
                }
                System.out.println("------------------------------------");
                break;
            case 5:
                System.out.print("See you next time and thank you for using the Cool Counting Program!");
                run_app = false;
                break;
            default:
                System.out.println("That is not a valid response... Try again.");
        }
        
    }
        }
        
    
}

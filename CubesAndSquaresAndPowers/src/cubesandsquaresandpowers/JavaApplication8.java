/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesandsquaresandpowers;
import java.util.Scanner;
/**
 *
 * @author vanes
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run_app = true;
        int x = 0;
        while (run_app == true){
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("1... Find the value of a number squared");
        System.out.println("2... Find the value of a number cubed");
        System.out.println("3... Find the value of a number, to any power");
        System.out.println("4... Exit");
        System.out.println("---------------------------------------------");
        System.out.print("Please enter in an option: ");
        int user_option = input.nextInt();
        if (user_option == 1) {
            System.out.print("What number would you like to be squared? ");
            int num_squared = input.nextInt();
            x = num_squared;
            for (int i = 1; i <= 1; i++){
                x = x * num_squared;
            }
            System.out.println("The answer is " + x);
        }
        if (user_option == 2) {
            System.out.print("What number would you like to be cubed? ");
            int num_cubed = input.nextInt();
            x = num_cubed;
            for (int i = 1; i <= 2; i++){
                x = x * num_cubed;
            }
            System.out.println("The answer is " + x);
        }
        if (user_option == 3) {
            System.out.print("What number would you like to be powered? ");
            int num_powered = input.nextInt();
            System.out.print("What power would you like to use? ");
            int power = input.nextInt();
            x = num_powered;
            if (power == 0) {
                System.out.print("The answer is 1");
            }
            else if (power > 0){
            for (int i = 1; i <= power -1; i++){
                x = x * num_powered;
            }
            System.out.println("The answer is " + x);  
            
            }
            else{
                System.out.println("You can't power " + num_powered + " by " + power);
            }
            }
        if (user_option == 4) {
            System.out.print("Goodbye! ");
            run_app = false;
        }
        }
    }
}

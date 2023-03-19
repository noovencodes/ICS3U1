/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavalidationprogram;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author vanes
 */
public class DataValidationProgram {

    /**
     * @param args the command line arguments
     */
    public static int parseInt(String s) {
        String str = s;
        boolean isNeg = false;
        int numberconv = 0;
        if (str.indexOf('-') > 0) {
            isNeg = true;
            str.replaceAll("-", "");
        }
        try{
            numberconv = Integer.parseInt(str);
            if (isNeg) {
                numberconv = numberconv * -1;
            }
//            System.out.println(numberconv); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return numberconv;
    }
    
    public static String title(){
        String name;
        Scanner input = new Scanner (System.in);
        System.out.print("Hello! This program will feature stages, each with different instructions on to what to input.");
        System.out.println(" If you don't follow the instructions, the program will just ask you to enter an answer again.");
        System.out.println("Can you make it through all six stages? Let's find out!");
        System.out.print("What is your name? ");
        return (name = input.nextLine());
    }
     
    public static void stagex(String name, String msg, int stage, String question){                           
    String input_stagex = "";
    boolean run_stagex = true;
    Scanner input = new Scanner (System.in);
    System.out.println(msg);
    System.out.println("-------------------------------");
    while (run_stagex == true){
            System.out.println("STAGE " + stage + ":");
            System.out.print(question);
            input_stagex = input.nextLine();

            switch (stage) {
            case 1:
                if (input_stagex.length() > 6){
                    run_stagex = false;
                }
            break;
            case 2:
                if (input_stagex.contains("a")){
                    run_stagex = false;
                }
            break;
            case 3:
                if (input_stagex.length() >= 5 && input_stagex.length() <= 15 && !input_stagex.contains("z")){
                   run_stagex = false;
                }
            break;
            case 4:
                if (input_stagex.matches("[0-9]+")) {
                    if ((parseInt(input_stagex) >= 5 && parseInt(input_stagex) <= 500)) {
                       run_stagex = false;
                    }
                } 
            break;
            case 5:
                    if ( (input_stagex.matches(".*[a-zA-Z]+.*")) || (input_stagex.contains(".")) ) {
//                      // try and error (input_stagex.contains(".")) [a-zA-Z0-9\\-]*
                        continue;}
                    else {
                           if (parseInt(input_stagex) < 0) {
                           run_stagex = false;
                    }
                } 
            break;
            case 6:
                if ( (input_stagex.matches(".*[a-zA-Z]+.*")) || (input_stagex.contains(".")) ) {
                        continue;}
                else {
                     if ((parseInt(input_stagex) > 0 && parseInt(input_stagex) % 2 == 1)){
                         run_stagex = false;
                     }

                 
                } 
            break;
        }
        System.out.println("-------------------------------");    
    }
}
     
    public static void main(String[] args) {
        String msg, question = "";
        int stage = 0;
        String name = title();        
        // Stage 1
        stage = 1;
        msg = "Ok, " + name + "! On to the first stage...";
        question = "Enter in a string that is greater than 6 characters long: ";
        stagex(name, msg, stage, question);
        // Stage 2
        stage = 2;
        msg = "Great job, " + name + "! Time for stage " + stage + "...";        
        question = "Enter in a string that contains at least one lowercase "+ "\"a\"" + ": "; 
        stagex(name, msg, stage, question);
        // Stage 3
        stage = 3;
        msg = "Great job, " + name + "! Time for stage " + stage + "...";        
        question = "Enter in a string that is between 5 and 15 characters long, and does not contain the letter “z”: "; 
        stagex(name, msg, stage, question);
        // Stage 4
        stage = 4;
        msg = "Great job, " + name + "! Time for stage " + stage + "...";        
        question = "Enter in an integer between 5 and 500: "; 
        stagex(name, msg, stage, question);
        // Stage 5
        stage = 5;        
        msg = "Great job, " + name + "! Time for stage " + stage + "...";        
        question = "Enter in a negative integer: "; 
        stagex(name, msg, stage, question);
        // Stage 6        
        stage = 6;        
        msg = "Wow, " + name + "! You've made it to the final stage...";
        question = "Enter in a positive, odd integer: "; ;
        stagex(name, msg, stage, question);
        System.out.println("CONGRATULATIONS, " + name.toUpperCase() + "! You've made it through all 6 stages. Thanks for playing! :)");
    }
   
}

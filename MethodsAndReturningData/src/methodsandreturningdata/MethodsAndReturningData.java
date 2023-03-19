/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandreturningdata;
import java.util.Scanner;

/**
 *
 * @author vanes
 */
public class MethodsAndReturningData {
    Scanner input = new Scanner(System.in);
    public static void title() {
        System.out.println("Welcome to the Ultimate Calculator Tool!");
        System.out.println("Check out all 10 different mathematical caluclations below. Once you've made a selection, type in the number the calculation correponds to, put in the required data, and enjoy!");
        }
    
    public static void menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("1... Divide two numbers");
        System.out.println("2... Find the volume of a sphere");
        System.out.println("3... Find the area of a triangle");
        System.out.println("4... Determine the circumference of a circle");
        System.out.println("5... Find the radius of a circle");
        System.out.println("6... Determine if a number is prime");
        System.out.println("7... Determine the slope of a line");
        System.out.println("8... Calculate speed");
        System.out.println("9... Calculate distance");
        System.out.println("10... Determine the factorial of a number");
        System.out.println("11... Exit");
        System.out.println("-----------------------------------------------");
        
    }
    
    public static double divide(double num1, double num2){
       return (num1 / num2);    
    }
    
    public static double volume_of_sphere(double diameter){
       // volume = 4/3 Math.PI * Math.pow(radius (diameter / 2), 3)
       if (diameter <= 0){
           return(0);
        }
        else{
          double radius = diameter / 2;
          return (Math.pow(radius, 3)* 4/3 * Math.PI);  
        }
    }
    
    public static double area_of_triangle(double base, double height){
        // area = base * height / 2
        if (base <= 0 || height <= 0){
           return(0);
        }
        else{
           return ((base * height) / 2);
        }
    }
    
    public static double circumference_of_circle(double radius){
        // circumference = 2 * Math.PI * radius
        if (radius <= 0){
           return(0);
        }
        else{
           return (2 * Math.PI * radius); 
        }
    }
    
    public static double radius_of_circle(double circumference){
        // radius = circumference / 2 * Math.PI
        if (circumference <= 0){
           return(0);
        }
        else{
           return (circumference / (2 * Math.PI)); 
        }
    }
    
    public static double slope_of_line(double xcoord1, double ycoord1, double xcoord2, double ycoord2){
        // m = rise / run, m = ycoor2 - ycoord1 / xcoord2 - xcoord1
        double rise = ycoord2 - ycoord1;
        double run = xcoord2 - xcoord1;
        return (rise / run);
    }
    
    public static double speed_of(double distance, double time){
        // speed = distance / time

        return (distance / time);
    }
    
    public static double distance_of(double xcoord1, double ycoord1, double xcoord2, double ycoord2){
        // x = xcoord2 - xcoord1, y = ycoord2, ycoord1 d^2 = x^2 + y^2 Math.sqrt(d^2)
        double x = xcoord2 - xcoord1;
        double y = ycoord2 - ycoord1;
        double d_squared = Math.pow(x, 2)+ Math.pow(y, 2);
        
        return (Math.sqrt(d_squared));
    }
    
    public static int factorial(int num1){
        int mult_by_number = 0;
        for (int i = num1; i >= 1 ; i-- ){
            if (i == num1){
                mult_by_number = num1;
            }
            else{
            mult_by_number = mult_by_number * i;
            }
        }
        return(mult_by_number);
    }
    
    public static String prime_number(int num1){
        boolean prime = true;
        for (int i = 2; i < num1; i++){
            if (num1 % i == 0){
                prime = false;
            }
        }
        if (num1 == 1){
            return (num1 + " is not a prime number.");
        }
        else if (prime == true){
            return (num1 + " is a prime number.");
        }
        else{
            return (num1 + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        title();
        boolean run_app = true;
        while (run_app == true){
        Scanner input = new Scanner (System.in);
        menu();
        System.out.print("Please enter your choice: ");
        int user_choice = input.nextInt();
        System.out.println("-----------------------------------------------");
        switch (user_choice) {
            case 1:
                System.out.println("You have chosen to divide two numbers.");
                System.out.print("Enter in the first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter in the second number: ");
                double num2 = input.nextDouble();
                System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                break;
                
            case 2:
                System.out.println("You have chosen to find the volume of a sphere.");
                System.out.print("Enter in the diameter of the sphere: ");
                double diameter = input.nextDouble();
                System.out.println("The volume of a sphere with a diameter of " + diameter + " is " + volume_of_sphere(diameter));
                break;
            
            case 3:
                System.out.println("You have chosen to find the area of a triangle.");
                System.out.print("Enter in the base of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter in the height of the triangle: ");
                double height = input.nextDouble();
                System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + area_of_triangle(base, height));
                break;
                
            case 4:
                System.out.println("You have chosen to determine the circumference of a circle.");
                System.out.print("Enter in the radius of the circle: ");
                double radius = input.nextDouble();
                System.out.println("The circumference of a circle with a radius of " + radius + " is " + circumference_of_circle(radius));
                break;
                
            case 5:
                System.out.println("You have chosen to find the radius of a circle.");
                System.out.print("Enter in the circumference of the circle: ");
                double circumference = input.nextDouble();
                System.out.println("The radius of a circle with a circumference of " + circumference + " is " + radius_of_circle(circumference));
                break;
                
            case 6:
                System.out.println("You have chosen to determine if a number is prime.");
                System.out.print("Enter in the number you would like to check: ");
                int num = input.nextInt();
                System.out.println(prime_number(num));
                break;
            
            case 7:
                System.out.println("You have chosen to determine the slope of a line.");
                System.out.print("Enter in the first x-coordinate: ");
                double xcoord1 = input.nextDouble();
                System.out.print("Enter in the first y-coordinate: ");
                double ycoord1 = input.nextDouble();
                System.out.print("Enter in the second x-coordinate: ");
                double xcoord2 = input.nextDouble();
                System.out.print("Enter in the second y-coordinate: ");
                double ycoord2 = input.nextDouble();
                System.out.println("The slope of a line that crosses through coordinates " + xcoord1 + ", " + ycoord1 + " and " + xcoord2 + ", " + ycoord2 + " is " + slope_of_line(xcoord1,ycoord1, xcoord2, ycoord2));
                break;
                
            case 8:
                System.out.println("You have chosen to calculate speed.");
                System.out.print("Enter in the distance (km): ");
                double distance = input.nextDouble();
                System.out.print("Enter in the time (hr): ");
                double time = input.nextDouble();
                if (time == 0){
                    System.out.println("The time can't be 0. How would anything be able to travel that fast?!?!");
                }
                else{
                    System.out.println("The speed of something traveling " + distance + " km in " + time + " hrs is " + speed_of(distance, time) + "km/hr");
                }
                break;
            
            case 9:
                System.out.println("You have chosen to calculate distance.");
                System.out.print("Enter in the first x-coordinate: ");
                double x_coord1 = input.nextDouble();
                System.out.print("Enter in the first y-coordinate: ");
                double y_coord1 = input.nextDouble();
                System.out.print("Enter in the second x-coordinate: ");
                double x_coord2 = input.nextDouble();
                System.out.print("Enter in the second y-coordinate: ");
                double y_coord2 = input.nextDouble();
                System.out.println("The distance of something that starts at " + x_coord1 + ", " + y_coord1 + " and ends up at " + x_coord2 + ", " + y_coord2 + " is " + distance_of(x_coord1,y_coord1, x_coord2, y_coord2));
                break;
                
            case 10:
                System.out.println("You have chosen to determine the factorial of a number.");
                System.out.print("Enter in the number you would like to check: ");
                int num_factorial = input.nextInt();
                System.out.println("The factorial of the number " + num_factorial + " is " + factorial(num_factorial));
                break;
                
            case 11:
                System.out.println("You have chosen to exit the program... See you next time!");
                run_app = false;
                break;
                
            default:
                System.out.println("That's not a proper response. Try again.");
                }
            
        }
        
    }
    
}

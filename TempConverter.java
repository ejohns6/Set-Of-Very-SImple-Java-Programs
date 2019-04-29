import java.util.Scanner;
public class TempConverter{
        //do methods before main string
        public static void fahrenheitToCelsius() {
            double fTemp, cTemp;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a Fahrenheit tempature:  ");
            fTemp = input.nextDouble();
            input.close();
            
            cTemp = (double)5/(double)9*(fTemp - 32);
            System.out.println("The Celsius tempature is  " +cTemp);
        }
        //start of a new method
        public static void celsiusToFahrenheit() {
            double cTemp, fTemp;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a Celsius tmepature:  ");
            cTemp = input.nextDouble(); 
            input.close();
            
            fTemp = (double)9/(double)5*cTemp+32;
            System.out.println("The Fahrenheit tempature is  " +fTemp);
        }
        //start of the main string
        public static void main(String[] args) {
            int choice;
            Scanner input = new Scanner(System.in);
            
            System.out.println("1. Fahrenheit to Celsius conversion.");
            System.out.println("2. Celsius to Fahrenheit conversion.");
            System.out.print("Enter your choice:  ");
            //decsides which mehtod to do
            choice = input.nextInt();
            //do a switch statment know
            if (choice == 1) {
                fahrenheitToCelsius();
            } else {
                celsiusToFahrenheit();
            }
            input.close();
        }
    }

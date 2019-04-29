import java.util.Scanner;
public class MetricConversion{
    public static void inchesToCentimeters(double num) {
        double  cent;
        Scanner input = new Scanner(System.in);
        
        cent = num * 2.54;
        System.out.println(num +" inches equals " +cent +" centimeters");
    }
    public static void feetToCentimeters(double num) {
        double  cent;
        Scanner input = new Scanner(System.in);
        
        cent = num * 30;
        System.out.println(num +" feet equals " +cent +" centimeters");
    }
    public static void yardsToMeters(double num) {
        double  meters;
        Scanner input = new Scanner(System.in);
        
        meters = num * .91;
        System.out.println(num +" yards equals " +meters +" meters");
    }
    public static void milesToKilometers(double num) {
        double  kilo;
        Scanner input = new Scanner(System.in);
        
        kilo = num * 1.6;
        System.out.println(num +" miles equals " +kilo +" Kilometers");
    }
    public static void centimetersToInches(double num) {
        double  inches;
        Scanner input = new Scanner(System.in);
        
        inches = num / 2.54;
        System.out.println(num +" centimeters equals " +inches +" inche");
    }
    public static void centimetersToFeet(double num) {
        double  feet;
        Scanner input = new Scanner(System.in);
        
        feet = num / 30;
        System.out.println(num +" centimeters equals " +feet+" centimeters");
    }
    public static void metersToYards(double num) {
        double  yards;
        Scanner input = new Scanner(System.in);
        
        yards = num / .91;
        System.out.println(num +" meters equals " +yards +" yards");
    }
    public static void kilometersToMiles(double num) {
        double  miles;
        Scanner input = new Scanner(System.in);
        
        miles = num / 1.6;
        System.out.println(num +" kilometers equals " +miles +" Miles");
    }
    public static void main(String[]  args) {
        double num;
        int choice;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:  ");
        num = input.nextInt();
        
        System.out.println("Convert:");
        System.out.println("1. Inches to Centimeters        5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters          6. Centimeters to Feet");
        System.out.println("3. Yards to Meters              7. Meters to Yards");
        System.out.println("4. Miles to Kilometers          8. Kilometers to Miles");
        
        System.out.print("Enter your choice:  ");
            choice = input.nextInt();
            if (choice == 1){
                inchesToCentimeters(num);
            }else if(choice == 2){
                feetToCentimeters(num);
            }else if(choice == 3){
                yardsToMeters(num);
            }else if(choice == 4){
                milesToKilometers(num);
            }else if(choice == 5){
                centimetersToInches(num);
            }else if(choice == 6){
                centimetersToFeet(num);
            }else if(choice == 7){
                metersToYards(num);
            }else if(choice == 8){
                kilometersToMiles(num);
            }
    }
}
 
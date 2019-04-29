import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.lang.String;

public class returnInitals
{
    
    public static String firstInital(String a) {
        String first="";
        first=a.substring(0, 1);
        return(first);
    }
    public static String middleInital(String b) {
        String middle="";
         middle=b.substring(0, 1);
         return(middle);
    }
    public static String lastInital(String c) {
         String last=""; 
         last=c.substring(0, 1);
         return(last);
    }
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        String first="";
        String middle="";
        String last="";
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter your first name:");
        a = input.next();
        System.out.print("Enter your middle initial:");
        b = input.next();
        System.out.print("Enter your last name:");
        c = input.next();
        first = firstInital(a); 
        middle = middleInital(b); 
        last = lastInital(c); 
        System.out.print(first.toUpperCase() +middle.toUpperCase() +last.toUpperCase());
    }
}

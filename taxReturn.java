import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.lang.String;

public class taxReturn
{
    public static double money(double beforTax) {
        if(beforTax < 8500 && beforTax >= 0){
            beforTax = beforTax -(beforTax*.1);
        }else if(beforTax < 34500 && beforTax >= 8500){
            beforTax = beforTax -(beforTax*.15);
        }else if(beforTax < 83600 && beforTax >= 34500){
            beforTax = beforTax -(beforTax*.25);
        }else if(beforTax < 174000 && beforTax >= 83600){
            beforTax = beforTax -(beforTax*.28);
        }else if(beforTax < 379150 && beforTax >= 174000){
            beforTax = beforTax -(beforTax*.33);
        }else if(beforTax >= 379150){
            beforTax = beforTax -(beforTax*.35);
        }

        return(beforTax);
    }
    public static void main(String[] args){
    double beforTax;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter in the amount of money you make annually: $");
    beforTax = input.nextInt();
    beforTax = money(beforTax);
    System.out.println("Your return Net pay is " +money.format(beforTax));
    }
}

import java.util.Scanner;
import java.text.NumberFormat;

public class AddCoins
{
    public static void addCon(int Quarters,int Dimes,int Nickles,int Pennies) {
        double Total;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        Total= (Quarters*.25)+(Dimes*.1)+(Nickles*.05)+(Pennies*.01);
        System.out.println();
        System.out.print("Total: " +money.format(Total));
    }
    public static void main(String[] args){
        int Quarters;
        int Dimes;
        int Nickles;
        int Pennies;
        Scanner input = new Scanner (System.in);
        System.out.print("Quarters:  ");
        Quarters = input.nextInt();
        System.out.print("Dimes:  ");
        Dimes = input.nextInt();
        System.out.print("Nickles:  ");
        Nickles = input.nextInt();
        System.out.print("Pennies:  ");
        Pennies = input.nextInt();
        addCon(Quarters, Dimes, Nickles, Pennies);
}
}

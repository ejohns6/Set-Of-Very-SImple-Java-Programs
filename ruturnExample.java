import java.util.Scanner;
import java.text.NumberFormat;

public class ruturnExample{
public static int onesDigit (int number) {
	int digit;
digit = number % 10;
return(digit);
}
public static void main(String[] args){
int num;
Scanner intput = new Scanner(System.in);
System.out.println("Number?");
num = intput.nextInt();
System.out.print("Ones digit is");
System.out.print(onesDigit(num));
System.out.println("");
}
}
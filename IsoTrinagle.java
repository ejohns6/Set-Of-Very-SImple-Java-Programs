import java.util.Scanner;

public class IsoTrinagle
{
    public static void drawBar(int length) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i <= length; i ++){
            System.out.print("$");
        }
        System.out.println();
    }
    public static void addSpaces(int spaces){
        Scanner input = new Scanner (System.in);
        for(int i=spaces; i > 0; i--){
        System.out.print(" ");
    }
}
    public static void main(String[] args){
        int length;
        int b=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size:  ");
        length = input.nextInt();
        int spaces = (int)(length-1);
        length= length *3-1;

        for(int i=0; i <= length; i= i+2){
            addSpaces(spaces);
            drawBar(i);
            length--;
            spaces--;
            b+=1;
        }
        System.out.println(b+"  " +spaces);
}
}

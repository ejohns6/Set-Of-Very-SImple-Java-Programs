import java.util.Scanner;
public class House{
    public static void addRoof() {
        System.out.print("        /\\       \\ \n");
        System.out.print("       /  \\      /  \n");
        System.out.print("      /    \\     _ \n");
        System.out.print("     /      \\   | |     /\\\n");
        System.out.print("    /        \\  | |    /  \\\n");
        System.out.print("   /          \\ | |   /    \\\n");
        System.out.print("  /            \\| |  /      \\\n");
        System.out.print(" /              \\ | /        \\\n");
        System.out.print("/________________\\ /          \\\n");
    }
    
    public static void addBase() {
        System.out.print("|   _       _    |/_____________\\\n");
        System.out.print("|  |_|  _  |_|   |   |       |  |\n");
        System.out.print("|      | |       |---+-------+--|\n");
        System.out.print("|______|_|_______|___|_______|__|\n");
    }
    
    public static void addWalk() {
        System.out.print("       **         |             |\n");
        System.out.print("       *********  |             |\n");
        System.out.print("               *  |             |\n");
        System.out.print("               *  |             |\n");
        System.out.print("               *  |             |\n");
        System.out.print("               *  |_____________|\n");
        System.out.print("******************|__|__|__|__|_|\n");
    }
    
        public static void main(String[] args) {
            addRoof();
            addBase();
            addWalk();
        }
}

package bank;
import java.util.Scanner;
import java.util.Arrays;

public class DisplayState2
{
    public static void main(String args[]) {
        final int SIZE = 3;
        Scanner in = new Scanner(System.in);
        String countries[] = new String[SIZE];
        String capitals[] = new String[SIZE];
        System.out.println("Enter " + SIZE 
            + " countries and their capitals");
        
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter country name: ");
            countries[i] = in.nextLine();
            System.out.print("Enter its capital: ");
            capitals[i] = in.nextLine();
        }
        
        System.out.println("Country Names\t\tCapital");
        for (int i = 0; i < SIZE; i++) {
            char ch = Character.toUpperCase(countries[i].charAt(0));
            if (ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U') {
                System.out.println(countries[i] + "\t\t" + capitals[i]); 
            }
        }
        
    }
}

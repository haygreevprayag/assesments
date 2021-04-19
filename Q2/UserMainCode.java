package bank;
import java.util.Scanner;  

public class PasswordValidator {
  
   
    public static boolean checkPassword(String password)
    {
  
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            return false;
        }
  
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
  
            for (int i = 0; i <= 9; i++) {
  
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            return false;
        }
  
        if (true) {
            int count = 0;
  
    
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        if (true) {
            int count = 0;
  
           
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
       
        return true;
    }
  
  
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);   
    	System.out.print("Please enter the number of strings you want to enter: ");            
    	String[] string = new String [sc.nextInt()];      
    	sc.nextLine();   
    	for (int i = 0; i < string.length; i++)   
    	{  
    	string[i] = sc.nextLine();  
    	}  
    	System.out.println("\nYou have entered: ");  
    	for(String str: string)   
    	{  
    		if (checkPassword(str)) {
                System.out.println("Valid Password");
            }
            else {
                System.out.println("Invalid Password!!!");
            }
    	System.out.println(str);  
    	}  
  
    }
}



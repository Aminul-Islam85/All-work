import java.util.Scanner;

public class FirstProgram {

    
    public static void printOutput(String input) {
        for (int i = 1; i <= input.length(); i++) {
            System.out.println(input.substring(0, i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        String input = scanner.nextLine().trim(); 

        
        if (input.isEmpty()) {
            System.out.println("No input");
        } else {
            
            try {
                int number = Integer.parseInt(input);

                
                if (number >= 0) {
                    printOutput(input);
                } else {
                    System.out.println("'" + input + "' is not a non-negative integer");
                }
            } catch (NumberFormatException e) {
                System.out.println("'" + input + "' is not a non-negative integer");
            }
        }
    }
}

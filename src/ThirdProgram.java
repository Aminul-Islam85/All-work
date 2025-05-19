import java.util.ArrayList;
import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PaintCan> paintcan = new ArrayList<>();
        String continueInput;

        
        do {
        	System.out.println("===Enter paint data(quit end) === ");
            System.out.print("Paint name: ");
            String name = scanner.nextLine();

            System.out.print("Can size in gallons : ");
            double CanSizeInGallons = scanner.nextDouble();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();            
            
            paintcan.add(new PaintCan(name, CanSizeInGallons, price));

            System.out.print("Paint name: (quit)");
            
            continueInput = scanner.nextLine();
            
            System.out.println();
        } while (continueInput.equalsIgnoreCase("y"));        
        
        
        System.out.println("\n=== Paints ===");
        for (PaintCan pc : paintcan) {
            System.out.println(pc.getName() + ": " + pc.getCanSizeInGallons() + " gallons, $" + pc.getPrice());
        }  
                 
            
            
        double minPrice = Double.MAX_VALUE;
        PaintCan cheapestCan = null;
        for (PaintCan pc : paintcan) {
            if (pc.getPrice() < minPrice) {
                minPrice = pc.getPrice();
                cheapestCan = pc;
            }
        }
        
        System.out.println("\n=== Cheapest ===");
        if (cheapestCan != null) {
            System.out.println(cheapestCan.getName() + " ($" + cheapestCan.getPrice() + ")");
        }


        

        scanner.close();
    }
}


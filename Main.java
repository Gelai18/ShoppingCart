import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> cart = new Stack<>();

        while (true) {
            System.out.println("Welcome to Gil-G Store!");
            System.out.println("\nShopping Cart Menu:");
            System.out.println("\n1. Add to cart");
            System.out.println("2. Update cart");
            System.out.println("3. Delete from cart");
            System.out.println("4. View cart");
            System.out.println("5. Search cart");
            System.out.println("6. Exit");
            System.out.print("\nPlease enter the number of your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter the item to add to the cart: ");
                    String newItem = scanner.nextLine();
                    cart.push(newItem);
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> cart = new Stack<>();

        while (true) {
            System.out.println("Welcome to Gil-G Store!");
            System.out.println("\nShopping Cart Menu:");
            System.out.println("\n1. Add to cart");
            System.out.println("2. Update cart");
            System.out.println("3. Delete from cart");
            System.out.println("4. View cart");
            System.out.println("5. Search cart");
            System.out.println("6. Exit");
            System.out.print("\nPlease enter the number of your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter the item to add to the cart: ");
                    String newItem = scanner.nextLine();
                    cart.push(newItem);
                    System.out.println(newItem + " added to the cart.");
                    break;

                case 2:

                    if (!cart.isEmpty()) {
                        System.out.print("Enter the item to update in the cart: ");
                        String itemToUpdate = scanner.nextLine();
                        if (cart.contains(itemToUpdate)) {
                            cart.remove(itemToUpdate);
                            System.out.print("Enter the new item to replace it: ");
                            String updatedItem = scanner.nextLine();
                            cart.push(updatedItem);
                            System.out.println("Cart updated.");
                        } else {
                            System.out.println(itemToUpdate + " is not in the cart.");

                        }
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;

                case 3:

                    if (!cart.isEmpty()) {
                        System.out.print("Enter the item to remove from the cart: ");
                        String itemToRemove = scanner.nextLine();
                        if (cart.remove(itemToRemove)) {
                            System.out.println(itemToRemove + " removed from the cart.");

                        } else {
                            System.out.println(itemToRemove + " is not in the cart.");

                        }
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;
               case 4:

                    if (!cart.isEmpty()) { 
                        System.out.println("Items in the cart:\n");
                        for (String item : cart) {
                            System.out.println(item); 
                        }
                    } else {
                        System.out.println("Cart is empty."); 
                    }
                    break;

                case 5:
                  
                    System.out.print("Enter the item to search in the cart: "); 
                    String itemToSearch = scanner.nextLine(); 
                    if (cart.contains(itemToSearch)) { 
                        System.out.println(itemToSearch + " is in the cart."); 
                    } else {
                        System.out.println(itemToSearch + " is not in the cart."); 
                                                                                  
                    }
                    break;

                case 6:
              
                    System.out.println("Once again, thank you for choosing [Gil-G Store]. We hope your experience was enjoyable, and we look forward to serving you again soon."); 
                    scanner.close(); 
                    System.exit(0); 
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option."); 
                                                                                        
                    break;
            }
        }
    }
}                    System.out.println(newItem + " added to the cart.");
                    break;

                case 2:

                    if (!cart.isEmpty()) {
                        System.out.print("Enter the item to update in the cart: ");
                        String itemToUpdate = scanner.nextLine();
                        if (cart.contains(itemToUpdate)) {
                            cart.remove(itemToUpdate);
                            System.out.print("Enter the new item to replace it: ");
                            String updatedItem = scanner.nextLine();
                            cart.push(updatedItem);
                            System.out.println("Cart updated.");
                        } else {
                            System.out.println(itemToUpdate + " is not in the cart.");

                        }
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;

                case 3:

                    if (!cart.isEmpty()) {
                  System.out.print("Enter the item to remove from the cart: ");
                        String itemToRemove = scanner.nextLine();
                        if (cart.remove(itemToRemove)) {
                            System.out.println(itemToRemove + " removed from the cart.");

                        } else {
                            System.out.println(itemToRemove + " is not in the cart.");

                        }
                    } else {
                        System.out.println("Cart is empty.");
                    }
                    break;
               case 4:

                    if (!cart.isEmpty()) { 
                        System.out.println("Items in the cart:\n");
                        for (String item : cart) {
                            System.out.println(item); 
                        }
                    } else {
                        System.out.println("Cart is empty."); 
                    }
                    break;

                case 5:

package F5.biblioteca;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\nWelcome,please choose an User:");
            System.out.println("1. Login as Administrator");
            System.out.println("2. Login as Guest");
            System.out.println("Enter your option (1 or 2)\n");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                if (option == 1 || option == 2) {
                    break;
                } else {
                    System.out.println("Invalid option. Please enter 1 or 2.\n");
                }
            } else {
                System.out.println("Invalid entry, please enter a number.\n");
                scanner.next();
            }
        }

        if (option == 1) {
            User admin = new User("AdminUser", User.Rol.ADMINISTRATOR);
        } else {
            User guest = new User("GuestUser", User.Rol.GUEST);
        }
    }
}



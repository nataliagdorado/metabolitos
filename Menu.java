import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Metabolitos> arrayMetabolitos = new ArrayList<>();
        Menu menu = new Menu();
        menu.menu(arrayMetabolitos);
    }

    public void menu(ArrayList<Metabolitos> arrayMetabolitos) {
        System.out.println("Menu:");
        System.out.println("1. Añadir metabolitos");
        System.out.println("2. Exit");

        int choice = 0;
        boolean validChoice = false;
        Scanner scanner = new Scanner(System.in);

        while (!validChoice) {
            System.out.println("Introduce la opcion (1 o 2):");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (Excepciones.isInRange(choice, 1, 2)) {
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
            }
        }

        switch (choice) {
            case 1:
                Crud.introduceMetabolitos(arrayMetabolitos);
                break;
            case 2:
                System.out.println("Saliendo");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        // Close the scanner
        scanner.close();
    }



 
}
package uiMain;

import java.util.Scanner;

public class UIMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println(
                    """
                    Welcome to Banco Unal
                    What operation would you like to perform?
                    1. Ask for a loan
                    2. Make payments
                    3. Savings
                    4. Show movements
                    5. Exit
                    """);
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println("See you later");
                    break;
                default:
                    System.out.println("Please, enter a correct option\n");
            }
        }while (option != 5);
    }
}

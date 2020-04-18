package src;

import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        System.out.println("Wellcome in Freedom Books, we are glad see you!");
        System.out.println("Please select point, what you want");
        System.out.println("1 for use book service");
        System.out.println("2 for use author service");
        System.out.println("3 for use user service");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextShort()){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            default: mainMenu();
        }
    }
    public static void CRUDuser(){
        System.out.println("You are select point \"User Service\" ");
        System.out.println("Press -> 1 if you want create ");
        System.out.println("Press -> 2 if you want update ");
        System.out.println("Press -> 3 if you want delete ");
        System.out.println("Press -> 4 if you want select ");
        System.err.println("Press -> any other, if you want return previous step");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextShort()){
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

            case 4:

                break;
            default: Menu.mainMenu();
        }
    }
    public static void CRUDbook(){
        System.out.println("You are select point \"Book Service\" ");
        System.out.println("Press -> 1 if you want create ");
        System.out.println("Press -> 2 if you want update ");
        System.out.println("Press -> 3 if you want delete ");
        System.out.println("Press -> 4 if you want select ");
        System.err.println("Press -> any other, if you want return previous step");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextShort()){
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

            case 4:

                break;
            default: Menu.mainMenu();
        }

    }
    public static void CRUDauthor(){
        System.out.println("You are select point \"Author Service\" ");
        System.out.println("Press -> 1 if you want create ");
        System.out.println("Press -> 2 if you want update ");
        System.out.println("Press -> 3 if you want delete ");
        System.out.println("Press -> 4 if you want select ");
        System.err.println("Press -> any other, if you want return previous step");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextShort()){
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

            case 4:

                break;
            default: Menu.mainMenu();
        }
    }
}

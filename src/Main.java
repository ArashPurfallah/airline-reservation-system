import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true)
        {
            command = printMenu();
            switch (command)
            {
                case "1":
                    System.out.println("Sign in :)");
                    break;
                case "2":
                    System.out.println("Sign up ;)");
                    break;
                default:
                    System.out.println("Not found :|");
                    break;
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static String printMenu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("                    WELCOME TO AIRLINES RESERVATION SYSTEM                               ");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . .MENU OPTIONS . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("1 - Sign in : ");
        System.out.println("2 - Sign up : ");
        String command = scanner.nextLine();
        return command;
    }
    //------------------------------------------------------------------------------------------------------------------
}

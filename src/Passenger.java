import java.util.HashMap;
import java.util.Scanner;

public class Passenger {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //==================================================================================================================
    public void menuPassenger()
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true)
        {
            command = printMenuPassenger();
            switch (command)
            {
                case "1":
                    System.out.println("Change password :)");
                    break;
                case "2":
                    System.out.println("Search flight tickets :)");
                    break;
                case "3":
                    System.out.println("Booking ticket :)");
                    break;
                case "4":
                    System.out.println("Ticket cancellation :)");
                    break;
                case "5":
                    System.out.println("Booked tickets :)");
                    break;
                case "6":
                    System.out.println("Add charge :)");
                    break;
                case "0":
                    System.out.println("Sign out :)");
                    break;
                default:
                    System.out.println("Not found :|");
                    break;
            }
        }
    }
    //==================================================================================================================
    public String printMenuPassenger()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("                              PASSENGER MENU OPTIONS                                     ");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . .MENU OPTIONS . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("1 - Change password : ");
        System.out.println("2 - Search flight tickets : ");
        System.out.println("3 - Booking ticket : ");
        System.out.println("4 - Ticket cancellation : ");
        System.out.println("5 - Booked tickets : ");
        System.out.println("6 - Add charge : ");
        System.out.println("0 - Sign out : ");
        String command = scanner.nextLine();
        return command;
    }
    //==================================================================================================================
}

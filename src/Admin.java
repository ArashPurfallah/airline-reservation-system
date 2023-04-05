import java.util.Scanner;

public class Admin {
    private String userName;
    private String password;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

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
    public void menuAdmin()
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true)
        {
            command = printMenuAdmin();
            switch (command)
            {
                case "1":
                    System.out.println("Add :)");
                    break;
                case "2":
                    System.out.println("Update :)");
                    break;
                case "3":
                    System.out.println("Remove :)");
                    break;
                case "4":
                    System.out.println("Flight schedule :)");
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
    public String printMenuAdmin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("                                Admin MENU OPTIONS                                        ");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(". . . . . . . . . . . . . . . .MENU OPTIONS . . . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("1 - Add : ");
        System.out.println("2 - Update : ");
        System.out.println("3 - Remove : ");
        System.out.println("4 - Flight schedule : ");
        System.out.println("0 - Sign out : ");
        String command = scanner.nextLine();
        return command;
    }
    //==================================================================================================================
}

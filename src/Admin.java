import java.util.HashMap;
import java.util.Map;
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

    /**
     *This method is for admin menu options.
     */
    public void menuAdmin(HashMap < String , Flight > flightHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        //HashMap < String , Flight > flightHashMap = new HashMap<>();
        String command;
        while (true)
        {
            command = printMenuAdmin();
            switch (command)
            {
                case "1":
//                    System.out.println("Add :)");
                    add(flightHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can add another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            add(flightHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can add another flight with enter R:)");
                            System.out.println("OR you can back to the  menu with enter M:)");
                        }else
                        {
                            if (commandR.equals("M"))
                            {
                                break;
                            }else
                            {
                                System.out.println("Invalid: ");
                            }
                        }
                    }
                    break;
                case "2":
//                    System.out.println("Update :)");
                    update(flightHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can update another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            update(flightHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can update another flight with enter R:)");
                            System.out.println("OR you can back to the  menu with enter M:)");
                        }else
                        {
                            if (commandR.equals("M"))
                            {
                                break;
                            }else
                            {
                                System.out.println("Invalid: ");
                            }
                        }
                    }
                    break;
                case "3":
//                    System.out.println("Remove :)");
                    remove(flightHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can remove another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            remove(flightHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can remove another flight with enter R:)");
                            System.out.println("OR you can back to the  menu with enter M:)");
                        }else
                        {
                            if (commandR.equals("M"))
                            {
                                break;
                            }else
                            {
                                System.out.println("Invalid: ");
                            }
                        }
                    }
                    break;
                case "4":
//                    System.out.println("Flight schedule :)");
                    flightSchedule(flightHashMap);
                    System.out.println("Now you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandM = scanner.nextLine();
                        if (commandM.equals("M"))
                        {
                            break;
                        }else
                        {
                            System.out.println("Invalid: ");
                        }
                    }
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
    /**
     *This method prints the menu.
     * @return A command for menu options
     */
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
    /**
     *This method is for adding flights.
     */
    public void add(HashMap < String , Flight > flightHashMap)
    {
        System.out.println("Welcome to the add section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your flight :)");
        Flight flight = new Flight();
        System.out.println("First -----> Please enter flight id :)");
        flight.setFlightId(scanner.nextLine());
        System.out.println("Second -----> Please enter origin of flight :)");
        flight.setOrigin(scanner.nextLine());
        System.out.println("Third -----> Please enter destination of flight :)");
        flight.setDestination(scanner.nextLine());
        System.out.println("Fourth -----> Please enter date of flight :)");
        flight.setDate(scanner.nextLine());
        System.out.println("Fifth ----> Please enter time of flight :)");
        flight.setTime(scanner.nextLine());
        System.out.println("Sixth ----> Please enter price of flight :)");
        flight.setPrice(scanner.nextInt());
        System.out.println("Seventh ----> Please enter seats :)");
        flight.setSeats(scanner.nextInt());
        if (!flightHashMap.containsKey(flight.getFlightId()))
        {
            System.out.println("Your flight is added ;)");
            flightHashMap.put(flight.getFlightId(), flight);
        }else
        {
            System.out.println("This flight has a problem :|");
        }
    }
    //==================================================================================================================

    /**
     *This method is for updating flights.
     */
    public void update(HashMap < String , Flight > flightHashMap)
    {
        System.out.println("Welcome to the update section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please update your flight :)");
        System.out.println("First -----> Please enter flight id :)");
        String flightId = scanner.nextLine();
        if (flightHashMap.containsKey(flightId))
        {
            System.out.println("Second -----> Please enter origin of flight :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getOrigin());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setOrigin(scanner.nextLine());
            System.out.println("Third -----> Please enter destination of flight :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getDestination());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setDestination(scanner.nextLine());
            System.out.println("Fourth -----> Please enter date of flight :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getDate());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setDate(scanner.nextLine());
            System.out.println("Fifth ----> Please enter time of flight :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getTime());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setTime(scanner.nextLine());
            System.out.println("Sixth ----> Please enter price of flight :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getPrice());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setPrice(scanner.nextInt());
            System.out.println("Seventh ----> Please enter seats :)");
            System.out.println("Before : " + flightHashMap.get(flightId).getSeats());
            System.out.print("Now : ");
            flightHashMap.get(flightId).setPrice(scanner.nextInt());
            System.out.println("Your flight is updated ;)");
        }else
        {
            System.out.println("Not found :(");
        }
    }//=================================================================================================================

    /**
     * This method is for removing flights.
     */
    public void remove(HashMap < String , Flight > flightHashMap)
    {
        System.out.println("Welcome to the remove section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter flight id :)");
        String flightId = scanner.nextLine();
        if (flightHashMap.containsKey(flightId))
        {
            System.out.println("Origin : " + flightHashMap.get(flightId).getOrigin());
            System.out.println("Destination : " + flightHashMap.get(flightId).getDestination());
            System.out.println("Date : " + flightHashMap.get(flightId).getDate());
            System.out.println("Time : " + flightHashMap.get(flightId).getTime());
            System.out.println("Price : " + flightHashMap.get(flightId).getPrice());
            System.out.println("Seats : " + flightHashMap.get(flightId).getSeats());
            System.out.println("Are you sure you want to remove it?");
            System.out.println("1 - yes");
            System.out.println("2 - No");
            while (true)
            {
                String command = scanner.nextLine();
                if (command.equals("1"))
                {
                    flightHashMap.remove(flightId);
                    System.out.println("Your flight is removed ;)");
                    break;
                }else
                {
                    if (command.equals("2"))
                    {
                        System.out.println("Your flight is not removed ;)");
                        break;
                    }else
                    {
                        System.out.println("Invalid :|");
                    }
                }
            }
        }else
        {
            System.out.println("Not found :(");
        }
    }
    //==================================================================================================================

    /**
     *This method is for showing flight schedule.
     */
    public void flightSchedule(HashMap < String , Flight > flightHashMap)
    {
        System.out.println("Welcome to the flight schedule section ;)");
        System.out.println("Flights that are currently available -------->");
        System.out.println("|FlightId    |Origin      |Destination |Date        |Time        |Price       |Seats       |");
        for(String key: flightHashMap.keySet()){
            System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%,-12d|%-12d|"  , (flightHashMap.get(key).getFlightId()) , (flightHashMap.get(key).getOrigin()) , (flightHashMap.get(key).getDestination()) , (flightHashMap.get(key).getDate()) , (flightHashMap.get(key).getTime()) , (flightHashMap.get(key).getPrice()) , (flightHashMap.get(key).getSeats()));
            System.out.println();
        }
    }
    //==================================================================================================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineSystem airlineSystem = new AirlineSystem();
        Admin admin = new Admin("Arash Purfallah" , "Admin1234");
        admin.menuAdmin(airlineSystem.getFlightHashMap());
    }
    //==================================================================================================================
}

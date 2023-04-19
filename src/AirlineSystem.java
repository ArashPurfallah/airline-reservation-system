import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AirlineSystem {
    private HashMap<String, Passenger> passengerHashMap;
    private HashMap < String , Flight > flightHashMap;
    private HashMap <String , ArrayList <String>> searchHashMap;
    private HashMap <Flight , ArrayList <Passenger>> flightPassengersHashMap;
    private HashMap<Integer , Ticket> ticketHashMap;
    private int ticketId;
    private Admin admin;
    public AirlineSystem() {
        this.passengerHashMap = new HashMap<String, Passenger>();
        this.flightHashMap = new HashMap<String , Flight>();
        this.searchHashMap = new HashMap<String , ArrayList<String>>();
        this.flightPassengersHashMap = new HashMap<Flight , ArrayList <Passenger>>();
        this.ticketHashMap = new HashMap<Integer , Ticket>();
        this.admin = new Admin("Arash Purfallah" , "admin1234");
    }
    public HashMap<String, Passenger> getPassengerHashMap() {
        return passengerHashMap;
    }

    public void setPassengerHashMap(HashMap<String, Passenger> passengerHashMap) {
        this.passengerHashMap = passengerHashMap;
    }

    public HashMap<String, Flight> getFlightHashMap() {
        return flightHashMap;
    }

    public void setFlightHashMap(HashMap<String, Flight> flightHashMap) {
        this.flightHashMap = flightHashMap;
    }

    public HashMap<String, ArrayList<String>> getSearchHashMap() {
        return searchHashMap;
    }

    public void setSearchHashMap(HashMap<String, ArrayList<String>> searchHashMap) {
        this.searchHashMap = searchHashMap;
    }

    public HashMap<Flight, ArrayList<Passenger>> getFlightPassengersHashMap() {
        return flightPassengersHashMap;
    }

    public void setFlightPassengersHashMap(HashMap<Flight, ArrayList<Passenger>> flightPassengersHashMap) {
        this.flightPassengersHashMap = flightPassengersHashMap;
    }

    public HashMap<Integer, Ticket> getTicketHashMap() {
        return ticketHashMap;
    }

    public void setTicketHashMap(HashMap<Integer, Ticket> ticketHashMap) {
        this.ticketHashMap = ticketHashMap;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
//==================================================================================================================

    /**
     *This method is for main menu options.
     */
    public void mainMenu()
    {
        Scanner scanner = new Scanner(System.in);
        String command;
//        Admin admin = new Admin("Arash Purfallah" , "admin1234");
//        admin.setUserName("Arash Purfallah");
//        admin.setPassword("admin1234");
//        AirlineSystem airlineSystem = new AirlineSystem();
        while (true)
        {
            try {
                command = printMenu();
                switch (command) {
                    case "1":
//                    System.out.println("Sign in :)");
                        signIn(this.passengerHashMap);
                        break;
                    case "2":
//                    System.out.println("Sign up ;)");
                        Passenger passenger = new Passenger();
                        signUp(this.passengerHashMap, passenger);
                        break;
                    default:
                        System.out.println("Not found :|");
                        break;
                }
            }catch (Exception ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }
    //==================================================================================================================
    /**
     *This method prints the menu.
     * @return A command for menu options
     */
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
    //==================================================================================================================

    /**
     * This method is for sign up for passengers.
     */
    public void signUp(HashMap<String , Passenger> passengerHashMap , Passenger passenger)
    {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<AirlineSystem> humanArrayList = new ArrayList<AirlineSystem>();
//        admin.setUserName("Arash Purfallah");
//        admin.setPassword("admin1234");
//        admin.setType("Admin");
//        humanArrayList.add(admin);
        System.out.println("Please Choose a username for your account :)");
//        String userName1 = scanner.nextLine();
//        passenger.setUserName(userName1);
        String userName = scanner.nextLine();
        while (true)
        {
            if (userName.isEmpty())
            {
                System.out.println("Invalid : ");
                userName = scanner.nextLine();
            }else
            {
                break;
            }
        }
//        human.getUserName();
//        while (true)
//        {
//            int tmp = 0;
//            boolean isLast = false;
//            for (int i = 0; i < passengerArrayList.size(); i++) {
//                if(passenger.getUserName().equalsIgnoreCase(passengerArrayList.get(i).getUserName()))
//                {
//                    System.out.println("This username has already been selected. Please choose another username;)");
//                    userName1 = scanner.nextLine();
//                    passenger.setUserName(userName1);
//                    passenger.setUserName(scanner.nextLine());
//                    //tmp = i;
//                    break;
//                }
//                if (i == passengerArrayList.size() - 1)
//                {
//                    isLast = true;
//                }
//            }
//            if (isLast)
//            {
//                break;
//            }
//        }
        System.out.println("Please Choose a password for your account :)");
//        String pass = scanner.nextLine();
//        passenger.setPassword(pass);
        String password = scanner.nextLine();
        while (true)
        {
            if (password.isEmpty())
            {
                System.out.println("Invalid : ");
                password = scanner.nextLine();
            }else
            {
                break;
            }
        }
//        if (passengerArrayList.contains(passenger)) {
//            System.out.println("This username has already been selected. Please choose another username;)");
//            passenger.setUserName(scanner.nextLine());
//        }
//        if (passengerHashMap.containsKey(passenger.getUserName())) {
//            System.out.println("This username has already been selected. Please choose another username;)");
//            passenger.setUserName(scanner.nextLine());
//        }
        while (true)
        {
            if (passengerHashMap.containsKey(userName)) {
                System.out.println("This username has already been selected. Please choose another username;)");
//                passenger.setUserName(scanner.nextLine());
                userName = scanner.nextLine();
            }else
            {
               if (userName.equals(admin.getUserName()))
               {
                   System.out.println("This username has already been selected. Please choose another username;)");
//                   passenger.setUserName(scanner.nextLine());
                   userName = scanner.nextLine();
               }else
               {
                   passenger.setUserName(userName);
                   passenger.setPassword(password);
                   break;
               }
            }
        }
//        human.getPassword();
//        while (true)
//        {
//            for (int i = 0; i < humanArrayList.size(); i++) {
//                if(passenger.getPassword().equalsIgnoreCase(humanArrayList.get(i).getPassword()))
//                {
//                    System.out.println("This password has already been selected. Please choose another password;)");
//                    pass = scanner.nextLine();
//                    passenger.setPassword(pass);
//                }
//            }
//            break;
//        }
//        passenger.setType("Passenger");
//        human.getType();
//        humanArrayList.add(passenger);
//        passengerArrayList.add(passenger);
        passengerHashMap.put(passenger.getUserName() , passenger);
//        for (int i = 0; i < humanArrayList.size(); i++) {
//            System.out.println(humanArrayList.get(i).getUserName());
//        }
    }
    //==================================================================================================================

    /**
     *This method is for sign in for people.
     */
    public void signIn(HashMap<String , Passenger> passengerHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username :)");
        String userName = scanner.nextLine();
        System.out.println("Please enter your password :)");
        String pass = scanner.nextLine();
        if (passengerHashMap.containsKey(userName))
        {
            if (passengerHashMap.get(userName).getPassword().equals(pass))
            {
//                System.out.println("Menu Passenger");
                menuPassenger(this.flightHashMap , passengerHashMap , passengerHashMap.get(userName) , this.searchHashMap);
            }
        }else
        {
            if (admin.getUserName().equals(userName))
            {
                if (admin.getPassword().equals(pass))
                {
//                    System.out.println("Menu Admin");
                    menuAdmin(this.flightHashMap , this.searchHashMap);
                }
            }else
            {
                System.out.println("NOT FOUND :|");
            }
        }
    }
    //==================================================================================================================

    /**
     *This method is for admin menu options.
     */
    public void menuAdmin(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList<String>> searchHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        //HashMap < String , Flight > flightHashMap = new HashMap<>();
        String command;
        while (true)
        {
            command = printMenuAdmin();
//            if (command.equals("0"))
//            {
//                AirlineSystem airlineSystem;
//                airlineSystem.mainMenu();
//            }
            switch (command)
            {
                case "1":
//                    System.out.println("Add :)");
                    admin.add(flightHashMap , searchHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can add another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    String commandR;
                    while (true)
                    {
                        commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            admin.add(flightHashMap , searchHashMap);
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
                    admin.update(flightHashMap , searchHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can update another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            admin.update(flightHashMap , searchHashMap);
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
                    admin.remove(flightHashMap , searchHashMap , flightPassengersHashMap , ticketHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can remove another flight with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            admin.remove(flightHashMap , searchHashMap , flightPassengersHashMap , ticketHashMap);
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
                    admin.flightSchedule(flightHashMap);
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
                    mainMenu();
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
     *This method is for passenger menu options.
     */
    public void menuPassenger(HashMap < String , Flight > flightHashMap , HashMap<String, Passenger> passengerHashMap , Passenger passenger , HashMap <String , ArrayList <String>> searchHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true)
        {
            command = printMenuPassenger();
            switch (command)
            {
                case "1":
//                    System.out.println("Change password :)");
                    passenger.changePassword(passengerHashMap , passenger);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can change your password again with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            passenger.changePassword(passengerHashMap , passenger);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can change your password again with enter R:)");
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
//                    System.out.println("Search flight tickets :)");
                    passenger.searchFlightTickets(searchHashMap , flightHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can Search flight tickets again with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            passenger.searchFlightTickets(searchHashMap , flightHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can Search flight tickets again with enter R:)");
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
//                    System.out.println("Booking ticket :)");
                    passenger.bookingTicket(passenger , flightHashMap , ticketHashMap , flightPassengersHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can booking ticket again with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            passenger.bookingTicket(passenger , flightHashMap , ticketHashMap , flightPassengersHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can booking ticket again with enter R:)");
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
//                    System.out.println("Ticket cancellation :)");
                    passenger.ticketCancellation(ticketHashMap , passenger , flightPassengersHashMap , flightHashMap);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can cancel ticket with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                            passenger.ticketCancellation(ticketHashMap , passenger , flightPassengersHashMap , flightHashMap);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can cancel ticket with enter R:)");
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
                case "5":
//                    System.out.println("Booked tickets :)");
                    passenger.bookedTickets(ticketHashMap , passenger , flightHashMap);
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
                case "6":
//                    System.out.println("Add charge :)");
                    passenger.addCharge(passenger);
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Now you can add charge again with enter R:)");
                    System.out.println("OR you can back to the  menu with enter M:)");
                    while (true)
                    {
                        String commandR = scanner.nextLine();
                        if (commandR.equals("R"))
                        {
                           passenger.addCharge(passenger);
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Now you can add charge again with enter R:)");
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
                case "0":
                    System.out.println("Sign out :)");
                    mainMenu();
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
//    public static void main(String[] args) {
//        Passenger passenger = new Passenger();
//        Admin admin = new Admin("Arash Purfallah" , "admin1234");
//        admin.setUserName("Arash Purfallah");
//        admin.setPassword("admin1234");
//        AirlineSystem airlineSystem = new AirlineSystem();
//        //HashMap<String, Passenger> passengerHashMap = new HashMap<String, Passenger>();
//        airlineSystem.signUp(airlineSystem.getPassengerHashMap() , passenger , admin);
//        //----------------------------------------------------------------------------------------------
//        airlineSystem.signIn(airlineSystem.getPassengerHashMap() , admin);
//    }
}

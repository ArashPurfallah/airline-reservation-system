import java.util.ArrayList;
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
//    /**
//     *This method is for admin menu options.
//     */
//    public void menuAdmin(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList<String>> searchHashMap)
//    {
//        Scanner scanner = new Scanner(System.in);
//        //HashMap < String , Flight > flightHashMap = new HashMap<>();
//        String command;
//        while (true)
//        {
//            command = printMenuAdmin();
////            if (command.equals("0"))
////            {
////                AirlineSystem airlineSystem;
////                airlineSystem.mainMenu();
////            }
//            switch (command)
//            {
//                case "1":
////                    System.out.println("Add :)");
//                    add(flightHashMap , searchHashMap);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can add another flight with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            add(flightHashMap , searchHashMap);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can add another flight with enter R:)");
//                            System.out.println("OR you can back to the  menu with enter M:)");
//                        }else
//                        {
//                            if (commandR.equals("M"))
//                            {
//                                break;
//                            }else
//                            {
//                                System.out.println("Invalid: ");
//                            }
//                        }
//                    }
//                    break;
//                case "2":
////                    System.out.println("Update :)");
//                    update(flightHashMap , searchHashMap);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can update another flight with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            update(flightHashMap , searchHashMap);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can update another flight with enter R:)");
//                            System.out.println("OR you can back to the  menu with enter M:)");
//                        }else
//                        {
//                            if (commandR.equals("M"))
//                            {
//                                break;
//                            }else
//                            {
//                                System.out.println("Invalid: ");
//                            }
//                        }
//                    }
//                    break;
//                case "3":
////                    System.out.println("Remove :)");
//                    remove(flightHashMap , searchHashMap);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can remove another flight with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            remove(flightHashMap , searchHashMap);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can remove another flight with enter R:)");
//                            System.out.println("OR you can back to the  menu with enter M:)");
//                        }else
//                        {
//                            if (commandR.equals("M"))
//                            {
//                                break;
//                            }else
//                            {
//                                System.out.println("Invalid: ");
//                            }
//                        }
//                    }
//                    break;
//                case "4":
////                    System.out.println("Flight schedule :)");
//                    flightSchedule(flightHashMap);
//                    System.out.println("Now you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandM = scanner.nextLine();
//                        if (commandM.equals("M"))
//                        {
//                            break;
//                        }else
//                        {
//                            System.out.println("Invalid: ");
//                        }
//                    }
//                    break;
//                case "0":
//                    System.out.println("Sign out :)");
//                    break;
//                default:
//                    System.out.println("Not found :|");
//                    break;
//            }
//        }
//    }
//    //==================================================================================================================
//    /**
//     *This method prints the menu.
//     * @return A command for menu options
//     */
//    public String printMenuAdmin()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println("                                Admin MENU OPTIONS                                        ");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . .MENU OPTIONS . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println("1 - Add : ");
//        System.out.println("2 - Update : ");
//        System.out.println("3 - Remove : ");
//        System.out.println("4 - Flight schedule : ");
//        System.out.println("0 - Sign out : ");
//        String command = scanner.nextLine();
//        return command;
//    }
    //==================================================================================================================
    /**
     *This method is for adding flights.
     */
    public void add(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap)
    {
        System.out.println("Welcome to the add section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your flight :)");
        Flight flight = new Flight();
        System.out.println("First -----> Please enter flight id :)");
        String flightId = scanner.nextLine();
        flight.setFlightId(flightId);
        if (!flightHashMap.containsKey(flight.getFlightId()))
        {
            if (searchHashMap.containsKey("flight id : " +  flight.getFlightId()))
            {
                if (!searchHashMap.get("flight id : " +  flight.getFlightId()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("flight id : " +  flight.getFlightId()).add(flight.getFlightId());
                }
            }else
            {
//                flightIds.add(flightId);
                ArrayList<String> flightIds = new ArrayList<String>();
                flightIds.add(flightId);
                searchHashMap.put("flight id : " +  flight.getFlightId() , flightIds);
            }
            System.out.println("Second -----> Please enter origin of flight :)");
            String origin = scanner.nextLine();
            flight.setOrigin(origin);
            if (searchHashMap.containsKey("origin : " +  flight.getOrigin()))
            {
                if (!searchHashMap.get("origin : " +  flight.getOrigin()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("origin : " +  flight.getOrigin()).add(flight.getFlightId());
                }
            }else
            {
//                origins.add(flight.getFlightId());
                ArrayList<String> origins = new ArrayList<String>();
                origins.add(flight.getFlightId());
                searchHashMap.put("origin : " +  flight.getOrigin() , origins);
            }
            System.out.println("Third -----> Please enter destination of flight :)");
            String destination = scanner.nextLine();
            flight.setDestination(destination);
            if (searchHashMap.containsKey("destination : " +  flight.getDestination()))
            {
                if (!searchHashMap.get("destination : " +  flight.getDestination()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("destination : " +  flight.getDestination()).add(flight.getFlightId());
                }
            }else
            {
//                destinations.add(flight.getFlightId());
                ArrayList<String> destinations = new ArrayList<String>();
                destinations.add(flight.getFlightId());
                searchHashMap.put("destination : " +  flight.getDestination() , destinations);
            }
            System.out.println("Fourth -----> Please enter date of flight :)");
            String date = scanner.nextLine();
            flight.setDate(date);
            if (searchHashMap.containsKey("date : " +  flight.getDate()))
            {
                if (!searchHashMap.get("date : " +  flight.getDate()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("date : " +  flight.getDate()).add(flight.getFlightId());
                }
            }else
            {
//                dates.add(flight.getFlightId());
                ArrayList<String> dates = new ArrayList<String>();
                dates.add(flight.getFlightId());
                searchHashMap.put("date : " +  flight.getDate() , dates);
            }
            System.out.println("Fifth ----> Please enter time of flight :)");
            String time = scanner.nextLine();
            flight.setTime(time);
            if (searchHashMap.containsKey("time : " +  flight.getTime()))
            {
                if (!searchHashMap.get("time : " +  flight.getTime()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("time : " +  flight.getTime()).add(flight.getFlightId());
                }
            }else
            {
//                times.add(flight.getFlightId());
                ArrayList<String> times = new ArrayList<String>();
                times.add(flight.getFlightId());
                searchHashMap.put("time : " +  flight.getTime() , times);
            }
            System.out.println("Sixth ----> Please enter price of flight :)");
            int price = scanner.nextInt();
            flight.setPrice(price);
            if (searchHashMap.containsKey("price : " +  flight.getPrice()))
            {
                if (!searchHashMap.get("price : " +  flight.getPrice()).contains(flight.getFlightId()))
                {
                    searchHashMap.get("price : " +  flight.getPrice()).add(flight.getFlightId());
                }
            }else
            {
//                prices.add(flight.getFlightId());
                ArrayList<String> prices = new ArrayList<String>();
                prices.add(flight.getFlightId());
                searchHashMap.put("price : " +  flight.getPrice() , prices);
            }
            System.out.println("Seventh ----> Please enter seats :)");
            flight.setSeats(scanner.nextInt());
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
    public void update(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap)
    {
        System.out.println("Welcome to the update section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please update your flight :)");
        System.out.print("First -----> Please enter flight id :");
        String flightId = scanner.nextLine();
        if (flightHashMap.containsKey(flightId))
        {
//            System.out.println("Second -----> Please enter origin of flight :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getOrigin());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setOrigin(scanner.nextLine());
//            System.out.println("Third -----> Please enter destination of flight :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getDestination());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setDestination(scanner.nextLine());
//            System.out.println("Fourth -----> Please enter date of flight :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getDate());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setDate(scanner.nextLine());
//            System.out.println("Fifth ----> Please enter time of flight :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getTime());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setTime(scanner.nextLine());
//            System.out.println("Sixth ----> Please enter price of flight :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getPrice());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setPrice(scanner.nextInt());
//            System.out.println("Seventh ----> Please enter seats :)");
//            System.out.println("Before : " + flightHashMap.get(flightId).getSeats());
//            System.out.print("Now : ");
//            flightHashMap.get(flightId).setPrice(scanner.nextInt());
            System.out.println("origin : " + flightHashMap.get(flightId).getOrigin());
            System.out.println("destination : " + flightHashMap.get(flightId).getDestination());
            System.out.println("date : " + flightHashMap.get(flightId).getDate());
            System.out.println("time : " + flightHashMap.get(flightId).getTime());
            System.out.println("price : " + flightHashMap.get(flightId).getPrice());
            System.out.println("seats : " + flightHashMap.get(flightId).getSeats());
            System.out.println("Which of the following options do you want to change?");
            System.out.println("1 - date");
            System.out.println("2 - time");
            System.out.println("3 - price");
            System.out.println("4 - seats");
            while (true)
            {
                String command = scanner.nextLine();
                if (command.equals("1"))
                {
                    System.out.println("Please enter date of flight :)");
                    searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).remove(flightId);
                    System.out.println("Before : " + flightHashMap.get(flightId).getDate());
                    System.out.print("Now : ");
                    flightHashMap.get(flightId).setDate(scanner.nextLine());
                    if (searchHashMap.containsKey("date : " +  flightHashMap.get(flightId).getDate()))
                    {
                        if (!searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).contains(flightId))
                        {
                            searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).add(flightId);
                        }
                    }else
                    {
//                        dates.add(flightId);
                        ArrayList<String> dates = new ArrayList<String>();
                        dates.add(flightId);
                        searchHashMap.put("date : " +  flightHashMap.get(flightId).getDate() , dates);
                    }
                    System.out.println("Your flight is updated ;)");
                    break;
                }else
                {
                    if (command.equals("2"))
                    {
                        System.out.println("Please enter time of flight :)");
                        searchHashMap.get("time : " + flightHashMap.get(flightId).getTime());
                        System.out.println("Before : " + flightHashMap.get(flightId).getTime());
                        System.out.print("Now : ");
                        flightHashMap.get(flightId).setTime(scanner.nextLine());
                        if (searchHashMap.containsKey("time : " +  flightHashMap.get(flightId).getTime()))
                        {
                            if (!searchHashMap.get("time : " +  flightHashMap.get(flightId).getTime()).contains(flightId))
                            {
                                searchHashMap.get("time : " +  flightHashMap.get(flightId).getTime()).add(flightId);
                            }
                        }else
                        {
//                            times.add(flightId);
                            ArrayList<String> times = new ArrayList<String>();
                            times.add(flightId);
                            searchHashMap.put("time : " +  flightHashMap.get(flightId).getTime() , times);
                        }
                        System.out.println("Your flight is updated ;)");
                        break;
                    }else
                    {
                        if (command.equals("3"))
                        {
                            System.out.println("Please enter price of flight :)");
                            searchHashMap.get("price : " + flightHashMap.get(flightId).getPrice());
                            System.out.println("Before : " + flightHashMap.get(flightId).getPrice());
                            System.out.print("Now : ");
                            flightHashMap.get(flightId).setPrice(scanner.nextInt());
                            if (searchHashMap.containsKey("price : " +  flightHashMap.get(flightId).getPrice()))
                            {
                                if (!searchHashMap.get("price : " +  flightHashMap.get(flightId).getPrice()).contains(flightId))
                                {
                                    searchHashMap.get("price : " +  flightHashMap.get(flightId).getPrice()).add(flightId);
                                }
                            }else
                            {
//                                prices.add(flightId);
                                ArrayList<String> prices = new ArrayList<String>();
                                prices.add(flightId);
                                searchHashMap.put("price : " +  flightHashMap.get(flightId).getPrice() , prices);
                            }
                            System.out.println("Your flight is updated ;)");
                            break;
                        }else
                        {
                            if (command.equals("4"))
                            {
                                System.out.println("Please enter seats :)");
                                System.out.println("Before : " + flightHashMap.get(flightId).getSeats());
                                System.out.print("Now : ");
                                flightHashMap.get(flightId).setPrice(scanner.nextInt());
                                System.out.println("Your flight is updated ;)");
                                break;
                            }else
                            {
                                System.out.println("Invalid :|");
                            }
                        }
                    }
                }
            }
//            System.out.println("Your flight is updated ;)");
        }else
        {
            System.out.println("Not found :(");
        }
    }//=================================================================================================================

    /**
     * This method is for removing flights.
     */
    public void remove(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap , HashMap <Flight , ArrayList <Passenger>> flightPassengersHashMap)
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
                    searchHashMap.remove("flight id : " + flightId);
                    searchHashMap.get("origin : " + flightHashMap.get(flightId).getOrigin()).remove(flightId);
                    searchHashMap.get("destination : " + flightHashMap.get(flightId).getDestination()).remove(flightId);
                    searchHashMap.get("date : " + flightHashMap.get(flightId).getDate()).remove(flightId);
                    searchHashMap.get("time : " + flightHashMap.get(flightId).getTime()).remove(flightId);
                    searchHashMap.get("price : " + flightHashMap.get(flightId).getPrice()).remove(flightId);
                    System.out.println("Your flight is removed ;)");
                    if (flightPassengersHashMap.containsKey(flightHashMap.get(flightId)))
                    {
                        for (int i = 0; i < flightPassengersHashMap.get(flightHashMap.get(flightId)).size(); i++) {
                            flightPassengersHashMap.get(flightHashMap.get(flightId)).get(i).setCharge(flightPassengersHashMap.get(flightHashMap.get(flightId)).get(i).getCharge() + flightHashMap.get(flightId).getPrice());
                        }
                        flightPassengersHashMap.remove(flightHashMap.get(flightId));
                    }
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
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        AirlineSystem airlineSystem = new AirlineSystem();
//        Admin admin = new Admin("Arash Purfallah" , "Admin1234");
////        admin.menuAdmin(airlineSystem.getFlightHashMap() , airlineSystem.getSearchHashMap());
//    }
    //==================================================================================================================
}

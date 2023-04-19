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
//    public void add(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap)
//    {
//        Utils utils= new Utils();
//        System.out.println("Welcome to the add section ;)");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please add your flight :)");
//        Flight flight = new Flight();
//        System.out.println("First -----> Please enter flight id :)");
//        String flightId = scanner.nextLine();
//        flight.setFlightId(flightId);
//        if (!flightHashMap.containsKey(flight.getFlightId()))
//        {
////            if (searchHashMap.containsKey("flight id : " +  flight.getFlightId()))
////            {
////                if (!searchHashMap.get("flight id : " +  flight.getFlightId()).contains(flight.getFlightId()))
////                {
////                    searchHashMap.get("flight id : " +  flight.getFlightId()).add(flight.getFlightId());
////                }
////            }else
////            {
////                ArrayList<String> flightIds = new ArrayList<String>();
////                flightIds.add(flightId);
////                searchHashMap.put("flight id : " +  flight.getFlightId() , flightIds);
////            }
////            puttingHashMap(searchHashMap , "flightId" , flight.getFlightId() , flight.getFlightId());
//            System.out.println("Second -----> Please enter origin of flight :)");
//            String origin = scanner.nextLine();
//            if (utils.isValidCity(origin))
//            {
//                flight.setOrigin(origin);
////                if (searchHashMap.containsKey("origin : " +  flight.getOrigin()))
////                {
////                    if (!searchHashMap.get("origin : " +  flight.getOrigin()).contains(flight.getFlightId()))
////                    {
////                        searchHashMap.get("origin : " +  flight.getOrigin()).add(flight.getFlightId());
////                    }
////                }else
////                {
////                    ArrayList<String> origins = new ArrayList<String>();
////                    origins.add(flight.getFlightId());
////                    searchHashMap.put("origin : " +  flight.getOrigin() , origins);
////                }
////                puttingHashMap(searchHashMap , "origin" , flight.getOrigin() , flight.getFlightId());
//                System.out.println("Third -----> Please enter destination of flight :)");
//                String destination = scanner.nextLine();
//                if (utils.isValidCity(destination) && utils.isValidDestination(origin , destination))
//                {
//                    flight.setDestination(destination);
////                    if (searchHashMap.containsKey("destination : " +  flight.getDestination()))
////                    {
////                        if (!searchHashMap.get("destination : " +  flight.getDestination()).contains(flight.getFlightId()))
////                        {
////                            searchHashMap.get("destination : " +  flight.getDestination()).add(flight.getFlightId());
////                        }
////                    }else
////                    {
////                        ArrayList<String> destinations = new ArrayList<String>();
////                        destinations.add(flight.getFlightId());
////                        searchHashMap.put("destination : " +  flight.getDestination() , destinations);
////                    }
////                    puttingHashMap(searchHashMap , "destination" , flight.getDestination() , flight.getFlightId());
//                    System.out.println("Fourth -----> Please enter date of flight :)");
//                    System.out.println("Date Format Pattern -------> yyyy-MM-dd");
//                    String date = scanner.nextLine();
//                    if (utils.isValidDate(date))
//                    {
//                        flight.setDate(date);
////                        if (searchHashMap.containsKey("date : " +  flight.getDate()))
////                        {
////                            if (!searchHashMap.get("date : " +  flight.getDate()).contains(flight.getFlightId()))
////                            {
////                                searchHashMap.get("date : " +  flight.getDate()).add(flight.getFlightId());
////                            }
////                        }else
////                        {
////                            ArrayList<String> dates = new ArrayList<String>();
////                            dates.add(flight.getFlightId());
////                            searchHashMap.put("date : " +  flight.getDate() , dates);
////                        }
////                        puttingHashMap(searchHashMap , "date" , flight.getDate() , flight.getFlightId());
//                        System.out.println("Fifth ----> Please enter time of flight :)");
//                        System.out.println("Time Format Pattern ----> hh:mm");
//                        String time = scanner.nextLine();
//                        if (utils.isValid24HourTime(time))
//                        {
//                            flight.setTime(time);
////                            if (searchHashMap.containsKey("time : " +  flight.getTime()))
////                            {
////                                if (!searchHashMap.get("time : " +  flight.getTime()).contains(flight.getFlightId()))
////                                {
////                                    searchHashMap.get("time : " +  flight.getTime()).add(flight.getFlightId());
////                                }
////                            }else
////                            {
////
////                                ArrayList<String> times = new ArrayList<String>();
////                                times.add(flight.getFlightId());
////                                searchHashMap.put("time : " +  flight.getTime() , times);
////                            }
////                            puttingHashMap(searchHashMap , "time" , flight.getTime() , flight.getFlightId());
//                            System.out.println("Sixth ----> Please enter price of flight :)");
////                            int price = scanner.nextInt();
//                            String price1 = scanner.nextLine();
//                            if (utils.isValidNumber(price1))
//                            {
//                                int price = Integer.parseInt(price1);
//                                flight.setPrice(price);
//                                int lowRangeOfPrice = price - (price % 1000);
//                                int upRangeOfPrice = price + (1000 - (price % 1000));
////            if (searchHashMap.containsKey("price : " +  flight.getPrice()))
////            {
////                if (!searchHashMap.get("price : " +  flight.getPrice()).contains(flight.getFlightId()))
////                {
////                    searchHashMap.get("price : " +  flight.getPrice()).add(flight.getFlightId());
////                }
////            }else
////            {
//////                prices.add(flight.getFlightId());
////                ArrayList<String> prices = new ArrayList<String>();
////                prices.add(flight.getFlightId());
////                searchHashMap.put("price : " +  flight.getPrice() , prices);
////            }
////                                if (searchHashMap.containsKey("price : " + lowRangeOfPrice + "," + upRangeOfPrice))
////                                {
////                                    if (!searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).contains(flight.getFlightId()))
////                                    {
////                                        searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).add(flight.getFlightId());
////                                    }
////                                }else
////                                {
////                                    ArrayList<String> prices = new ArrayList<String>();
////                                    prices.add(flight.getFlightId());
////                                    searchHashMap.put("price : " + lowRangeOfPrice + "," + upRangeOfPrice , prices);
////                                }
////                                puttingHashMap(searchHashMap , flight.getFlightId() , lowRangeOfPrice , upRangeOfPrice);
//                                System.out.println("Seventh ----> Please enter seats :)");
//                                String seats1 = scanner.nextLine();
//                                int seats = Integer.parseInt(seats1);
//                                if (utils.isValidNumber(seats1))
//                                {
//                                    flight.setSeats(seats);
//                                    System.out.println("Your flight is added ;)");
//                                    flightHashMap.put(flight.getFlightId(), flight);
//                                    puttingHashMap(searchHashMap , "flightId" , flight.getFlightId() , flight.getFlightId());
//                                    puttingHashMap(searchHashMap , "origin" , flight.getOrigin() , flight.getFlightId());
//                                    puttingHashMap(searchHashMap , "destination" , flight.getDestination() , flight.getFlightId());
//                                    puttingHashMap(searchHashMap , "date" , flight.getDate() , flight.getFlightId());
//                                    puttingHashMap(searchHashMap , "time" , flight.getTime() , flight.getFlightId());
//                                    puttingHashMap(searchHashMap , flight.getFlightId() , lowRangeOfPrice , upRangeOfPrice);
//                                }else
//                                {
//                                    System.out.println("your seats is not valid :(");
//                                }
//                            }else
//                            {
//                                System.out.println("your price is not valid :(");
//                            }
//                        }else
//                        {
//                            System.out.println("your time is not valid :(");
//                        }
//                    }else
//                    {
//                        System.out.println("your date is not valid :(");
//                    }
//                }else
//                {
//                    System.out.println("your destination is not valid :(");
//                }
//            }else
//            {
//                System.out.println("your origin is not valid :(");
//            }
//        }else
//        {
//            System.out.println("This flight has a problem :|");
//        }
//    }
    //==================================================================================================================
//    public void add(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap)
//    {
////        Utils utils= new Utils();
//        System.out.println("Welcome to the add section ;)");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please add your flight :)");
//        Flight flight = new Flight();
//        ArrayList<String> fields = new ArrayList<String>();
//        ArrayList<String> instances = new ArrayList<String>();
//        System.out.println("First -----> Please enter flight id :)");
//        String flightId = scanner.nextLine();
//        flight.setFlightId(flightId);
//        fields.add("flightId");
//        instances.add(flightId);
//        System.out.println("Second -----> Please enter origin of flight :)");
//        String origin = scanner.nextLine();
//        flight.setOrigin(origin);
//        fields.add("origin");
//        instances.add(origin);
//        System.out.println("Third -----> Please enter destination of flight :)");
//        String destination = scanner.nextLine();
//        flight.setDestination(destination);
//        fields.add("destination");
//        instances.add(destination);
//        System.out.println("Fourth -----> Please enter date of flight :)");
//        System.out.println("Date Format Pattern -------> yyyy-MM-dd");
//        String date = scanner.nextLine();
//        flight.setDate(date);
//        fields.add("date");
//        instances.add(date);
//        System.out.println("Fifth ----> Please enter time of flight :)");
//        System.out.println("Time Format Pattern ----> hh:mm");
//        String time = scanner.nextLine();
//        flight.setTime(time);
//        fields.add("time");
//        instances.add(time);
//        System.out.println("Sixth ----> Please enter price of flight :)");
//        String price1 = scanner.nextLine();
//        int price = Integer.parseInt(price1);
//        flight.setPrice(price);
//        int lowRangeOfPrice = price - (price % 1000);
//        int upRangeOfPrice = price + (1000 - (price % 1000));
//        fields.add("price");
//        instances.add(price1);
//        System.out.println("Seventh ----> Please enter seats :)");
//        String seats1 = scanner.nextLine();
//        int seats = Integer.parseInt(seats1);
//        flight.setSeats(seats);
//        fields.add("seats");
//        instances.add(seats1);
//        int state = 0;
//        int count = 0;
//        for (int i = 0; i < fields.size(); i++) {
//            state = isValidFlightField(fields.get(i) , instances.get(i) , flightHashMap);
//            if (state != 8 && state != 0)
//            {
//                break;
//            }
//            count++;
//        }
//        if (state != 8 && state != 0)
//        {
//            System.out.println("your " + fields.get(state - 1) +" is not valid :(");
//        }
//        if (instances.get(2).equals(instances.get(1)))
//        {
//            System.out.println("your destination is not valid :(");
//        }
//        if (state == 0 && count == fields.size())
//        {
//            flightHashMap.put(flight.getFlightId(), flight);
//            for (int i = 0; i < 5; i++) {
//                puttingHashMap(searchHashMap , fields.get(i) , instances.get(i) , flight.getFlightId());
//            }
//            puttingHashMap(searchHashMap , flight.getFlightId() , lowRangeOfPrice , upRangeOfPrice);
//        }
//    }
    //==================================================================================================================
    /**
     *This method is for adding flights.
     */
    public void add(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap)
    {
        Utils utils= new Utils();
        int flag = 0;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> instances = new ArrayList<String>();
        System.out.println("Welcome to the add section ;)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your flight :)");
        Flight flight = new Flight();
        System.out.println("First -----> Please enter flight id :)");
        String flightId = scanner.nextLine();
        fields.add("flightId");
        instances.add(flightId);
        System.out.println("Second -----> Please enter origin of flight :)");
        String origin = scanner.nextLine();
        fields.add("origin");
        instances.add(origin);
        System.out.println("Third -----> Please enter destination of flight :)");
        String destination = scanner.nextLine();
        fields.add("destination");
        instances.add(destination);
        System.out.println("Fourth -----> Please enter date of flight :)");
        System.out.println("Date Format Pattern -------> yyyy-MM-dd");
        String date = scanner.nextLine();
        fields.add("date");
        instances.add(date);
        System.out.println("Fifth ----> Please enter time of flight :)");
        System.out.println("Time Format Pattern ----> hh:mm");
        String time = scanner.nextLine();
        fields.add("time");
        instances.add(time);
        System.out.println("Sixth ----> Please enter price of flight :)");
        String price1 = scanner.nextLine();
        System.out.println("Seventh ----> Please enter seats :)");
        String seats1 = scanner.nextLine();
        if (flightHashMap.containsKey(flightId) || flightId.isEmpty())
        {
            System.out.println("your flight id is not valid :(");
            flag = 1;
        }
        if (!(utils.isValidCity(origin)))
        {
            System.out.println("your origin is not valid :(");
            flag = 1;
        }
        if (!(utils.isValidCity(destination)) || !(utils.isValidDestination(origin , destination)) || destination.isEmpty())
        {
            System.out.println("your destination is not valid :(");
            flag = 1;
        }
        if (!(utils.isValidDate(date)) || date.isEmpty())
        {
            System.out.println("your date is not valid :(");
            flag = 1;
        }
        if (!(utils.isValid24HourTime(time)) || time.isEmpty())
        {
            System.out.println("your time is not valid :(");
            flag = 1;
        }
        if (!(utils.isValidNumber(price1)) || price1.isEmpty())
        {
            System.out.println("your price is not valid :(");
            flag = 1;
        }
        if (!(utils.isValidNumber(seats1)) || seats1.isEmpty())
        {
            System.out.println("your seats is not valid :(");
            flag = 1;
        }
        if (flag == 0)
        {
            flight.setFlightId(flightId);
            flight.setOrigin(origin);
            flight.setDestination(destination);
            flight.setDate(date);
            flight.setTime(time);
            int price = Integer.parseInt(price1);
            flight.setPrice(price);
            int lowRangeOfPrice = price - (price % 1000);
            int upRangeOfPrice = price + (1000 - (price % 1000));
            int seats = Integer.parseInt(seats1);
            flight.setSeats(seats);
            flightHashMap.put(flight.getFlightId(), flight);
            System.out.println("Your flight is added ;)");
            for (int i = 0; i < 5; i++) {
                puttingHashMap(searchHashMap , fields.get(i) , instances.get(i) , flight.getFlightId());
            }
//            puttingHashMap(searchHashMap , "flightId" , flight.getFlightId() , flight.getFlightId());
//            puttingHashMap(searchHashMap , "origin" , flight.getOrigin() , flight.getFlightId());
//            puttingHashMap(searchHashMap , "destination" , flight.getDestination() , flight.getFlightId());
//            puttingHashMap(searchHashMap , "date" , flight.getDate() , flight.getFlightId());
//            puttingHashMap(searchHashMap , "time" , flight.getTime() , flight.getFlightId());
            puttingHashMap(searchHashMap , flight.getFlightId() , lowRangeOfPrice , upRangeOfPrice);
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
        Utils utils = new Utils();
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
            String command;
            while (true)
            {
               command = scanner.nextLine();
                if (command.equals("1"))
                {
                    System.out.println("Please enter date of flight :)");
//                    searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).remove(flightId);
                    System.out.println("Before : " + flightHashMap.get(flightId).getDate());
                    System.out.print("Now : ");
                    String date = scanner.nextLine();
                    if (utils.isValidDate(date) && !(date.isEmpty()))
                    {
                        searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).remove(flightId);
                        flightHashMap.get(flightId).setDate(date);
//                        if (searchHashMap.containsKey("date : " +  flightHashMap.get(flightId).getDate()))
//                        {
//                            if (!searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).contains(flightId))
//                            {
//                                searchHashMap.get("date : " +  flightHashMap.get(flightId).getDate()).add(flightId);
//                            }
//                        }else
//                        {
//                            ArrayList<String> dates = new ArrayList<String>();
//                            dates.add(flightId);
//                            searchHashMap.put("date : " +  flightHashMap.get(flightId).getDate() , dates);
//                        }
                        puttingHashMap(searchHashMap , "date" , flightHashMap.get(flightId).getDate() , flightId);
                        System.out.println("Your flight is updated ;)");
                    }else
                    {
                        System.out.println("your date is not valid :(");
                    }
                    break;
                }else
                {
                    if (command.equals("2"))
                    {
                        System.out.println("Please enter time of flight :)");
//                        searchHashMap.get("time : " + flightHashMap.get(flightId).getTime()).remove(flightId);
                        System.out.println("Before : " + flightHashMap.get(flightId).getTime());
                        System.out.print("Now : ");
                        String time = scanner.nextLine();
                        if (utils.isValid24HourTime(time) && !(time.isEmpty()))
                        {
                            searchHashMap.get("time : " + flightHashMap.get(flightId).getTime()).remove(flightId);
                            flightHashMap.get(flightId).setTime(time);
//                            if (searchHashMap.containsKey("time : " +  flightHashMap.get(flightId).getTime()))
//                            {
//                                if (!searchHashMap.get("time : " +  flightHashMap.get(flightId).getTime()).contains(flightId))
//                                {
//                                    searchHashMap.get("time : " +  flightHashMap.get(flightId).getTime()).add(flightId);
//                                }
//                            }else
//                            {
//                                ArrayList<String> times = new ArrayList<String>();
//                                times.add(flightId);
//                                searchHashMap.put("time : " +  flightHashMap.get(flightId).getTime() , times);
//                            }
                            puttingHashMap(searchHashMap , "time" , flightHashMap.get(flightId).getTime() , flightId);
                            System.out.println("Your flight is updated ;)");
                        }else
                        {
                            System.out.println("your time is not valid :(");
                        }
                        break;
                    }else
                    {
                        if (command.equals("3"))
                        {
                            System.out.println("Please enter price of flight :)");
                            System.out.println("Before : " + flightHashMap.get(flightId).getPrice());
                            System.out.print("Now : ");
                            String price1 = scanner.nextLine();
                            if (utils.isValidNumber(price1) && !(price1.isEmpty()))
                            {
                                int price = Integer.parseInt(price1);
//                            int price = scanner.nextInt();
                                int lowRangeOfPrice = price - (price % 1000);
                                int upRangeOfPrice = price + (1000 - (price % 1000));
                                searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).remove(flightId);
                                flightHashMap.get(flightId).setPrice(price);
//                                if (searchHashMap.containsKey("price : " + lowRangeOfPrice + "," + upRangeOfPrice))
//                                {
//                                    if (!searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).contains(flightId))
//                                    {
//                                        searchHashMap.get("price : " +  + lowRangeOfPrice + "," + upRangeOfPrice).add(flightId);
//                                    }
//                                }else
//                                {
//                                    ArrayList<String> prices = new ArrayList<String>();
//                                    prices.add(flightId);
//                                    searchHashMap.put("price : " + lowRangeOfPrice + "," + upRangeOfPrice , prices);
//                                }
                                puttingHashMap(searchHashMap , flightId , lowRangeOfPrice , upRangeOfPrice);
                                System.out.println("Your flight is updated ;)");
                            }else
                            {
                                System.out.println("your price is not valid :(");
                            }
                            break;
                        }else
                        {
                            if (command.equals("4"))
                            {
                                System.out.println("Please enter seats :)");
                                System.out.println("Before : " + flightHashMap.get(flightId).getSeats());
                                System.out.print("Now : ");
                                String seats1 = scanner.nextLine();
                                if (utils.isValidNumber(seats1) && !(seats1.isEmpty()))
                                {
                                    int seats = Integer.parseInt(seats1);
                                    flightHashMap.get(flightId).setPrice(seats);
                                    System.out.println("Your flight is updated ;)");
                                }else
                                {
                                    System.out.println("your seats is not valid :(");
                                }
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
    public void remove(HashMap < String , Flight > flightHashMap , HashMap <String , ArrayList <String>> searchHashMap , HashMap <Flight , ArrayList <Passenger>> flightPassengersHashMap , HashMap<Integer , Ticket> ticketHashMap)
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
            String command;
            while (true)
            {
                command = scanner.nextLine();
                if (command.equals("1"))
                {
                    searchHashMap.remove("flightId : " + flightId);
                    searchHashMap.get("origin : " + flightHashMap.get(flightId).getOrigin()).remove(flightId);
                    searchHashMap.get("destination : " + flightHashMap.get(flightId).getDestination()).remove(flightId);
                    searchHashMap.get("date : " + flightHashMap.get(flightId).getDate()).remove(flightId);
                    searchHashMap.get("time : " + flightHashMap.get(flightId).getTime()).remove(flightId);
                    int price = flightHashMap.get(flightId).getPrice();
                    int lowRangeOfPrice = price - (price % 1000);
                    int upRangeOfPrice = price + (1000 - (price % 1000));
                    searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).remove(flightId);
                    System.out.println("Your flight is removed ;)");
                    if (flightPassengersHashMap.containsKey(flightHashMap.get(flightId)))
                    {
                        for (int i = 0; i < flightPassengersHashMap.get(flightHashMap.get(flightId)).size(); i++) {
                            int charge = flightPassengersHashMap.get(flightHashMap.get(flightId)).get(i).getCharge() + flightHashMap.get(flightId).getPrice();
                            flightPassengersHashMap.get(flightHashMap.get(flightId)).get(i).setCharge(charge);
                        }
                        flightPassengersHashMap.remove(flightHashMap.get(flightId));
                    }
                    for(Integer key: ticketHashMap.keySet()) {
                        if (ticketHashMap.get(key).getFlightId().equals(flightId))
                        {
                            ticketHashMap.remove(key);
                        }
                    }
                    flightHashMap.remove(flightId);
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

    /**
     *This method puts field & instance Of field inside search HashMap.
     */
    public void puttingHashMap(HashMap <String , ArrayList<String>> searchHashMap , String field , String instance , String flightId)
    {
        if (searchHashMap.containsKey(field + " : " +  instance))
        {
            if (!searchHashMap.get(field + " : " +  instance).contains(flightId))
            {
                searchHashMap.get(field + " : " +  instance).add(flightId);
            }
        }else
        {
            ArrayList<String> flightIds = new ArrayList<String>();
            flightIds.add(flightId);
            searchHashMap.put(field + " : " +  instance , flightIds);
        }
    }
    //==================================================================================================================

    /**
     *This method puts price & instance Of price inside search HashMap.
     */
    public void puttingHashMap(HashMap <String , ArrayList<String>> searchHashMap , String flightId , int lowRangeOfPrice , int upRangeOfPrice)
    {
        if (searchHashMap.containsKey("price : " + lowRangeOfPrice + "," + upRangeOfPrice))
        {
            if (!searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).contains(flightId))
            {
                searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).add(flightId);
            }
        }else
        {
            ArrayList<String> prices = new ArrayList<String>();
            prices.add(flightId);
            searchHashMap.put("price : " + lowRangeOfPrice + "," + upRangeOfPrice , prices);
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

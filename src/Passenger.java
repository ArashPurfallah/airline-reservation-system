import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Passenger {
    private String userName;
    private String password;
    private int charge;
//    private HashMap<Integer , Flight> ticketHashMap;
//    private int ticketId;
//    public Passenger() {
//        this.ticketHashMap = new HashMap<Integer, Flight>();
//    }

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

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

//    public HashMap<Integer , Flight> getTicketHashMap() {
//        return ticketHashMap;
//    }
//
//    public void setTicketHashMap(HashMap<Integer , Flight> ticketHashMap) {
//        this.ticketHashMap = ticketHashMap;
//    }
//
//    public int getTicketId() {
//        return ticketId;
//    }
//
//    public void setTicketId(int ticketId) {
//        this.ticketId = ticketId;
//    }

    //==================================================================================================================
//    public void menuPassenger(HashMap < String , Flight > flightHashMap , HashMap<String, Passenger> passengerHashMap , Passenger passenger , HashMap <String , ArrayList <String>> searchHashMap)
//    {
//        Scanner scanner = new Scanner(System.in);
//        String command;
//        while (true)
//        {
//            command = printMenuPassenger();
//            switch (command)
//            {
//                case "1":
////                    System.out.println("Change password :)");
//                    changePassword(passengerHashMap);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can change your password again with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            changePassword(passengerHashMap);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can change your password again with enter R:)");
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
////                    System.out.println("Search flight tickets :)");
//                    searchFlightTickets(searchHashMap , flightHashMap);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can Search flight tickets again with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            searchFlightTickets(searchHashMap , flightHashMap);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can Search flight tickets again with enter R:)");
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
////                    System.out.println("Booking ticket :)");
//                    bookingTicket(passenger , flightHashMap , passenger.getTicketHashMap());
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can booking ticket again with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            bookingTicket(passenger , flightHashMap , passenger.getTicketHashMap());
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can booking ticket again with enter R:)");
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
////                    System.out.println("Ticket cancellation :)");
//                    ticketCancellation(passenger.getTicketHashMap());
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can cancel ticket with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            ticketCancellation(passenger.getTicketHashMap());
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can cancel ticket with enter R:)");
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
//                case "5":
////                    System.out.println("Booked tickets :)");
//                    bookedTickets(passenger.getTicketHashMap());
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
//                case "6":
////                    System.out.println("Add charge :)");
//                    addCharge(passenger);
//                    System.out.println("---------------------------------------------------------------");
//                    System.out.println("Now you can add charge again with enter R:)");
//                    System.out.println("OR you can back to the  menu with enter M:)");
//                    while (true)
//                    {
//                        String commandR = scanner.nextLine();
//                        if (commandR.equals("R"))
//                        {
//                            addCharge(passenger);
//                            System.out.println("---------------------------------------------------------------");
//                            System.out.println("Now you can add charge again with enter R:)");
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
//    public String printMenuPassenger()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println("                              PASSENGER MENU OPTIONS                                     ");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println(". . . . . . . . . . . . . . . .MENU OPTIONS . . . . . . . . . . . . . . . . . . . . . . .");
//        System.out.println("1 - Change password : ");
//        System.out.println("2 - Search flight tickets : ");
//        System.out.println("3 - Booking ticket : ");
//        System.out.println("4 - Ticket cancellation : ");
//        System.out.println("5 - Booked tickets : ");
//        System.out.println("6 - Add charge : ");
//        System.out.println("0 - Sign out : ");
//        String command = scanner.nextLine();
//        return command;
//    }
//    //==================================================================================================================

    /**
     * This method is for changing the password for the passenger.
     */
    public void changePassword(HashMap<String , Passenger> passengerHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to change password section :)");
        System.out.print("Please enter your username :");
        String userName = scanner.nextLine();
        if (passengerHashMap.containsKey(userName))
        {
            System.out.print("Please enter the current password : ");
            String previousPassword = scanner.nextLine();
            if(passengerHashMap.get(userName).getPassword().equals(previousPassword))
            {
                System.out.print("Please choose a new password for yourself : ");
                String currentPassword = scanner.nextLine();
                passengerHashMap.get(userName).setPassword(currentPassword);
                System.out.println("Your password has been successfully changed :)");
            }else
            {
                System.out.println("This password is not valid :(");
            }
        }else
        {
            System.out.println("This user is not available :(");
        }
    }
    //==================================================================================================================

    /**
     *This method is for adding charge for the passenger.
     */
    public void addCharge(Passenger passenger)
    {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to add charge section :)");
        System.out.println("Personal information : ");
        System.out.print("User name : " + passenger.getUserName());
        System.out.println();
        System.out.print("Charge : " + passenger.getCharge());
        System.out.println();
        System.out.print("Please write the amount that you want to add : ");
        String charge1 = scanner.nextLine();
        if (utils.isValidNumber(charge1))
        {
            int charge = Integer.parseInt(charge1);
//        int charge = scanner.nextInt();
            charge = charge + passenger.getCharge();
            passenger.setCharge(charge);
            System.out.println("Your money has been added successfully :)");
        }else
        {
            System.out.println("your number is not valid :(");
        }
    }
    //==================================================================================================================

    /**
     *This method is for booking ticket for the passenger.
     */
    public void bookingTicket(Passenger passenger , HashMap < String , Flight > flightHashMap , HashMap<Integer , Flight> ticketHashMap , int ticketId , HashMap <Flight , ArrayList <Passenger>> flightPassengersHashMap)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to booking ticket section :)");
        System.out.print("Please enter the flight id that you want : ");
        String flightId = scanner.nextLine();
        if (flightHashMap.containsKey(flightId))
        {
            if (flightHashMap.get(flightId).getSeats() > 0)
            {
                int seats = flightHashMap.get(flightId).getSeats() - 1;
                flightHashMap.get(flightId).setSeats(seats);
                if (passenger.getCharge() >= flightHashMap.get(flightId).getPrice())
                {
                    int price = passenger.getCharge() - flightHashMap.get(flightId).getPrice();
                    passenger.setCharge(price);
                    ticketId = ticketId + 1;
                    ticketHashMap.put(ticketId , flightHashMap.get(flightId));
                    System.out.println("Your flight has been registered successfully :)");
                    Ticket ticket = new Ticket();
                    ticket.setTicketId(ticketId);
                    ticket.setFlightId(flightId);
                    ticket.setPassengerUserName(passenger.getUserName());
                    if (flightPassengersHashMap.containsKey(flightHashMap.get(flightId)))
                    {
                        flightPassengersHashMap.get(flightHashMap.get(flightId)).add(passenger);
                    }else
                    {
                        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
                        passengers.add(passenger);
                        flightPassengersHashMap.put(flightHashMap.get(flightId) , passengers);
                    }
                }
            }else
            {
                System.out.println("This flight is not available :(");
            }
        }else
        {
            System.out.println("This flight is not available :(");
        }
    }
    //==================================================================================================================

    /**
     * This method is for show booked tickets for passenger.
     */
    public void bookedTickets(HashMap<Integer , Flight> ticketHashMap)
    {
        System.out.println("Welcome to booked tickets section :)");
        System.out.println("Your flights that have been booked so far ---->");
        System.out.println("|FlightId    |Origin      |Destination |Date        |Time        |Price       |Seats       |");
        for(Integer key: ticketHashMap.keySet()) {
            System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%,-12d|%-12d|" , ticketHashMap.get(key).getFlightId() ,ticketHashMap.get(key).getOrigin() , ticketHashMap.get(key).getDestination() , ticketHashMap.get(key).getDate() , ticketHashMap.get(key).getTime() , ticketHashMap.get(key).getPrice() , ticketHashMap.get(key).getSeats());
            System.out.println();
        }
    }
    //==================================================================================================================

    /**
     *This method is for the passenger to cancel the ticket.
     */
    public void ticketCancellation(HashMap<Integer , Flight> ticketHashMap , Passenger passenger , HashMap <Flight , ArrayList <Passenger>> flightPassengersHashMap)
    {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ticket cancellation section :)");
        System.out.print("Please enter ticket id : ");
        String ticketId = scanner.nextLine();
        if (utils.isValidNumber(ticketId))
        {
            int ticketId1 = Integer.parseInt(ticketId);
            if (ticketHashMap.containsKey(ticketId1))
            {
                System.out.println("Origin : " + ticketHashMap.get(ticketId1).getOrigin());
                System.out.println("Destination : " + ticketHashMap.get(ticketId1).getDestination());
                System.out.println("Date : " + ticketHashMap.get(ticketId1).getDate());
                System.out.println("Time : " + ticketHashMap.get(ticketId1).getTime());
                System.out.println("Price : " + ticketHashMap.get(ticketId1).getPrice());
                System.out.println("Seats : " + ticketHashMap.get(ticketId1).getSeats());
                System.out.println("Are you sure you want to cancel it?");
                System.out.println("1 - yes");
                System.out.println("2 - No");
                while (true)
                {
                    String command = scanner.nextLine();
                    if (command.equals("1"))
                    {
                        int price = passenger.getCharge() + ticketHashMap.get(ticketId1).getPrice();
                        passenger.setCharge(price);
                        int seats = ticketHashMap.get(ticketId1).getSeats() + 1;
                        ticketHashMap.get(ticketId1).setPrice(seats);
                        flightPassengersHashMap.get(ticketHashMap.get(ticketId1)).remove(passenger);
                        ticketHashMap.remove(ticketId1);
                        System.out.println("Your flight is canceled ;)");
//                    flightPassengersHashMap.get(ticketHashMap.get(ticketId1)).remove(passenger);
                        break;
                    }else
                    {
                        if (command.equals("2"))
                        {
                            System.out.println("Your flight is not canceled ;)");
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
        }else
        {
            System.out.println("your ticket id is not valid :(");
        }
    }
    //==================================================================================================================

    /**
     *This method is for searching the flight ticket for passenger.
     */
    public void searchFlightTickets(HashMap <String , ArrayList<String>> searchHashMap , HashMap < String , Flight > flightHashMap)
    {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> searchIds = new ArrayList<String>();
        ArrayList<String> flightIds = new ArrayList<String>();
        System.out.println("Welcome to search flight tickets section :)");
        System.out.println("Which filters do you want to have on your flight ? ");
        System.out.println("1 - flight id");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.print("Please enter the flight id you want : ");
                String instanceFlightId = scanner.nextLine();
                fields.add("flight id : " + instanceFlightId);
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        System.out.println("2 - origin");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.print("Please enter the origin you want : ");
                String instanceOrigin = scanner.nextLine();
                if (utils.isValidCity(instanceOrigin))
                {
                    fields.add("origin : " + instanceOrigin);
                }
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        System.out.println("3 -  destination");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.print("Please enter the destination you want : ");
                String instanceDestination = scanner.nextLine();
                if (utils.isValidCity(instanceDestination))
                {
                    fields.add("destination : " + instanceDestination);
                }
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        System.out.println("4 -  date");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.print("Please enter the date you want : ");
                String instanceDate = scanner.nextLine();
                if (utils.isValidDate(instanceDate))
                {
                    fields.add("date : " + instanceDate);
                }
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        System.out.println("5 -  time");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.print("Please enter the time you want : ");
                String instanceTime = scanner.nextLine();
                if (utils.isValid24HourTime(instanceTime))
                {
                    fields.add("time : " + instanceTime);
                }
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        System.out.println("6 -  price");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        while (true)
        {
            String command = scanner.nextLine();
            if (command.equals("1"))
            {
                System.out.println("Please enter the price you want : ");
                System.out.print("Low price : ");
                String price = scanner.nextLine();
                int lowPrice = Integer.parseInt(price);
                System.out.print("Up price : ");
                String instancePrice = scanner.nextLine();
                int upPrice = Integer.parseInt(instancePrice);
                if (utils.isValidNumber(price) && utils.isValidNumber(instancePrice) && utils.isValidRange(lowPrice , upPrice))
                {
                    rangeSearch(lowPrice , upPrice ,flightIds ,searchHashMap ,flightHashMap , fields);
                }
                break;
            }else
            {
                if (command.equals("2"))
                {
                    break;
                }else
                {
                    System.out.println("Invalid :|");
                }
            }
        }
        andSearch(searchHashMap , fields , searchIds , flightIds);
        showSearchs(searchIds , flightHashMap);
    }
    //==================================================================================================================

    /**
     *This method is for price range search field.
     */
    public void rangeSearch(int lowPrice , int upPrice , ArrayList<String> flightIds , HashMap <String , ArrayList<String>> searchHashMap , HashMap < String , Flight > flightHashMap , ArrayList<String> fields)
    {
        int sizeOfRange = (upPrice/1000) - (lowPrice/1000);
        int lowRangeOfPrice = lowPrice - (lowPrice % 1000);
        int upRangeOfPrice = lowPrice + (1000 - (lowPrice % 1000));
        for (int i = 0; i < sizeOfRange + 1; i++) {
            lowRangeOfPrice = lowRangeOfPrice + (i * 1000);
            upRangeOfPrice = upRangeOfPrice + (i * 1000);
            if (searchHashMap.containsKey("price : " + lowRangeOfPrice + "," + upRangeOfPrice))
            {
                for (int j = 0; j < searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).size(); j++) {
                    if (flightHashMap.get(searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).get(j)).getPrice() >= lowPrice && flightHashMap.get(searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).get(j)).getPrice() <= upPrice)
                    {
//                        fields.add("price : " + lowRangeOfPrice + "," + upRangeOfPrice);
                        flightIds.add(searchHashMap.get("price : " + lowRangeOfPrice + "," + upRangeOfPrice).get(j));
                    }
                }
            }
        }

    }
    //==================================================================================================================
    /**
     *This method is for searching between ideas and intersecting them.
     */
    public void andSearch(HashMap <String , ArrayList<String>> searchHashMap , ArrayList<String> fields , ArrayList<String> searchIds , ArrayList<String> flightIds)
    {
//        ArrayList<String> flightIds = new ArrayList<String>();
        int count = 0;
        int countPrice = 0;
        if (flightIds.size() > 0)
        {
            countPrice++;
        }
        for (int i = 0; i < fields.size(); i++) {
            if (searchHashMap.containsKey(fields.get(i)))
            {
                for (int j = 0; j < searchHashMap.get(fields.get(i)).size(); j++) {
                    flightIds.add(searchHashMap.get(fields.get(i)).get(j));
                }
            }
        }

        for (int i = 0; i < flightIds.size(); i++) {
            count = 0;
            for (int j = i; j < flightIds.size(); j++) {
                if (flightIds.get(i).equals(flightIds.get(j)))
                {
                    count++;
                }
            }
            if (count >= (fields.size() + countPrice))
            {
                searchIds.add(flightIds.get(i));
            }
        }
    }
    //==================================================================================================================

    /**
     * This method is for showing the search results.
     */
    public void showSearchs(ArrayList<String> searchIds , HashMap < String , Flight > flightHashMap)
    {
        System.out.println("Flights that are currently available -------->");
        System.out.println("|FlightId    |Origin      |Destination |Date        |Time        |Price       |Seats       |");
        for (int i = 0; i < searchIds.size(); i++) {
            System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%,-12d|%-12d|"  , flightHashMap.get(searchIds.get(i)).getFlightId() , flightHashMap.get(searchIds.get(i)).getOrigin() , flightHashMap.get(searchIds.get(i)).getDestination() , flightHashMap.get(searchIds.get(i)).getDate() , flightHashMap.get(searchIds.get(i)).getTime() , flightHashMap.get(searchIds.get(i)).getPrice() , flightHashMap.get(searchIds.get(i)).getSeats());
            System.out.println();
        }
        if (searchIds.size() == 0)
        {
            System.out.println("No flights found :(");
        }
    }
    //==================================================================================================================
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        AirlineSystem airlineSystem = new AirlineSystem();
//        Passenger passenger = new Passenger();
//        passenger.setUserName("Arash");
//        passenger.setPassword("ap10752");
//        airlineSystem.getPassengerHashMap().put(passenger.getUserName(), passenger);
////        passenger.menuPassenger(airlineSystem.getFlightHashMap() , airlineSystem.getPassengerHashMap() , passenger ,airlineSystem.getSearchHashMap());
//    }
    //==================================================================================================================
}

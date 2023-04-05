import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AirlineSystem {
    //ArrayList<Passenger> passengerArrayList = new ArrayList<Passenger>();
    //Admin admin = new Admin("Arash Purfallah" , "Admin1234");
    //HashMap<String, Passenger> passengerHashMap = new HashMap<String, Passenger>();
    //==================================================================================================================

    /**
     * This method is for sign up for passengers.
     */
    public void signUp(HashMap<String , Passenger> passengerHashMap , Passenger passenger , Admin admin)
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
        passenger.setUserName(scanner.nextLine());
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
        passenger.setPassword(scanner.nextLine());
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
            if (passengerHashMap.containsKey(passenger.getUserName())) {
                System.out.println("This username has already been selected. Please choose another username;)");
                passenger.setUserName(scanner.nextLine());
            }else
            {
               if (passenger.getUserName().equals(admin.getUserName()))
               {
                   System.out.println("This username has already been selected. Please choose another username;)");
                   passenger.setUserName(scanner.nextLine());
               }else
               {
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
    public void signIn(HashMap<String , Passenger> passengerHashMap , Admin admin)
    {
        Scanner scanner = new Scanner(System.in);
        Passenger passenger = new Passenger();
        System.out.println("Please enter your username :)");
        String userName = scanner.nextLine();
        passenger.setUserName(userName);
        System.out.println("Please enter your password :)");
        String pass = scanner.nextLine();
        passenger.setPassword(pass);
        if (passengerHashMap.containsKey(passenger.getUserName()))
        {
            if (passengerHashMap.get(passenger.getUserName()).getPassword().equals(passenger.getPassword()))
            {
                System.out.println("Menu Passenger");
            }
        }else
        {
            if (admin.getUserName().equals(passenger.getUserName()))
            {
                if (admin.getPassword().equals(passenger.getPassword()))
                {
                    System.out.println("Menu Admin");
                }
            }else
            {
                System.out.println("NOT FOUND :|");
            }
        }
    }
    //==================================================================================================================
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Admin admin = new Admin("Arash Purfallah" , "admin1234");
        admin.setUserName("Arash Purfallah");
        admin.setPassword("admin1234");
        AirlineSystem airlineSystem = new AirlineSystem();
        HashMap<String, Passenger> passengerHashMap = new HashMap<String, Passenger>();
        airlineSystem.signUp(passengerHashMap , passenger , admin);
        //----------------------------------------------------------------------------------------------
        airlineSystem.signIn(passengerHashMap , admin);
    }
}

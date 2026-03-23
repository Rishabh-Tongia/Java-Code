import java.util.*;

class Customer {
    String name;
    int flightNo;
    int seatNo;
    String seatClass;

    public Customer(String name, int flightNo, int seatNo, String seatClass) {
        this.name = name;
        this.flightNo = flightNo;
        this.seatNo = seatNo;
        this.seatClass = seatClass;
    }

    public void printBoardingPass() {
        System.out.println("\n--- Boarding Pass ---");
        System.out.println("Passenger Name : " + name);
        System.out.println("Flight Number  : " + flightNo);
        System.out.println("Seat Number    : " + seatNo);
        System.out.println("Class          : " + seatClass);
    }
}

class Flight {
    int flightNo;
    boolean[] seats = new boolean[10];
    String[] passengers = new String[10];

    public Flight(int flightNo) {
        this.flightNo = flightNo;
        Arrays.fill(seats, false);
        Arrays.fill(passengers, null);
    }

    public boolean bookSeat(String name, int classChoice) {
        if (classChoice == 1) {
            for (int i = 0; i < 5; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    passengers[i] = name;
                    Customer c = new Customer(name, flightNo, i + 1, "First Class");
                    c.printBoardingPass();
                    return true;
                }
            }
            System.out.println("First Class is full.");
            return false;
        } 
        else if (classChoice == 2) {
            for (int i = 5; i < 10; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    passengers[i] = name;
                    Customer c = new Customer(name, flightNo, i + 1, "Economy");
                    c.printBoardingPass();
                    return true;
                }
            }
            System.out.println("Economy is full. Do you want to book in First Class? (1: Yes, 0: No)");
            Scanner sc = new Scanner(System.in);
            int upgrade = sc.nextInt();
            if (upgrade == 1) {
                return bookSeat(name, 1);
            } else {
                System.out.println("Next flight leaves in 3 hours.");
                return false;
            }
        } else {
            System.out.println("Invalid class choice.");
            return false;
        }
    }

    public void showPassengerList() {
        System.out.println("\nPassengers on Flight " + flightNo + ":");
        boolean empty = true;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println("Seat " + (i + 1) + ": " + passengers[i]);
                empty = false;
            }
        }
        if (empty) {
            System.out.println("No passengers booked yet.");
        }
    }
}

public class FlightBookings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flight flight1 = new Flight(1112);
        Flight flight2 = new Flight(3738);

        while (true) {
            System.out.println("\n--- Airline Reservation System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Admin Access");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("\nAvailable Flights:");
                System.out.println("1. Flight No: 1112");
                System.out.println("2. Flight No: 3738");
                System.out.print("Select flight (1 or 2): ");
                int flightChoice = sc.nextInt();

                Flight selectedFlight;
                int flightNo;
                if (flightChoice == 1) {
                    selectedFlight = flight1;
                    flightNo = 1112;
                } else if (flightChoice == 2) {
                    selectedFlight = flight2;
                    flightNo = 3738;
                } else {
                    System.out.println("Invalid flight selection.");
                    continue;
                }

                sc.nextLine();
                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();

                System.out.print("Type 1 for First Class or 2 for Economy: ");
                int classChoice = sc.nextInt();

                selectedFlight.bookSeat(name, classChoice);
            }

            else if (option == 2) {
                sc.nextLine();
                System.out.print("Enter admin password: ");     // password-admin123
                String pass = sc.nextLine();
                if (pass.equals("admin123")) {
                    System.out.println("Access granted.");
                    flight1.showPassengerList();
                    flight2.showPassengerList();
                } else {
                    System.out.println("Incorrect password.");
                }
            }

            else if (option == 3) {
                System.out.println("Exiting,Thank you for using the reservation system!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}

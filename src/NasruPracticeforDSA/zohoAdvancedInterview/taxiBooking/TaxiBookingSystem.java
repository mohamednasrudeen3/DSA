package NasruPracticeforDSA.zohoAdvancedInterview.taxiBooking;

import NasruPracticeforDSA.javaPractice.oOps.Counstructor.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiBookingSystem {
    static List<Taxi> taxis= new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    static int customerCounter= 1;
    public static void initializeTaxis(int numTaxis){
        for(int i=1;i<=numTaxis;i++){
            Taxi taxi=new Taxi(i);
            taxis.add(taxi);
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the number of Taxis:");
        int numTaxis= sc.nextInt();
        initializeTaxis(numTaxis);


        while(true){
            System.out.println("\n1. Book Taxi \n2.Taxi Details\n3. Exit ");
            System.out.println("Enter the Choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    bookTaxi();
                    break;
                case 2:
                    displayTaxiDetails();
                    break;
                case 3:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("enter Valid Choice");
            }
        }
    }

    private static void bookTaxi() {
        int customerId = customerCounter++;
        System.out.println("Enter the pick Point(A-F)");
        char pickUp=sc.next().toUpperCase().charAt(0);
        System.out.println("Enter the drop Point(A-F)");
        char drop = sc.next().toUpperCase().charAt(0);
        System.out.println("Enter PickUp Time in Hours");
        int pickupTime = sc.nextInt();


        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        for(Taxi taxi:taxis){
           if(taxi.isAvailable(pickupTime)){
               int distance = Math.abs(taxi.currentPosition-pickUp);
               if(distance<minDistance ||(distance == minDistance && taxi.totalEarnings<selectedTaxi.totalEarnings)){
                    selectedTaxi = taxi;
                    minDistance =distance;
               }

           }
        }
        if(selectedTaxi== null){
            System.out.println("Booking Rejected No Taxi Available");
        }
        int dropTime = pickupTime +Math.abs(drop-pickUp);
        int amount= selectedTaxi.calculateEarnings(pickUp,drop);
        int bookingId = selectedTaxi.bookings.size()+1;
        Booking booking = new Booking(bookingId,customerId,pickupTime,dropTime,pickUp,drop,amount);
        selectedTaxi.addBookings(booking);
        System.out.println("Taxi-"+selectedTaxi.id+"is Allocated.");

    }
    public static void displayTaxiDetails(){
        for(Taxi taxi:taxis){
            System.out.println("Taxi"+taxi.id+" Total Earnings: Rs "+taxi.totalEarnings);
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                    "BookingId","CustomerId","From","To","PickUpTime","DropTime","Amount");
           for(Booking booking: taxi.bookings){
               System.out.printf("%-10d %-10d %-10c %-10c %-10d %-10d %-10d%n",
                       booking.bookingId,booking.customerId,booking.from,booking.to,booking.pickupTime,booking.dropTime,booking.amount);

           }

        }
    }

}

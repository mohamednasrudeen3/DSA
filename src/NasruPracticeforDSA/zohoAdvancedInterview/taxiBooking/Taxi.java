package NasruPracticeforDSA.zohoAdvancedInterview.taxiBooking;

import NasruPracticeforDSA.javaPractice.oOps.Counstructor.Book;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    int id;
    char currentPosition='A';
    int totalEarnings = 0;
    List<Booking> bookings= new ArrayList<>();



    public Taxi(int id) {
        this.id = id;
    }
    public boolean isAvailable(int requestTime){
        if(bookings.isEmpty()){
            return true;
        }
        Booking lastBooking= bookings.get(bookings.size()-1);
        return lastBooking.dropTime <= requestTime;

    }

    public int calculateEarnings(char from, char to){
        int distance =Math.abs(to-from) * 15;
        int amount =100+Math.max(0,(distance-5)*10);
        return amount;
    }

    public void addBookings(Booking booking){
        bookings.add(booking);
        totalEarnings += booking.amount;
        currentPosition = booking.to;

    }

}

package NasruPracticeforDSA.lld.parkingLot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private ParkingSpot spot;
    private String ticketId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;


    public ParkingTicket(String ticketId, ParkingSpot spot,Vehicle vehicle){
        this.ticketId=ticketId;
        this.spot=spot;
        this.entryTime=LocalDateTime.now();
        this.vehicle=vehicle;
    }

    public void setExitTime(){
        this.exitTime= LocalDateTime.now();
    }

    public long getParkingDurationSeconds(){
        return java.time.Duration.between(entryTime, exitTime).toHours();
    }

    public ParkingSpot getSpot(){
        return spot;
    }
public Vehicle getVehicle(){
        return vehicle;
}

}

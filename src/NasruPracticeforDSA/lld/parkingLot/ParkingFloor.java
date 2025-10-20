package NasruPracticeforDSA.lld.parkingLot;

import java.util.HashMap;
import java.util.Optional;

public class ParkingFloor {
    private int floorNumber;
    HashMap<String, ParkingSpot> spots = new HashMap<>();

    public ParkingFloor(int floorNumber){
        this.floorNumber=floorNumber;
    }

    public void addSpot(ParkingSpot spot){
        spots.put(spot.getSpotId(),spot);
    }


    public Optional<ParkingSpot> findAvailableSpot(Vehicle vehicle){
   return spots.values().stream()
        .filter(ParkingSpot::isAvailable)
        .filter(s->s.canFitVehicle(vehicle))
        .findFirst();
    }


    public void displayAvailability(){
    long available=spots.values().stream().filter(ParkingSpot::isAvailable).count();
    System.out.println("Floor "+ floorNumber + " available Spots: "+ available);
    }
}

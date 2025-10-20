package NasruPracticeforDSA.lld.parkingLot;

import java.util.*;

public class ParkingLotSystem {
    private static ParkingLotSystem instance;
    private List<ParkingFloor> floors = new ArrayList<>();
    private Map<String,ParkingTicket > activeTickets = new HashMap<>();
    private ParkingStrategy parkingStrategy;
    private FeeStrategy feeStrategy;

    private ParkingLotSystem(){
    }

    public static ParkingLotSystem getInstance(){
        if(instance==null){
            instance= new ParkingLotSystem();
        }
        return instance;
    }

   public void addFloor(ParkingFloor parkingFloor){
        floors.add(parkingFloor);
   }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public Optional<ParkingTicket> parkVehicle(Vehicle vehicle){
        Optional<ParkingSpot> spotOpt=parkingStrategy.findSpot(floors,vehicle);
        if(spotOpt.isEmpty()){
            System.out.println("No Available Spot for Vehicle : "+ vehicle.getLicenseNumber());
            return Optional.empty();
        }

        ParkingSpot spot= spotOpt.get();
        spot.parkVehicle(vehicle);
        ParkingTicket ticket = new ParkingTicket(UUID.randomUUID().toString(),spot, vehicle);
        activeTickets.put(ticket.getVehicle().getLicenseNumber(),ticket );
        return Optional.of(ticket);
    }

    public Optional<Double> unparkVehicle(String licenseNumber){
        ParkingTicket ticket=activeTickets.remove(licenseNumber);
        if(ticket==null) {
            return Optional.empty();
        }
        ticket.setExitTime();
        double fee = feeStrategy.calculateFeeStrategey(ticket);
        ticket.getSpot().unParkVehicle();
        return Optional.of(fee);
    }
}


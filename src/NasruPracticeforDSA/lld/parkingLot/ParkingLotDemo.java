package NasruPracticeforDSA.lld.parkingLot;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLotSystem lot = ParkingLotSystem.getInstance();
        lot.setParkingStrategy(new NearestFirstStrategy());
        lot.setFeeStrategy(new VehicleBasedFeeStrategy());

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot("1A", VehicleSize.SMALL));
        floor1.addSpot(new ParkingSpot("1B", VehicleSize.MEDIUM));
        lot.addFloor(floor1);

        Vehicle car = new Car("TN01AB1234");
        var ticketOpt = lot.parkVehicle(car);
        ticketOpt.ifPresent(ticket -> {
            System.out.println("Parked at spot: " + ticket.getSpot().getSpotId());
        });

        lot.unparkVehicle(car.getLicenseNumber())
                .ifPresent(fee -> System.out.println("Parking fee: Rs. " + fee));
    }
}

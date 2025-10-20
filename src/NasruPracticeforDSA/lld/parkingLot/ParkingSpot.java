package NasruPracticeforDSA.lld.parkingLot;

public class ParkingSpot {
    private VehicleSize spotSize;
    private String spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;


    public ParkingSpot(String spotId,VehicleSize spotSize){
    this.spotId=spotId;
    this.spotSize=spotSize;
    this.isOccupied=false;
    }

     public boolean canFitVehicle(Vehicle vehicle){
        return !isOccupied && vehicle.getSize().ordinal()<=spotSize.ordinal();
    }

   public boolean parkVehicle(Vehicle vehicle){
        if(canFitVehicle(vehicle)){
            this.parkedVehicle=vehicle;
            this.isOccupied=true;
            return true;
        }
        return false;
   }

   public void unParkVehicle(){
        this.parkedVehicle=null;
        this.isOccupied=false;
   }

   public boolean isAvailable(){
        return !isOccupied;
   }

    public VehicleSize getSpotSize(){
        return spotSize;
    }

    public String getSpotId(){
        return spotId;
    }

}

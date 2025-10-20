package NasruPracticeforDSA.lld.parkingLot;

public abstract class Vehicle {
    protected VehicleSize size;
    protected String licenseNumber;

    public Vehicle(VehicleSize size,String licenseNumber){
        this.size=size;
        this.licenseNumber=licenseNumber;
    }

    public VehicleSize getSize(){
        return size;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }


}

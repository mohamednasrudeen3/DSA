package NasruPracticeforDSA.lld.parkingLot;

import java.util.HashMap;
import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy{
    private static final Map<VehicleSize, Double> SECONDLY_RATES = new HashMap<>();

    static {
        SECONDLY_RATES.put(VehicleSize.LARGE,30.0);
        SECONDLY_RATES.put(VehicleSize.SMALL,10.0);
        SECONDLY_RATES.put(VehicleSize.MEDIUM,20.0);
    }
    @Override
    public double calculateFeeStrategey(ParkingTicket ticket) {
        VehicleSize size = ticket.getVehicle().size;
        double rate = SECONDLY_RATES.get(size);
        return ticket.getParkingDurationSeconds()*rate;
    }
}

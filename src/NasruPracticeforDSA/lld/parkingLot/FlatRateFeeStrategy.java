package NasruPracticeforDSA.lld.parkingLot;

public class FlatRateFeeStrategy implements FeeStrategy{
    private static final double RATE_PER_SECONDS=20.0;

    @Override
    public double calculateFeeStrategey(ParkingTicket ticket) {
        return ticket.getParkingDurationSeconds() * RATE_PER_SECONDS;
    }
}

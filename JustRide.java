class JustRide extends Ride {
    private static final int FARE_PER_KM = 22;

    @Override
    public int computeFare(Request request) {
        int totalFare = FARE_PER_KM * request.getDistance();
        
        // check whether request was during peak hours
        if (request.getTime() >= super.getStartPeak() && request.getTime() <= super.getEndPeak()) {
            totalFare += super.getSurcharge();
        }
        return totalFare;
    }

    @Override
    public String toString() {
        return "JustRide";
    }
}


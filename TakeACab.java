class TakeACab extends Ride {
    private static final int BOOKING_FEE = 200;
    private static final int FARE_PER_KM = 33;

    @Override
    public int computeFare(Request request) {
        return BOOKING_FEE + FARE_PER_KM * request.getDistance(); 
    }

    @Override
    public String toString() {
        return "TakeACab";
    }
}

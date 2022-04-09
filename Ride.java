abstract class Ride {
    private static final int SURCHARGE = 500;
    private static final int START_PEAK_TIME = 600;
    private static final int END_PEAK_TIME = 900;

    int getSurcharge() {
        return SURCHARGE;
    }

    int getStartPeak() {
        return START_PEAK_TIME;
    }

    int getEndPeak() {
        return END_PEAK_TIME;
    }

    abstract int computeFare(Request request);
}

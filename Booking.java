class Booking implements Comparable<Booking> {
    private final Driver driver;
    private final Request request;
    private final int fare;
    private final Ride ride;
    private static final int CENTS_IN_A_DOLLAR = 100;

    Booking(Driver driver, Request request) {
        this.driver = driver;
        this.request = request;
        this.ride = computeBetterRide(request);
        this.fare = computeCheaperFare(request);
    }

    Booking(Driver driver, Request request, Ride ride, int fare) {
        this.driver = driver;
        this.request = request;
        this.ride = ride;
        this.fare = fare;
    }

    private int computeCheaperFare(Request request) {
        return this.ride.computeFare(request);
    }

    private Ride computeBetterRide(Request request) { 
        if (this.driver.getJustRideFare(request) > this.driver.getOtherRideFare(request)) {
            return driver.getOtherRide();     
        } else {
            return driver.getJustRide(); 
        }
    }

    @Override
    public int compareTo(Booking other) {
       
        // check if fare is diff
        if (this.fare != other.fare) {
            return this.fare - other.fare;
        } 
        // check if waiting time is diff
        if (this.driver.getWaitingTime() != other.driver.getWaitingTime()) {
            return this.driver.getWaitingTime() - other.driver.getWaitingTime();
        }    
       
        return this.fare - other.fare; 
    }

    public String toString() {
        return String.format("$%d.%02d using %s (%s)", this.fare / CENTS_IN_A_DOLLAR, 
                this.fare % CENTS_IN_A_DOLLAR, this.driver.toString(), this.ride.toString());
    }
}



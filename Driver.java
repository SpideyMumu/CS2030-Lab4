abstract class Driver {
    private final String numPlate;
    private final int waitingTime;


    Driver(String numPlate, int waitingTime) {
        this.numPlate = numPlate;
        this.waitingTime = waitingTime;
    }

    int getWaitingTime() {
        return this.waitingTime;
    }

    @Override
    public String toString() {
        return String.format("%s (%d mins away) ", numPlate, waitingTime);
    }


    /* These methods is to get which service the Driver is doing. 
     * Either JustRide or TakeACab for Normal Driver
     * Either JustRide or ShareACab for Private Driver
    */
    abstract Ride getJustRide();

    abstract Ride getOtherRide();
    
    abstract int getJustRideFare(Request request);
    
    abstract int getOtherRideFare(Request request);

}

class PrivateCar extends Driver {
    private final JustRide justRide;
    private final ShareARide shareARide;

    PrivateCar(String numPlate, int waitingTime) {
        super(numPlate, waitingTime);
        this.justRide = new JustRide();
        this.shareARide = new ShareARide();
    }

    @Override
    Ride getJustRide() {
        return this.justRide;
    }

    @Override
    Ride getOtherRide() {
        return this.shareARide;
    }

    @Override
    int getJustRideFare(Request request) {
        return this.justRide.computeFare(request);
    }

    @Override
    int getOtherRideFare(Request request) {
        return this.shareARide.computeFare(request);
    }

    @Override
    public String toString() {
        return super.toString() + "PrivateCar";
    }
}

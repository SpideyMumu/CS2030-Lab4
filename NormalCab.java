class NormalCab extends Driver {
    private final JustRide justRide;
    private final TakeACab takeACab;
    
    NormalCab(String numPlate, int waitingTime) {
        super(numPlate, waitingTime);
        this.takeACab = new TakeACab();
        this.justRide = new JustRide();
    }
    
    @Override
    Ride getJustRide() {
        return this.justRide;
    }

    @Override
    Ride getOtherRide() {
        return this.takeACab;
    }

    @Override
    int getJustRideFare(Request request) {
        return this.justRide.computeFare(request);
    }

    @Override
    int getOtherRideFare(Request request) {
        return this.takeACab.computeFare(request);
    }

    @Override
    public String toString() {
        return super.toString() + "NormalCab";
    }
}

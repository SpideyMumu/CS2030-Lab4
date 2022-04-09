void findBestBooking(Request request, List<Driver> drivers) {
    ImList<Booking> bookings = new ImList<Booking>();
    
    for(Driver driver: drivers) {
        Ride justRide = driver.getJustRide();
        Ride otherRide = driver.getOtherRide();
        int justRideFare = driver.getJustRideFare(request);
        int otherRideFare = driver.getOtherRideFare(request);
       
        //create new bookings for driver
        bookings = bookings.add(new Booking(driver, request, justRide, justRideFare)).add(new Booking(driver, request, otherRide, otherRideFare)); 
   }

   bookings = bookings.sort(new BookingComp());
   
   for(Booking booking: bookings) {
        System.out.println(booking);
   }
}

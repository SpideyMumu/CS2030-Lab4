import java.util.Comparator;

class BookingComp implements Comparator<Booking> {    
    public int compare(Booking b1, Booking b2) {
        int diff = b1.compareTo(b2);
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

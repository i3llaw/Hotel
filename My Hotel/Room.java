public class Room {
    private int roomNumber;
    private int numBeds;
    private boolean booked;
    private Booking booking;

    public Room(int roomNumber, int numBeds) {
        this.roomNumber = roomNumber;
        this.numBeds = numBeds;
        this.booked = false;
        this.booking = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public boolean isBooked() {
        return booked;
    }

    public boolean book(Booking booking) {
        if (!booked) {
            this.booking = booking;
            booked = true;
            return true;
        } else {
            return false;
        }
    }

    public Booking checkOut() {
        if (booked) {
            booked = false;
            Booking checkedOutBooking = booking;
            booking = null;
            return checkedOutBooking;
        } else {
            return null;
        }
    }
}
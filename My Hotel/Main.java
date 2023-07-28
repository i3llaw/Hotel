import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Create a new hotel with 490 rooms
        Hotel hotel = new Hotel(490);

        // Create a new guest with ID 1 and name "John Doe"
        Guest guest = new Guest(1005021536, "Abdullah Al Safwan");

        // Create a new booking for the guest
        LocalDate checkInDate = LocalDate.now();
        LocalDate checkOutDate = checkInDate.plusDays(3);
        Booking booking = new Booking(guest.getId(), guest.getName(), checkInDate, checkOutDate);

        // Book a room for the guest using the booking
        boolean success = hotel.bookRoom(2, booking);
        if (success) {
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Failed to book room.");
        }

        // Get the guest's staying period
        long numDays = ChronoUnit.DAYS.between(checkInDate, checkOutDate);

        // Print the guest's name, ID, and staying period
        System.out.println("Guest name: " + guest.getName());
        System.out.println("Guest ID: " + guest.getId());
        System.out.println("Staying period: " + numDays + " days");

        // Check out the guest from the room
        Booking checkedOutBooking = hotel.checkOut(2);
        if (checkedOutBooking != null) {
            System.out.println("Guest " + checkedOutBooking.getGuestName() + " checked out successfully.");
        } else {
            System.out.println("Failed to check out guest.");
        }
    }
}
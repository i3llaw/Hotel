import java.time.LocalDate;

public class Booking {
    private int guestId;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(int guestId, String guestName, LocalDate checkInDate, LocalDate checkOutDate) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
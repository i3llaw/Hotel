import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>(numRooms);
        for (int i = 1; i <= numRooms; i++) {
            if (i % 3 == 0) {
                rooms.add(new Room(i, 3));
            } else if (i % 3 == 2) {
                rooms.add(new Room(i, 2));
            } else {
                rooms.add(new Room(i, 1));
            }
        }
    }

    public boolean bookRoom(int roomNumber, Booking booking) {
        Room room = getRoom(roomNumber);
        if (room != null) {
            return room.book(booking);
        } else {
            return false;
        }
    }

    public Booking checkOut(int roomNumber) {
        Room room = getRoom(roomNumber);
        if (room != null) {
            return room.checkOut();
        } else {
            return null;
        }
    }

    private Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
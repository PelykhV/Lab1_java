package ua.lviv.iot.algo.part1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HotelManagerTest {
    private HotelManager hotelManager;

    @BeforeEach
    public void setUp() {
        hotelManager = new HotelManager();
        hotelManager.addHotel(new ResortHotel("Monte Carlo", 465, 35, 4.6,
                "Paperoni", 3, 4, 6));
        hotelManager.addHotel(new ResortHotel("New Orleano", 641, 146, 3.8,
                "Matrix", 6, 10, 10));
        hotelManager.addHotel(new Motel("Pump", 444, 111, 5.0, 411, 114,
                "Katowice", "Lodz"));
        hotelManager.addHotel(new Motel("Cloud", 1760, 600, 4.7, 927, 270,
                "Paris", "Lion"));
        hotelManager.addHotel(new BusinessHotel("Light", 311, 19, 4.7,
                30, "Samsung"));
        hotelManager.addHotel(new BusinessHotel("Seven", 100, 50, 4.2,
                20, "LG"));
        hotelManager.addHotel(new SpaHotel("Dream", 60, 56, 4.1,
                3, "Fly"));
        hotelManager.addHotel(new SpaHotel("Rainbow", 70, 56, 4.8,
                5, "Winter"));
    }

    @Test
    @DisplayName("Test addHotel method")
    public void testAddHotel() {
        hotelManager.addHotel(new BusinessHotel("Test Hotel", 100, 10, 4.0,
                20, "Test"));
        assertEquals(9, hotelManager.getHotels().size());
    }

    @Test
    @DisplayName("Test findHotelsWithRatingMoreThan method")
    public void testFindHotelsWithRatingMoreThan() {
        List<Hotel> hotels = hotelManager.findHotelsWithRatingMoreThan(4.5);
        assertEquals(4, hotels.size());
        for (Hotel hotel : hotels) {
            assertEquals(true, hotel.getRating() > 4.5);
        }
    }

    @Test
    @DisplayName("Test findHotelsWithTotalRoomsMoreThan method")
    public void testFindHotelsWithTotalRoomsMoreThan() {
        List<Hotel> hotels = hotelManager.findHotelsWithTotalRoomsMoreThan(400);
        assertEquals(2, hotels.size());
        for (Hotel hotel : hotels) {
            assertEquals(true, hotel.getTotalRooms() > 400);
        }
    }
}

package ua.lviv.iot.algo.part1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BusinessHotelTest {

    private final BusinessHotel hotel = new BusinessHotel("Hilton", 200, 100, 4.5, 10, "Microsoft");

    @Test
    public void testGetLocation() {
        assertEquals("Microsoft", hotel.getLocation());
    }

    @Test
    public void testToString() {
        String expected = "BusinessHotel(name=Hilton, totalRooms=200, availableRooms=100, rating=4.5, offices=10, companyOwner=Microsoft)";
        assertEquals(expected, hotel.toString());
    }

    @Test
    public void testGetOccupancyRate() {
        assertEquals(0.5, hotel.getOccupancyRate(), 0.001);
    }
}


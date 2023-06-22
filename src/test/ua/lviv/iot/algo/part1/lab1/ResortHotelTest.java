package ua.lviv.iot.algo.part1.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResortHotelTest {
    private final ResortHotel resort = new ResortHotel("Atlantis", 500, 300, 4.8, "Paradise Island", 10, 2, 3);

    @Test
    public void testGetLocation() {
        assertEquals("Paradise Island", resort.getLocation());
    }

    @Test
    public void testToString() {
        String expected = "ResortHotel(super=Hotel(name=Atlantis, totalRooms=500, availableRooms=300, rating=4.8), complexName=Paradise Island, restaurantQuantity=10, childrenPools=2, adultPools=3)";
        assertEquals(expected, resort.toString());
    }

    @Test
    public void testGetOccupancyRate() {
        assertEquals(0.6, resort.getOccupancyRate(), 0.001);
    }

}

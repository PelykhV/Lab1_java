package ua.lviv.iot.algo.part1.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpaHotelTest {
    private final SpaHotel spa = new SpaHotel("Grand Hotel & SPA", 300, 200, 4.7, 3, "Grand Resort");

    @Test
    public void testGetLocation() {
        assertEquals("Grand Resort", spa.getLocation());
    }

    @Test
    public void testToString() {
        String expected = "SpaHotel(super=Hotel(name=Grand Hotel & SPA, type=SpaHotel, totalRooms=300, availableRooms=200, rating=4.7), fitnessRooms=3, complexName=Grand Resort)";
        assertEquals(expected, spa.toString());
    }

    @Test
    public void testGetOccupancyRate() {
        assertEquals(0.666, spa.getOccupancyRate(), 0.001);
    }

}
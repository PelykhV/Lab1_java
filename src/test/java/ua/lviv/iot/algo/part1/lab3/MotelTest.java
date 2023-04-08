package ua.lviv.iot.algo.part1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotelTest {
    private final Motel motel = new Motel("Motel One", 50, 30, 4.0, 5, 100, "Lviv", "Kyiv");

    @Test
    public void testGetLocation() {
        assertEquals("Lviv-Kyiv, 100км", motel.getLocation());
    }

    @Test
    public void testToString() {
        String expected = "Motel(name=Motel One, totalRooms=50, availableRooms=30, rating=4.0, trackNumber=5, trackKilometer=100, cityFrom=Lviv, cityTo=Kyiv)";
        assertEquals(expected, motel.toString());
    }

    @Test
    public void testGetOccupancyRate() {
        assertEquals(0.6, motel.getOccupancyRate(), 0.001);
    }

}



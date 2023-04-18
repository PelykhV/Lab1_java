package ua.lviv.iot.algo.part1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HotelWriterTest {
    private static final String RESULT_FILENAME = "src\\expected.csv";
    private static final String ACTUAL_FILENAME = "src\\hotel.csv";
    public HotelWriter hotelWriter;
    public List<Hotel> hotels;
    public List<Hotel> hotelstest;
    public File expectedFile;
    public File actualFile;
    @BeforeEach
    public final void setUp() throws IOException {
        hotelWriter = new HotelWriter();
        expectedFile = new File(RESULT_FILENAME);
        hotels = new ArrayList<>();
        hotels.add(new ResortHotel("Monte Carlo", 465, 35, 4.6,
                "Paperoni", 3, 4, 6));
        hotels.add(new Motel("Pump", 444, 111, 5.0, 411, 114,
                "Katowice", "Lodz"));
        hotels.add(new BusinessHotel("Light", 311, 19, 4.7,
                30, "Samsung"));
        hotels.add(new SpaHotel("Rainbow", 70, 56, 4.8,
                5, "Winter"));
        Files.deleteIfExists(Path.of(hotelWriter.file.getPath()));

        hotelstest = new ArrayList<>();
        hotelstest.add(new Motel("Cloud", 1760, 600, 4.7, 927, 270,
                "Paris", "Lion"));
    }
    @AfterAll
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(ACTUAL_FILENAME));
    }
    @Test
    public final void testPrintToFile() throws IOException {
        hotelWriter.writeToFile(hotels);
        Path path1 = hotelWriter.file.toPath();
        Path path2 = expectedFile.toPath();
        Assertions.assertEquals(-1L, Files.mismatch(path1, path2));
    }
    @Test
    public final void testIsFileEmpty() throws IOException {
        hotelWriter.writeToFile(null);
        Assertions.assertFalse(hotelWriter.file.exists());
    }
    @Test
    public final void testDublicateFile() throws IOException {
        hotelWriter.writeToFile(hotelstest);
        hotelWriter.writeToFile(hotels);
        Path path1 = hotelWriter.file.toPath();
        Path path2 = expectedFile.toPath();
        Assertions.assertEquals(-1L, Files.mismatch(path1, path2));
    }
}

package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static ua.lviv.iot.algo.part1.lab1.HotelWriter.file;
public class HotelManager {
    private final List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> findHotelsWithRatingMoreThan(double rating) {
        return hotels.stream().
                filter(hotel -> hotel.getRating() > rating).
                collect(Collectors.toList());
    }

    public List<Hotel> findHotelsWithTotalRoomsMoreThan(int totalRooms) {
        return hotels.stream().
                filter(hotel -> hotel.getTotalRooms() > totalRooms).
                collect(Collectors.toList());
    }
    public List<Hotel> getHotels() {
        return hotels;
    }

    public static void main(String[] args) throws IOException {
        HotelWriter hotelWriter = new HotelWriter();
        hotelWriter.printWriter = new PrintWriter(file);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new ResortHotel("Monte Carlo", 465, 35, 4.6,
                "Paperoni", 3, 4, 6));
        hotels.add(new ResortHotel("New Orleano", 641, 146, 3.8,
                "Matrix", 6, 10, 10));
        hotels.add(new Motel("Pump", 444, 111, 5.0, 411, 114,
                "Katowice", "Lodz"));
        hotels.add(new Motel("Cloud", 1760, 600, 4.7, 927, 270,
                "Paris", "Lion"));
        hotels.add(new BusinessHotel("Light", 311, 19, 4.7,
                30, "Samsung"));
        hotels.add(new BusinessHotel("Seven", 100, 50, 4.2,
                20, "LG"));
        hotels.add(new SpaHotel("Dream", 60, 56, 4.1,
                3, "Fly"));
        hotels.add(new SpaHotel("Rainbow", 70, 56, 4.8,
                5, "Winter"));

        hotelWriter.writeToFile(hotels);
    }
}

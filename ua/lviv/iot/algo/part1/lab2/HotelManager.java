package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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

    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
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

        for (Hotel hotel : hotelManager.hotels) {
            System.out.println(hotel);
        }

        System.out.println("\n");

        var hotelRating = hotelManager.findHotelsWithRatingMoreThan(4.5);
        for (Hotel hotel: hotelRating){
            System.out.println(hotel);
        }

        System.out.println("\n");

        var hotelRooms = hotelManager.findHotelsWithTotalRoomsMoreThan(400);
        for (Hotel hotel: hotelRooms){
            System.out.println(hotel);
        }
    }
}


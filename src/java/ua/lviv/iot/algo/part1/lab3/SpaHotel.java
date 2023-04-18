package ua.lviv.iot.algo.part1;

import lombok.ToString;

@ToString
public class SpaHotel extends Hotel{
    public static final String HEADERS = "fitnessRooms, complexName";
    public int fitnessRooms;
    public String complexName;
    public SpaHotel(String name, int totalRooms, int availableRooms, double rating, int fitnessRooms,
                    String complexName){
        super(name,totalRooms,availableRooms,rating);
        this.fitnessRooms=fitnessRooms;
        this.complexName=complexName;
        type = "SpaHotel";
    }

    @Override
    public String getLocation() {
        return complexName;
    }
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCsv() {
        return super.toCsv() + "," + fitnessRooms + "," + complexName;
    }
}

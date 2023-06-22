package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class Motel extends Hotel{
    public static final String HEADERS = "trackNumber, trackKilometer, cityFrom, cityTo";
    private int trackNumber;
    private int trackKilometer;
    private String cityFrom;
    private String cityTo;

    public Motel(String name, int totalRooms, int availableRooms, double rating, int trackNumber, int trackKilometer,
                 String cityFrom, String cityTo){
        super(name,totalRooms,availableRooms,rating);
        this.trackNumber=trackNumber;
        this.trackKilometer=trackKilometer;
        this.cityFrom=cityFrom;
        this.cityTo=cityTo;
        type = "Motel";
    }

    @Override
    public String getLocation() {
        return cityFrom + "-" +cityTo + ", " + trackKilometer + "км";
    }
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCsv() {
        return super.toCsv() + "," + trackNumber + "," + trackKilometer + "," + cityFrom + "," + cityTo;
    }
}
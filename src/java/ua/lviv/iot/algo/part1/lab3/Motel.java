package ua.lviv.iot.algo.part1;

import lombok.ToString;

@ToString
public class Motel extends Hotel{
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
    }
    @Override
    public String getLocation() {
        return cityFrom + "-" +cityTo + ", " + trackKilometer + "км";
    }
}

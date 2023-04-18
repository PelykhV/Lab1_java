package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Hotel {
    public static final String HEADERS = "name, totalRooms, availableRooms, rating";
    private String name;
    protected String type;
    private int totalRooms;
    private int availableRooms;
    private double rating;
    public Hotel(String name, int totalRooms, int availableRooms, double rating) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }

    public void backRoom(){
        if(availableRooms > 0){
            availableRooms--;
        }
    }
    public void releaseRoom(){
        if(availableRooms < totalRooms){
            availableRooms++;
        }
    }

    public double getOccupancyRate() {
        return (double)getAvailableRooms() / getTotalRooms();
    }
    public int getAvailableRooms(){
        return availableRooms;
    }
    public int getBookedRoomsCount(){
        return totalRooms - availableRooms;
    }
    public abstract String getLocation();
    public String getHeaders() {
        return HEADERS;
    }
    public String toCsv() {
        return name + "," + totalRooms + "," + availableRooms + "," + rating;
    }

}

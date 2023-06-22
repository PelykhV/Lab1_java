package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Hotel {
    private int roomNumber;
    private String name;
    private int totalRooms;
    private int availableRooms;
    private double rating;
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
}

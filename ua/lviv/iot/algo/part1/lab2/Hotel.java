package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Hotel {
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
    public int getAvailableRooms(){
        return availableRooms;
    }
    public int getBookedRoomsCount(){
        return totalRooms - availableRooms;
    }
    public abstract String getLocation();
}

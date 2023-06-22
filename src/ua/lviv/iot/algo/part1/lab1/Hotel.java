package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Hotel {
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

    private static Hotel instance;

    public static Hotel getInstance(){
        if (instance == null){
            instance = new Hotel();
        }
        return instance;
    }

    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[4];
        hotels[0] = new Hotel();
        hotels[1] = new Hotel("Lviv", 370, 165, 4.1);
        hotels[2] = Hotel.getInstance();
        hotels[3] = Hotel.getInstance();

        for(Hotel hotel : hotels){
            System.out.println(hotel);
        }
    }
}

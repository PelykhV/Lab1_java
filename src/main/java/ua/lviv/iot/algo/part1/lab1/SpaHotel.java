package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class SpaHotel extends Hotel{
    public int fitnessRooms;
    public String complexName;
    public SpaHotel(String name, int totalRooms, int availableRooms, double rating, int fitnessRooms,
                    String complexName){
        super(name,totalRooms,availableRooms,rating);
        this.fitnessRooms=fitnessRooms;
        this.complexName=complexName;
    }

    @Override
    public String getLocation() {
        return complexName;
    }
}
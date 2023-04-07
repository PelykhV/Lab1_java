package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString
public class ResortHotel extends Hotel{
    private String complexName;
    private int restaurantQuantity;
    private int childrenPools;
    private int adultPools;

    public ResortHotel(String name, int totalRooms, int availableRooms, double rating, String complexName,
                       int restaurantQuantity, int childrenPools, int adultPools){
        super(name,totalRooms,availableRooms,rating);
        this.complexName=complexName;
        this.restaurantQuantity=restaurantQuantity;
        this.childrenPools=childrenPools;
        this.adultPools=adultPools;
    }
    @Override
    public String getLocation() {
        return complexName;
    }
}


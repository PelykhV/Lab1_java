package ua.lviv.iot.algo.part1;

import lombok.ToString;

@ToString
public class ResortHotel extends Hotel{
    public static final String HEADERS = "complexName, restaurantQuantity, childrenPools, adultPools";
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
        type = "ResortHotel";
    }
    @Override
    public String getLocation() {
        return complexName;
    }
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCsv() {
        return super.toCsv() + "," + complexName + "," + restaurantQuantity + "," + childrenPools + "," + adultPools;
    }
}

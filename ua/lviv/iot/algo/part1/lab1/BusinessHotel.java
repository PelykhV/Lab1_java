package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class BusinessHotel extends Hotel{
    private int offices;
    private String companyOwner;

    public BusinessHotel(String name, int totalRooms, int availableRooms, double rating, int officeQuantity,
                         String companyOwner){
        super(name,totalRooms,availableRooms,rating);
        this.offices=officeQuantity;
        this.companyOwner=companyOwner;
    }
    @Override
    public String getLocation() {
        return companyOwner;
    }
}

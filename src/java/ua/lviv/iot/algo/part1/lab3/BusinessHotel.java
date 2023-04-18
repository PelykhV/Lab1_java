package ua.lviv.iot.algo.part1;

import lombok.ToString;

@ToString
public class BusinessHotel extends Hotel{
    public static final String HEADERS = "offices, companyOwner";
    private int offices;
    private String companyOwner;

    public BusinessHotel(String name, int totalRooms, int availableRooms, double rating, int officeQuantity,
                         String companyOwner){
        super(name,totalRooms,availableRooms,rating);
        this.offices=officeQuantity;
        this.companyOwner=companyOwner;
        type = "BusinessHotel";
    }
    @Override
    public String getLocation() {
        return companyOwner;
    }
    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCsv() {
        return super.toCsv() + "," + offices + "," + companyOwner;
    }
}

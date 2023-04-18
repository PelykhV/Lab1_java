package ua.lviv.iot.algo.part1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class HotelWriter {
    public static File file = new File("src\\hotel.scv");
    public PrintWriter printWriter;
    public void writeToFile(List<Hotel> hotels) throws IOException {
        if(hotels == null || hotels.isEmpty()) {
            return;
        }
        printWriter = new PrintWriter(file);
        Collections.sort(hotels, new ComparatorType());
        String previousType = "";
        for(Hotel hotel : hotels) {
            if (!previousType.equals(hotel.getType())) {
                previousType = hotel.getType();
                printWriter.println(hotel.getHeaders());
            }
            printWriter.println(hotel.toCsv());
        }
        printWriter.close();
    }
}
class ComparatorType implements Comparator<Hotel> {

    @Override
    public int compare(Hotel firstHotel, Hotel secondHotel) {
        return firstHotel.getType().compareTo(secondHotel.getType());
    }
}




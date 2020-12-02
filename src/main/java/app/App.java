package app;

import dto.Trip;
import enums.Whiter;

public class App {

    public static void main(String [] args){
        Trip trip = new Trip(Whiter.ILHEUS);
        trip.setWhiter(Whiter.NATAL);
        System.out.println(trip.getWhiter().getCity());
    }


}

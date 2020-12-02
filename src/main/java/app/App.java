package app;

import dto.Companion;
import dto.Trip;
import enums.Whiter;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String [] args){
        Trip trip = new Trip(Whiter.ILHEUS);
        trip.setWhiter(Whiter.NATAL);

        Companion companion1 = new Companion();
        companion1.setName("Fernanda");
        companion1.setConfirmation(true);
        Companion companion2 = new Companion();
        companion2.setName("Aline");
        companion2.setConfirmation(false);

        List<Companion> companion = new ArrayList<Companion>();
        companion.add(companion1);
        companion.add(companion2);
        trip.setCompanion(companion);

        System.out.println("This trip is to: "+ trip.getWhiter().getCity());
        System.out.println("The number of companions is: "+ trip.getCompanion().size());
        System.out.println("The name of the companion number 1 is " + trip.getCompanion().get(0).getName());
        System.out.println("The name of the companion number 2 is " + trip.getCompanion().get(1).getName());

    }


}

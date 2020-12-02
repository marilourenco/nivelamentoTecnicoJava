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
        // simple for
        for (int i = 0; i < trip.getCompanion().size(); i++) {
            System.out.println("The companion name is: " + trip.getCompanion().get(i).getName() + " and the confirmation of registration is: "  + trip.getCompanion().get(i).isConfirmation());

        }
        // robust for
        for (Companion companion3 : trip.getCompanion()) {
            System.out.println("The companion name is: " + companion3.getName() + " and the confirmation of registration is: "  + companion3.isConfirmation());

        }
    }


}

package app;

import dto.Companion;
import dto.InternationalTrip;
import dto.NationalTrip;
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
        try{
        trip.setCompanion(companion);
        }catch (Exception exception){
            System.out.println("Something happened");
            System.out.println(exception.getMessage());
        }

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

        NationalTrip nationalTrip = new NationalTrip(Whiter.NATAL);

        try {
            nationalTrip.setCompanion(companion);
        }catch (Exception exception){
            System.out.println("Something happened");
            System.out.println(exception.getMessage());
        }

        nationalTrip.setCpf("00000012458");
        System.out.println(nationalTrip.getWhiter().getCity());
        System.out.println(nationalTrip.getCpf());

        InternationalTrip internationalTrip = new InternationalTrip(Whiter.MIAMI);

        try{
        internationalTrip.setCompanion(companion);
        }catch (Exception exception){
            System.out.println("Something happened");
            System.out.println(exception.getMessage());
        }
        internationalTrip.setPassport("00000012458848465");
        System.out.println(internationalTrip.getWhiter().getCity());
        System.out.println(internationalTrip.getPassport());
        System.out.println(nationalTrip.calculateReturnDaysForecast());
        System.out.println(internationalTrip.calculateReturnDaysForecast());
    }


}

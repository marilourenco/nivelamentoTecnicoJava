package dto;

import enums.Whiter;
import util.Utils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class InternationalTrip extends Trip{

    private String passport;
    public InternationalTrip(Whiter whiter) {
        super(whiter);
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    @Override
    public void setCompanion(List<Companion> companion) throws Exception {
        int companionLimit = Integer.parseInt(Utils.getPropertiesLimit("international.trip.companion.limit"));
        if (companion.size() <= companionLimit) {
            super.setCompanion(companion);
        } else {
            throw new Exception("International trips cannot have more than " + companionLimit + " companion.");
        }
    }
}

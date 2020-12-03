package dto;

import enums.Whiter;
import interfaces.ForecastCalculator;
import util.Utils;
import java.util.List;


public class InternationalTrip extends Trip implements ForecastCalculator {

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

    public int calculateReturnDaysForecast() {
        if(this.getWhiter().equals(Whiter.MIAMI)){
            return 1;
        }
        return 0;
    }
}

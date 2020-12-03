package dto;

import enums.Whiter;

import java.util.List;

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
        if (companion.size() <= 1) {
            super.setCompanion(companion);
        } else {
            throw new Exception("International trips cannot have more than 1 companion");
        }
    }
}

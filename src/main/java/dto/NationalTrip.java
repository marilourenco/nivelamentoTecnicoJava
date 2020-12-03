package dto;

import enums.Whiter;
import interfaces.ForecastCalculator;
import util.Utils;
import java.util.List;


public class NationalTrip extends Trip implements ForecastCalculator {

    private String cpf;

    public NationalTrip(Whiter whiter) {
        super(whiter);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public void setCompanion(List<Companion> companion) throws Exception {
        int companionLimit = Integer.parseInt(Utils.getPropertiesLimit("national.trip.companion.limit"));
        if (companion.size() <= companionLimit) {
            super.setCompanion(companion);
        } else {
            throw new Exception("National trips cannot have more than: " + companionLimit + " companion.");
        }
    }

    public int calculateReturnDaysForecast() {
        int quantityDays = 0;
        switch (this.getWhiter()){
            case ILHEUS: quantityDays = 4; break;
            case NATAL: quantityDays = 3; break;
            case OLINDA: quantityDays = 2; break;
            case RECIFE: quantityDays = 1; break;
            case SALVADOR: quantityDays = 0; break;
        }
        return quantityDays;

    }
}

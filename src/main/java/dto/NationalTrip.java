package dto;

import enums.Whiter;
import util.Utils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class NationalTrip extends Trip{

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
}

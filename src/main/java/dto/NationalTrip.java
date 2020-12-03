package dto;

import enums.Whiter;

import java.util.List;

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
        if (companion.size() <= 4) {
            super.setCompanion(companion);
        } else {
            throw new Exception("National trips cannot have more than 4 companion");
        }
    }
}

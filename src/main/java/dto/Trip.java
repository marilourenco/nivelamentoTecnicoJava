package dto;

import enums.Whiter;

import java.util.List;

public class Trip {
    private Whiter whiter;
    private List<Companion> companion;

    public Trip(Whiter whiter){
        this.whiter = whiter;
    }

    public Whiter getWhiter() {
        return whiter;
    }

    public void setWhiter(Whiter whiter) {
        this.whiter = whiter;
    }

    public List<Companion> getCompanion() {
        return companion;
    }

    public void setCompanion(List<Companion> companion) throws Exception {
        this.companion = companion;
    }
}

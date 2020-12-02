package dto;

import enums.Whiter;

public class Trip {
    private Whiter whiter;

    public Trip(Whiter whiter){
        this.whiter = whiter;
    }

    public Whiter getWhiter() {
        return whiter;
    }

    public void setWhiter(Whiter whiter) {
        this.whiter = whiter;
    }
}

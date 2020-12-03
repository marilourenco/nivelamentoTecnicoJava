package enums;

public enum Whiter {

    RECIFE("Recife"),
    OLINDA("Olinda"),
    SALVADOR("Salvador"),
    NATAL("Natal"),
    ILHEUS("Ilheus"),
    MIAMI("Miami");


    public String city;

    Whiter(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
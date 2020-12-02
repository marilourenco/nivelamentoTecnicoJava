package enums;

public enum Destinos {

    RECIFE("Recife"), OLINDA("Olinda"), SALVADOR("Salvador"), NATAL("Natal"), ILHEUS("Ilheus");
    public String cidade;

    Destinos(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

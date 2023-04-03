class Clen {
    private String ime;
    private int vrednost;

    public Clen(String ime, int vrednost) {
        this.ime = ime;
        this.vrednost = vrednost;
    }

    public int getVrednost() {
        return vrednost;
    }

    public String opis() {
        return ime + ": " + vrednost;
    }
}
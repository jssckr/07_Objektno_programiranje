class Predmet {
    private String okrajsava;
    private String ime;
    private String opis;

    public Predmet(String okrajsava, String ime) {
        this(okrajsava, ime, null);
    }

    public Predmet(String okrajsava, String ime, String opis) {
        this.okrajsava = okrajsava;
        this.ime = ime;
        this.opis = opis;
    }

    public String vrniOkrajsavo() {
        return okrajsava;
    }

    public String vrniIme() {
        return ime;
    }

    public String vrniOpis() {
        return opis;
    }
}
class Urnik {
    private Predmet[] predmeti;
    private int predmetStevec = 0;

    public Urnik(int steviloPredmetov) {
        predmeti = new Predmet[steviloPredmetov];
    }

    public Urnik(Predmet[] predmeti) {
        this.predmeti = predmeti;
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti[predmetStevec++] = predmet;
    }

    public void odstraniPredmet(Predmet predmet) {

    }

    public Predmet pridobi(String okrajsava) {

    }

    public Predmet[] zbirkaPredmetov() {

    }

    public void dodajUro(int dan, Ura ura) {

    }

    public void odstraniUro(int dan, String ura) {

    }

    public Ura[] zbirkaUr(int dan) {

    }

    public void izpisiVse() {

    }
}
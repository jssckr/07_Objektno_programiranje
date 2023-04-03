class Ura {
    private String cas;
    private Predmet predmet;

    public Ura(String cas, Predmet predmet) {
        this.cas = cas;
        this.predmet = predmet;
    }

    public String vrniCas() {
        return cas;
    }

    public Predmet vrniPredmet() {
        return predmet;
    }
}
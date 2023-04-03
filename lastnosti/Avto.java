class Avto {
    private String znamka;
    // public String znamka;

    public String getZnamka() {
        return znamka;
    }

    public void setZnamka(String znamka) {
        this.znamka = znamka;
        this.znamka += "_abc";
    }

    public Avto(String znamka) {
        setZnamka(znamka);
    }
}

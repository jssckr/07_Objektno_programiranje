// Dedovanje
class SportniAvto extends Avto {
    private double moc;

    // ...
    public SportniAvto(String znamka) {
        super(znamka);
        getZnamka();
    }

    public String getZnamka() {
        return super.getZnamka().substring(0, 2);
    }
}

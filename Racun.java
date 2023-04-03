class Racun {
    private Clen clen1;
    private Clen clen2;

    public Racun(Clen clen1, Clen clen2) {
        this.clen1 = clen1;
        this.clen2 = clen2;
    }

    Clen sestej() {
        return Operacija.sestej(clen1, clen2);
    }

    Clen odstej() {
        return Operacija.odstej(clen1, clen2);
    }

    Clen mnozi() {
        return Operacija.mnozi(clen1, clen2);
    }

    Clen deli() {
        return Operacija.deli(clen1, clen2);
    }
}

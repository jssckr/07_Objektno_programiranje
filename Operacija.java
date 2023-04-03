class Operacija {
    private static final String clenIme = "rez";

    public static Clen sestej(Clen clen1, Clen clen2) {
        return new Clen(
            clenIme,
            clen1.getVrednost() + clen2.getVrednost()
        );
    }

    public static Clen odstej(Clen clen1, Clen clen2) {
        return new Clen(
            clenIme,
            clen1.getVrednost() - clen2.getVrednost()
        );
    }

    public static Clen mnozi(Clen clen1, Clen clen2) {
        return new Clen(
            clenIme,
            clen1.getVrednost() * clen2.getVrednost()
        );
    }

    public static Clen deli(Clen clen1, Clen clen2) {
        return new Clen(
            clenIme,
            clen1.getVrednost() / clen2.getVrednost()
        );
    }
}
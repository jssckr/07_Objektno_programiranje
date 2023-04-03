class Podkategorija : Kategorija {
    Kategorija nadkategorija;

    String nazivNadkategorije() {
        return nadkategorija.nazivKategorije();
    }
}
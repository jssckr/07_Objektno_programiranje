// razred - paketno-zasebno stopnja dostopa
class Kategorija {
    String naziv;

    // relacija združevanja
    Kategorija[] podkategorije;

    Kategorija(String vhodNaziv, Kategorija[] vhodPodkategorije) {
        naziv = vhodNaziv;
        podkategorije = vhodPodkategorije;
    }

    String nazivKategorije() {
        return naziv;
    }

    // relacija odvisnosti
    void podkategorije() {
        for (Kategorija kategorija : podkategorije) {
            System.out.println(kategorija.nazivKategorije());
        }
    }
}
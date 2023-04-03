// razred - class
class Svetilka {
    // polje
    String podjetje;
    // String predpona;

    // metoda - void
    void vklopi() {
        // -- return "asd"; --
    }

    String imePodjetja() {
        return podjetje;
        // return "firma";
    }

    // konstruktor
    Svetilka(String imePodjetja) {
        // imePodjetja = "firma"
        podjetje = imePodjetja;
        // podjetje = "firma"
    }

    String getPodjetje() {
        return podjetje;
    }

    // podjetje = "Company"
    // taCompany
    String predponaPodjetje(String predpona) {
        return predpona + podjetje;
    }
}

class SvetilkaDve {
    // ...
}
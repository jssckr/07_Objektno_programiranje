import java.util.Objects;

class Svetilka {
    // stanje:
    String podjetje; // polje, lastnost
                     // field, property
    String model = "zacetna vrednost"; // null
    int svetilnostProcent; // 0
    boolean sveti = true; // false

    String podjetjeModel;

    // inicializacijski blok
    {
        model = "Privzeti model";
    }

    // vedenje:
    Svetilka(String vhodPodjetje, String vhodModel) {
        // vhodPodjetje = String("Company")
        //vhodPodjetje = (vhodPodjetje == null) ? "" : vhodPodjetje;
        //vhodModel = (vhodModel == null) ? "" : vhodModel;

        vhodPodjetje = Objects.requireNonNullElse(vhodPodjetje, "Podjetje");
        vhodModel = Objects.requireNonNullElse(vhodModel, "Model");

        //vhodPodjetje = Objects.requireNonNull(vhodPodjetje, "Podjetje je zahtevano!");
        //vhodModel = Objects.requireNonNull(vhodModel, "Model je zahtevan!");

        // Objects.requireNonNullElse
        // Objects.requireNonNull

        // Svetilka sv = new Svetilka(...);
        // sv.prevzemiPodjetje(...);

        podjetje = vhodPodjetje;
        model = vhodModel;

        // null.concat
        // String.concat()
        podjetjeModel = vhodPodjetje.concat(" ").concat(vhodModel);
        // " Model"
    }

    void vklop() {
        sveti = true;
        System.out.println("Svetilka je vklopljena!");
    }

    void izklop() {
        sveti = false;
    }

    boolean aliSveti() {
        return sveti;
    }

    int svetilnost() {
        return svetilnostProcent;
    }

    String imePodjetja() {
        return podjetje;
    }

    String imeModela() {
        return model;
    }

    String naziv() {
        return podjetjeModel;
    }

    void prevzemiPodjetje(Svetilka svetilka) {
        podjetje = svetilka.imePodjetja(); // metoda z dostopom
        
        // svetilka.izklop(); // metoda s spremembo - nepovezana
    }
}

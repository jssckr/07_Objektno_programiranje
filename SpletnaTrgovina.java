class SpletnaTrgovina {
    Kategorija[] seznamKategorij;
    Izdelek[] seznamIzdelkov;

    SpletnaTrgovina() {
        /*Kategorija tv = new Kategorija("Televizorji", null);
        Kategorija avdioVideo = new Kategorija(
            "Avdio-video",
            new Kategorija[] { tv, new Kategorija("Gramofoni", null) }
        );
        Kategorija belaTehnika = new Kategorija(
            "Bela tehnika", null
        );
        Izdelek televizor = new Izdelek("Televizor", 1500, tv);
        seznamKategorij = new Kategorija[] {
            avdioVideo,
            belaTehnika
        };
        seznamIzdelkov = new Izdelek[] {
            televizor,
            new Izdelek("Pomivalni stroj", 123, belaTehnika)
        };
        televizor.opis(); // klic metode brez parametrov
        televizor.opis("Artikel: "); // klic preobložene metode z enim parametrom
        avdioVideo.podkategorije();

        // Relacije:
        // - Odvisnost: A uporablja B
        //      Izdelek uporablja Kategorija
        //   (ang. dependence)
        //   dependency - programske odvisnosti

        // - Združevanje: A ima B
        //       Kategorija ima Kategorija
        //   (ang. aggregation)

        // - Dedovanje: A je B
        //     Podkategorija je Kategorija
        //   (ang. inheritance)

        // -----------------

        // Preobložitev (ang. overloading)
        // - preobloženi konstruktor
        // - preobložena metoda
*/
        Izdelek projektor = new Izdelek("Projektor", 1234.56, 10);
        projektor.setCena(1234.0);
        // 
    }

    public static void main(String[] args) {
        // SpletnaTrgovina trgovina = new SpletnaTrgovina();
        
        // Izdelek.opis();
        // Izdelek.cena
        System.out.println(
            "naslednjiId: " +
            Izdelek.naslednjiId
        );
        Izdelek.cena = 10;
        Izdelek pisalo = new Izdelek("Pisalo", 5, 10);
        pisalo.setCena(1234.0);
        System.out.println(pisalo.getCena());
        pisalo.setCena(123455.0);
        pisalo.opis();
        System.out.println(
            "Pisalo ID: " +
            pisalo.getId()
        );
        

        // pisalo.cena = 1234;

        System.out.println(
            "naslednjiId: " +
            Izdelek.naslednjiId++
        );
        Izdelek svincnik = new Izdelek("Svincnik", 2.0, 5);
        pisalo.setOpis("asdasd");
        // pisalo.opis = "asdasd";
        svincnik.setOpis("asdasdf");
        System.out.println(
            pisalo.istiOpis(svincnik)
        );
        System.out.println(
            "Svincnik ID: " +
            svincnik.getId()
        );
        // System.out.println(pisalo.naziv);
        // System.out.println(pisalo.valuta);
        // pisalo.cena = 1234;
        // System.out.println(pisalo.cena);
        System.out.println(
            "naslednjiId: " +
            Izdelek.naslednjiId
        );
    }
}
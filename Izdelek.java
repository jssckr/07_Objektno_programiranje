import java.util.Objects;

// razred - javna stopnja dostopa
class Izdelek {
    private int id;
    public String naziv;
    private Double cena; // 1500
    protected String valuta = "EUR"; // "€"
    Kategorija kategorija;
    double popustOdstotek;
    private String opis;

    public static int naslednjiId = 1;

    public Izdelek(String naziv, double cena, Kategorija kategorija) {
        // konstruktor - naziv, cena
        this(naziv, cena);

        // System.out.println("PRIVZETI KONSTRUKTOR");
        // televizor = 0x0
        // televizor.naziv = naziv;
        // this
        // this.naziv = naziv + " asdasd"; // 0x1 = 0x1;
        // this.cena = cena;

        
        this.kategorija = kategorija;
    }

    public Izdelek(String vhodNaziv, double vhodCena, double vhodPopustOdstotek) {
        this(vhodNaziv, vhodCena);
        popustOdstotek = vhodPopustOdstotek;
    }

    // preobloženi konstruktor (ang. overloaded constructor)
    private Izdelek(String naziv, double cena) {
        // System.out.println("PREOBLOZENI KONSTRUKTOR");
        id = naslednjiId++;
        Objects.requireNonNull(naziv, "Naziv ne sme biti prazen!");
        this.naziv = naziv + " asdasd";
        setCena(cena);

        // DRY - Don't Repeat Yourself
    }

    void vKosarico(double popustOdstotek) {
        double koncnaCena = cena - (cena * popustOdstotek/100);
        // ...

    }

    public void opis() {
        // televizor = 0x0
        // televizor.opis("Izdelek: ");
        opis("Izdelek: ");
        System.out.println("konec izpisa");
    }

    // preobložena metoda (ang. overloaded method)
    protected void opis(String poimenovanje) {
        // ekspliciten parameter
        // Izdelek: Televizor, 1500.0 EUR, Televizorji
        System.out.println(
            poimenovanje +
            naziv + ", " +
            cena + " " + valuta + (
                kategorija == null
                    ? ""
                    : ", " +
                        kategorija.nazivKategorije()
            )
        );
    }

    // pridobivalec - getter
    // get
    public String getOpis() {
        return opis;
    }

    public String getNaziv() {
        return naziv;
    }

    // pridobivalec - getter
    public Double getCena() {
        return cena * Math.PI;
    }

    public int getId() {
        return id;
    }

    // nastavljalec - setter
    public void setCena(Double cena) {
        if (cena != null && cena >= 50 && cena <= 100) {
            this.cena = cena;
        } else {
            // ...
        }
    }

    // nastavljalec - setter
    public void setOpis(String opis) {
        Objects.requireNonNull(opis);
        this.opis = opis;
    }

    public boolean istiOpis(Izdelek izdelek) {
        return opis.equals(izdelek.opis);
    }

    // Pridobivalci - getters
    // Nastavljalci - setters

    // pridobivalec - getter
    // nastavljalec - setter
}
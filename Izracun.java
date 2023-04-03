class Izracun {
    public static void main(String[] args) {
        Clen clen1 = new Clen("x", 1);
        Clen clen2 = new Clen("y", 2);

        Racun racun1 = new Racun(clen1, clen2);
        System.out.println(racun1.sestej().opis());
        System.out.println(racun1.mnozi().opis());

        System.out.println(
            Operacija.odstej(clen2, clen1).opis()
        );
        Clen rezDeli = Operacija.deli(clen2, clen1);
        System.out.println(
            rezDeli.opis()
        );
        System.out.println(
            Operacija.deli(clen2, clen1).opis()
        );
    }
}
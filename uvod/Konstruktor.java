class Konstruktor {
    public static void main(String[] args) {
        final var spremenljivka = "testna vrednost";

        String podjetje = null;
        String model = new String("Model");
        Svetilka sv = new Svetilka(podjetje, model);
        Svetilka sv1 = new Svetilka("Firma", "Model");
        
        System.out.println(sv.naziv());

        Logika l = new Logika();
        Dodajanje d = new Dodajanje();
        
        /*System.out.println(sv1.aliSveti());

        System.out.println(sv.imePodjetja());
        // metoda s spremembo / spremenljiv objekt
        sv.prevzemiPodjetje(sv1);
        System.out.println(sv.imePodjetja());


        // metoda z dostopom / nespremenljiv objekt
        System.out.println(sv1.aliSveti());

        // stranski ucinek (ang. side effect)
        */
    }
}
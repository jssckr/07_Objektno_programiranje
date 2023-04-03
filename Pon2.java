class Pon2 {
    private static final double PI = 3.14;
    private static double E;

    static {
        E = 2.71;
    }

    public static void main(String[] args) {
        // PI = 4.12;
        System.out.println(PI);
        System.out.println(E);

        System.out.println("---------------");
        System.out.println(Math.PI);
        System.out.println(Math.E);

        Izdelek i1 = new Izdelek("izdelek 1", 1.0, null);
        System.out.println(i1.getNaziv());
        Math.pow(2, 3);
        // Math math = new Math();

        novaMetoda();
    }

    private static void novaMetoda() {
        System.out.println("izpis iz nove metode");
    }
}

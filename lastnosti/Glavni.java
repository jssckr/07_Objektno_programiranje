class Glavni {
    public static void main(String[] args) {
        Avto avto = new Avto("Company");
        // System.out.println(avto.znamka);
        System.out.println(avto.getZnamka());
        avto.setZnamka("Company2");
        // avto.znamka = "Company2";
        // System.out.println(avto.znamka);
        System.out.println(avto.getZnamka());

        SportniAvto sportniAvto = new SportniAvto("Company3");
        System.out.println(sportniAvto.getZnamka());
    }
}

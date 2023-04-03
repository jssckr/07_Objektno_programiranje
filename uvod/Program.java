class Program {
    public static void main(String[] args) {
        /*
        // enoznacnost
        Svetilka sv = new Svetilka("Podjetje", "Model");
        Svetilka sv2 = new Svetilka("podjetje2", "model2");
        sv2.vklop();
        // sv.vklop(); // sv.sveti == true
        boolean sveti = sv.aliSveti(); // true

        if (sveti) {
            System.out.println(
                "Svetilka sveti."
            );
        } else {
            System.out.println(
                "Svetilka ne sveti."
            );
        }
        
        // ...
        String niz = new String(); // ""
        System.out.println(niz); // 
        String niz2 = new String("vrednost"); // "vrednost"
        System.out.println(niz2); // vrednost
        */
        
        Svetilka svet = new Svetilka("Firma", "ABC");
        // --Svetilka()--
        svet.vklop();
        System.out.println(svet.imePodjetja());
        System.out.println(svet.imeModela());
        System.out.println("-----------");

        Svetilka svet2 = new Svetilka("Company", null);        
        System.out.println(svet2.imePodjetja());
        System.out.println(svet2.imeModela());

        String niz1 = new String();
        String niz2 = new String("vrednost");
        String niz3 = new String(new char[]{'p', 'a', 'r', 'a', 'm'});

        StringBuffer sb = new StringBuffer("a");
        sb.append("b");
    }
}

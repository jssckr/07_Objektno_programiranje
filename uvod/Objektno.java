import java.util.Scanner;

class Objektno {
    public static void main(String[] args) {
        int stevilo = 5;
        String niz = "vrednost";
        String[] nizi = new String[5];

        // class - razred
        // object - objekt
        // instanco razreda = objekt
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.nextInt();
        // Scanner.nextLine()


        Svetilka sv = new Svetilka();
        sv.vklop();
        sv.izklop();

        Svetika sv2 = new Svetilka();
        Piskot piskot1 = new Piskot();
        Piskot piskot2 = new Piskot();

        System.out.println("izpisi");

        StringBuffer sb = new StringBuffer();
        sb.append("pa");
        sb.append("ram");
        // param

        StringPomnilnik sp = new StringPomnilnik();
        sp.append("pa");
        sp.vrednost(); // pa
        sp.append("ram");
        sp.vrednost(); // param
    }
}
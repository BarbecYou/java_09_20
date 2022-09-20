package hu.petrik.java_09_20;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Ember human1 = new Ember("Jancsi", "2003-01-01", "Budapest");
        Ember human2 = new Ember("Karcsi", "2006-08-12", "Debrecen");
        Ember human3 = new Ember("Péter", "2004-12-24", "Pécs");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println(human1.getSzulEvszam());
        System.out.println(human1.getSzulHonap());
        System.out.println(human1.getSzulNap());
        System.out.println(human1.getEletkor());
    }

}

package hu.petrik.java_09_20;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Ember human1 = new Ember("Jancsi", "2003-01-01", "Budapest");
        Ember human2 = new Ember("Karcsi", "2006-08-12", "Debrecen");
        Ember human3 = new Ember("Péter", "2002-12-24", "Pécs");
        Ember human4 = new Ember("Jóska", "2001-12-24", "Szeged");
        Ember human5 = new Ember("Nándor", "2000-12-24", "Nagykanizsa");

        Emberek emberek = new Emberek(new Ember[]{human1, human2, human3, human4, human5});
        System.out.println(emberek);

    }

}

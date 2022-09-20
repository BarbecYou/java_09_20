package hu.petrik.java_09_20;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Ember human1 = new Ember("Jancsi", "2003-12-01", "Budapest");
        Ember human2 = new Ember("Karcsi", "2006-08-12", "Debrecen");
        Ember human3 = new Ember("Péter", "2002-12-24", "Pécs");
        Ember human4 = new Ember("Jóska", "2001-12-24", "Szeged");
        Ember human5 = new Ember("Nándor", "2000-12-24", "Nagykanizsa");

        System.out.println(human1.getEletkor());

        Emberek emberek = new Emberek(new Ember[]{human1, human2, human3, human4, human5});
        System.out.println(emberek);

        String fajlNev = "emberek.txt";
        try {
            Emberek emberek2 = new Emberek(fajlNev);
        } catch (FileNotFoundException e){
            System.err.printf("file nem található: %s\n", fajlNev);
        } catch (IOException i){
            System.err.printf("Ismeretlen hiba történt a file beolvasása során");
        }
    }

}

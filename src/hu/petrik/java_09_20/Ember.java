package hu.petrik.java_09_20;

import java.time.LocalDate;
import java.util.Date;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzulEvszam(){
        return Integer.parseInt(this.szulDatum.substring(0, 4));

    }
    public int getSzulHonap(){
        return Integer.parseInt(this.szulDatum.split("-")[1]);
    }
    public int getSzulNap(){
        return Integer.parseInt(this.szulDatum.split("-")[2]);
    }

    public int getEletkor(){
        int eletkor = 0;
        if (this.getSzulHonap() > LocalDate.now().getMonthValue()){
            eletkor = LocalDate.now().getYear() - this.getSzulEvszam() - 1;
        }else {
            eletkor = LocalDate.now().getYear() - this.getSzulEvszam();
        }
        return eletkor;
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s %20s", this.nev, this.szulDatum, this.szulHely);
    }
}

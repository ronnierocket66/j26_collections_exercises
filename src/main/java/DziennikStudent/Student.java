package DziennikStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    private String imie, nazwisko, indeks;
   private List<Double> listOcen = new ArrayList<>();

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public Double[] getListaOcen() {
    }
}

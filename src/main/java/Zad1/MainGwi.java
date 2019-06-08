package Zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainGwi {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        System.out.println("Podaj ilosc wczytywanych liczb od uzytkowanika");
        int iloscObiegowPetliScannera = scanner.nextInt();
        System.out.println("Podaj ilosc wylosowanych liczb: ");
        int iloscObiegowPetliRandom = scanner.nextInt();

        //wczytanie liczby ze scannera
        while ((iloscObiegowPetliScannera--) > 0) {
            System.out.println("Podaj liczbe:");
            int liczbaZaladowana = scanner.nextInt();
            lista.add(liczbaZaladowana);
        }

        //wczytanie liczby ze generatora
        while ((iloscObiegowPetliRandom--) > 0) {
            int liczbaZaladowana = random.nextInt(1000);
            lista.add(liczbaZaladowana);
        }

        double suma = 0;
        for (Integer elementListy : lista) {
            suma += elementListy;
        }//sumowanie listy

//wypisuje  wynik
        System.out.println("suma: " + suma);
        System.out.println("Srednia: " + (suma / lista.size()));
    }
}

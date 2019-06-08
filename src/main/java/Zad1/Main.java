package Zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int liczbaZaladowana = scanner.nextInt();
            lista.add(liczbaZaladowana);
        }
        for (int i = 0; i < 5; i++) {
            int liczbaZaladowana = random.nextInt(1000);
            lista.add(liczbaZaladowana);
        }
//wypisanie listy
        System.out.println(lista);

        //sumowanie listy
        double suma = 0;
        for (Integer elementListy : lista) {
            suma += elementListy;
        }

//wypisuje  wynik
        System.out.println("suma: " + suma);
        System.out.println("");
    }
}
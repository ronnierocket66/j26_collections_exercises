package Zad2;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> listaA = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaA.add(new Random().nextInt(1000));
        }

        //kopiowanie elementow listy A do listy B
        List<Integer> listaB = new ArrayList<>(listaA);
        Collections.sort(listaB);
        // listaB.addAll(listaA);  // alternatywa dla kopiowania elementow

        if (listaB.size() % 2 == 0) {//parzysta
            int indeksLewySrodkowy = (listaB.size() / 2) - 1;
            int indeksPrawySrodkowy = (listaB.size() / 2);
            double mediana = (listaB.get(indeksLewySrodkowy) + listaB.get(indeksPrawySrodkowy)) / 2.0;
            System.out.println("MEdiana: " + mediana);
        } else {//
            int indeksSrodkowy = (listaB.size() / 2);
            int mediana = listaB.get(indeksSrodkowy);

            System.out.println("Mediana: " + mediana);
        }


        int min = listaA.get(0);
        int max = listaA.get(0);

        for (Integer elementListy : listaA) {
            if (min > elementListy) {
                min = elementListy;
            }
            if (max < elementListy) {
                max = elementListy;
            }

        }
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);
        // znajdowanie indeksu maksymalnego elementu i minimalnego elementu

        int indexMax = 0;
        int indexMin = 0;
        int index = 0;
        for (int i = 0; i <listaA.size(); i++) {
            if (max== listaA.get(i)) {
                indexMax = i;
            }
            if (min == listaA.get(i))
            {
                indexMin = i;
            }
        }
        System.out.println( "Index max: "+ indexMax);
        System.out.println( "Index min: "+ indexMin);

        // znjadowanie indeksow maksymalnego i minimalnego elemantu
        System.out.println("Indeks max (indexof):" + listaA.indexOf(max));
        System.out.println("Indeks min (indexof):" + listaA.indexOf(min));
    }
}
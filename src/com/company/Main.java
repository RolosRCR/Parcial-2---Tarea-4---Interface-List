package com.company;

import com.company.list.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nLISTA DE NÚMEROS");
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(479);

        lista.delete(2);
        System.out.println("El tamaño de la Array List de números es de: " + lista.getSize());
        Iterator<Integer> it = lista.getIterator();
        System.out.println("Iterator");
        while (it.hasNext()) {
            int element = it.next();
            System.out.println("Dato: " + element);
        }

        System.out.println("\nReverse Iterator");
        it = lista.getReverseIterator();
        while (it.hasNext()) {
            int element = it.next();//regresa el dato y avanza el iterador

            System.out.println("Dato: " + element);
        }

        System.out.println("\nLISTA DE NOMBRES");
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Carlos");
        listOfNames.add("Karla ");
        listOfNames.add("Roberto ");
        listOfNames.add("Sebastian");

        System.out.println("El tamaño de la Array List de palabras es: " + listOfNames.getSize());

        Iterator<String> itStrings = listOfNames.getIterator();
        while (itStrings.hasNext()) {
            System.out.println(itStrings.next());
        }

    }
}

package com.company;

import com.company.list.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        lista.delete(2);
        System.out.println("El tamaño de la lista de numeros es de:" + lista.getSize());
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

        System.out.println("\nLista de nombres");
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Carlos");
        listOfNames.add("Karla ");
        listOfNames.add("Roberto ");
        listOfNames.add("Sebastian");

        System.out.println("El tamaño de la lista de palabras es: " + listOfNames.getSize());

        Iterator<String> itStrings = listOfNames.getIterator();
        while (itStrings.hasNext()) {
            System.out.println(itStrings.next());
        }



        System.out.printf("\n\n\n\n\nFUNCIONAMIENTO CON ARRAYLIST\n");
        List<Float> lista2 = new ArrayList<>();
        lista2.add(4.2f);
        lista2.add(4.5f);
        lista2.add(5.2f);
        lista2.add(7.8f);
        lista2.add(11.2f);
        System.out.printf("El tamaño de la ArrayList es de: "+lista2.getSize()+"\n");
        Iterator<Float> it2= lista2.getIterator();
        while (it2.hasNext()) {
            float element = it2.next();
            System.out.println("Dato: " + element);
        }


    }
}

package com.mycompany.mavenproject1;

public class Main {

    public static void main(String[] args) {

        Nodo<Integer> tree = new Nodo();

        tree.setDato(45);

        Nodo[] arrNodo = {
            new Nodo(23, null),
            new Nodo(11, null)
        };

        tree.setHijo(arrNodo);

        tree.getHijo()[0].setHijo(0, 50);
        tree.getHijo()[0].setHijo(1, 99);

        tree.getHijo()[1].setHijo(0, 40);
        tree.getHijo()[1].setHijo(1, 33);

        System.out.println("PREORDEN");
        tree.preOrden();

        System.out.println("\n");

        System.out.println("POSTORDEN");
        tree.postOrden();

        System.out.println("\n");

        System.out.println("INORDEN");
        tree.inOrden();
    }
}
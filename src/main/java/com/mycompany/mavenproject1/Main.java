
package com.mycompany.mavenproject1;


public class Main {

    public static void main(String[] args) {
        Nodo <Integer> tree= new Nodo ();
        tree.setDato(45);
        
        //tree.setHijo(new Nodo[] {new Nodo(23,null), new Nodo(11, null)});
        Nodo[]arrNodo={new Nodo(23,null),new Nodo(11,null)};
        tree.setHijo(arrNodo);
        tree.getHijo()[0].setHijo (0,50);
        tree.getHijo()[1].setHijo (0,40); 
        tree.preOrden();
    }
}

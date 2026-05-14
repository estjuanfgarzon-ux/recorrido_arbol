
package com.mycompany.mavenproject1;

public class Nodo < T > {
    private T dato;
    private Nodo[] hijo;

    public Nodo(T dato, Nodo[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }

    Nodo() {

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo[] getHijo() {
        return hijo;
    }

    public void setHijo(Nodo[] hijo) {
        this.hijo = hijo;
    }
    public void setHijo(int pos, T dato) {
        if (hijo == null || pos >= hijo.length) { //el arreglo todavía no existe (hijo == null), agregando o la posición que queremos usar no cabe en el arreglo.
            //ejemplo tamaño = 1, posición que quiero usar = 1,Entonces:1 >= 1 → true agrandamos arreglo
            Nodo[] nuevo = new Nodo[pos + 1]; //Crea un nuevo arreglo más grande.pos + 1 porque los arreglos empiezan en 0.
            //ejemplo: si hago setHijo(0,50); entocnes queda pos 0 y el crea new Nodo[1]
            if (hijo != null) { //verifico que ya exixsita un arreglo osea el viejo 
                for (int i = 0; i < hijo.length; i++) {
                    //     recorro el arreglo viejo                

                    nuevo[i] = hijo[i]; // aca copio cada hijo del anterior arreglo en el nuevo
                }
            }

            hijo = nuevo; //el arreglo original AHORA apunta al grande 

        }
        hijo[pos] = new Nodo(dato, null); //creo el nodo y lo guardo 
    }
    public void preOrden() {

        System.out.print(this.dato);

        if (hijo != null) {

            for (Nodo n: hijo) {

                if (n != null) {
                    System.out.print(" , ");
                    n.preOrden();
                }
            }
        }
    }
}
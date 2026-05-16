
package com.mycompany.mavenproject1;

public class Nodo<T> {

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

        if (hijo == null || pos >= hijo.length) {

            Nodo[] nuevo = new Nodo[pos + 1];

            if (hijo != null) {

                for (int i = 0; i < hijo.length; i++) {

                    nuevo[i] = hijo[i];
                }
            }

            hijo = nuevo;
        }

        hijo[pos] = new Nodo(dato, null);
    }

    // ================= PREORDEN =================

    public void preOrden() {

        System.out.print(this.dato);

        if (hijo != null) {

            for (Nodo n : hijo) {

                if (n != null) {

                    System.out.print(" , ");
                    n.preOrden();
                }
            }
        }
    }

    // ================= POSTORDEN =================

    public void postOrden() {

        if (hijo != null) {

            for (Nodo n : hijo) {

                if (n != null) {

                    n.postOrden();
                }
            }
        }

        System.out.print(this.dato + " , ");
    }

    // ================= INORDEN =================

    public void inOrden() {

        // primer hijo
        if (hijo != null && hijo.length > 0 && hijo[0] != null) {

            hijo[0].inOrden();
        }

        // raiz
        System.out.print(this.dato + " , ");

        // restantes hijos
        if (hijo != null) {

            for (int i = 1; i < hijo.length; i++) {

                if (hijo[i] != null) {

                    hijo[i].inOrden();
                }
            }
        }
    }
}

package com.mycompany.mavenproject1;

public class Nodo <T>{
  private T dato;   
 private Nodo [] hijo;

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
    public void setHijo(int pos, T dato){
         if (hijo == null) {// el arreglo de hijos aun no existe?

        hijo = new Nodo[pos + 1];//si no existe crea el arreglo
        //ejemplo: si hago setHijo(0,50); entocnes queda pos 0 y el crea new Nodo[1]
    }

    hijo[pos] = new Nodo(dato, null);//creo el nodo y lo guardo 
    }
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
}

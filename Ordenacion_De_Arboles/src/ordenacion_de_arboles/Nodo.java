/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion_de_arboles;

/**
 *
 * @author Neider Puentes
 */
public class Nodo {

    private int dato;
    private Nodo izq, der;

    /**
     * Dato nodo recibe como parametos
     *
     * @param dato de tipo entero
     * @param izq de tipo nodo
     * @param der de tipo nodo
     */
    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    /**
     * metodo get dato
     *
     * @return retorna el dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * Metodo set dato recibe como parametro el dato
     *
     * @param dato
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * Metodo get izqu
     *
     * @return izq
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     * Metodo set izq
     *
     * @param izq recibe como parametro izq
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    /**
     * metodo getder
     *
     * @return der
     */
    public Nodo getDer() {
        return der;
    }

    /**
     * Metodo setder
     *
     * @param der recibe como parametro der
     */
    public void setDer(Nodo der) {
        this.der = der;
    }
}

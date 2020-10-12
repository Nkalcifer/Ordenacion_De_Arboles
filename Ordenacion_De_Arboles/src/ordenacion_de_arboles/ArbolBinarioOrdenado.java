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
public class ArbolBinarioOrdenado {
    
    /**
     * Tipo de dato Nodo Atributos info, izquierda, derecha y Raiz
     */
    class Nodo {

        int info;
        Nodo izquierda, derecha;
    }

    Nodo raiz;

    /**
     * Método constructor Inicializacion de la raiz
     */
    public ArbolBinarioOrdenado() {
        raiz = null;
    }

    /**
     * Metodo insertar
     *
     * @param info recibe como parametro un entero llamado info
     */
    public void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izquierda = null;
        nuevo.derecha = null;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, recordar;
            recordar = raiz;
            while (recordar != null) {//regla de parada
                anterior = recordar;
                if (info < recordar.info) {
                    recordar = recordar.izquierda;
                } else {
                    recordar = recordar.derecha;
                }
            }
            if (info < anterior.info) {
                anterior.izquierda = nuevo;
            } else {
                anterior.derecha = nuevo;
            }
        }
    }

    /**
     * Método privado imprimer pre
     *
     * @param reco recibe como parametro un nodo
     */
    private void imprimirPre(Nodo reco) {
        if (reco != null) {
            System.out.print(reco.info + " ");
            imprimirPre(reco.izquierda); //Uso de recursion  
            imprimirPre(reco.derecha);//Uso de recursion
        }
    }

    /**
     * Metodo publico imprimir pre Uso de recursion del mismo metodo pero
     * privado
     */
    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    /**
     * Método privado imprimir entre
     *
     * @param reco recibe como parametro un nodo
     */
    private void imprimirEntre(Nodo reco) {
        if (reco != null) {
            imprimirEntre(reco.izquierda);//Uso de recursion
            System.out.print(reco.info + " ");
            imprimirEntre(reco.derecha); //Uso de recursion
        }
    }

    /**
     * Método publico imprimir entre Uso de recursion del mismo metodo pero
     * privado
     */
    public void imprimirEntre() {
        imprimirEntre(raiz);
        System.out.println();
    }

    /**
     * Metodo privado imprimir post
     *
     * @param reco recibe como parametro un nodo
     */
    private void imprimirPost(Nodo reco) {
        if (reco != null) {
            imprimirPost(reco.izquierda);
            imprimirPost(reco.derecha);
            System.out.print(reco.info + " ");
        }
    }

    /**
     * Método publico imprimir post Uso de recursion del mismo metodo pero
     * privado
     */
    public void imprimirPost() {
        imprimirPost(raiz);
        System.out.println();
    }
}

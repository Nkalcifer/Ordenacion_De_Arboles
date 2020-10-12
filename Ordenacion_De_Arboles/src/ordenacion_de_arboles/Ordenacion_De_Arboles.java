/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion_de_arboles;

import java.util.Scanner;

/**
 *
 * @author Neider Puentes
 */
public class Ordenacion_De_Arboles {

    static int valorN, cantidadN;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] ar) {
        Scanner leer = new Scanner(System.in);
        ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado();

        System.out.println("Ingrese la Cantidad de Nodos que Desea: ");
        cantidadN = leer.nextInt();
        while (cantidadN != 0) {
            System.out.println("Ingrese el Nodo: ");
            valorN = leer.nextInt();
            abo.insertar(valorN);
            cantidadN--;
        }

        System.out.println("Impresion preorden: ");
        abo.imprimirPre();
        System.out.println("Impresion entreorden: ");
        abo.imprimirEntre();
        System.out.println("Impresion postorden: ");
        abo.imprimirPost();
    }

}

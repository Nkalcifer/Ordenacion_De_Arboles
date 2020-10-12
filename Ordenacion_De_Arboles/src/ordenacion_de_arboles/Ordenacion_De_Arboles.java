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

    /**
     * @param args the command line arguments
     */ public static void main(String[] ar) {
         System.out.println("Ingrese Uno a uno los datos del arbol, Se ordenaran de raiz a izquiera y luego derecha");
        ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado();

        abo.insertar(100);
        abo.insertar(50);
        abo.insertar(25);
        abo.insertar(115);
        abo.insertar(75);
        abo.insertar(150);
        abo.insertar(110);

        System.out.println("Impresion preorden: ");
        abo.imprimirPre();
        System.out.println("Impresion entreorden: ");
        abo.imprimirEntre();
        System.out.println("Impresion postorden: ");
        abo.imprimirPost();
    }
    
}

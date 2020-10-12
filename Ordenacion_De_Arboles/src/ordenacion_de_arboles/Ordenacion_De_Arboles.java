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
     */
    public static void main(String[] arg) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner texto = new Scanner(System.in);
        System.out.println(" Insertando los siguientes valores Randomicamente : ");
        for (int i = 1; i <= 15; i++) {
            valor = (int) (Math.pow(2, 3) * Math.random() * 10); // Que significa esta linea de codigo
            System.out.print(valor + " ");
            abo.agregar(valor);
        }

        do {
            System.out.println(" ");
            System.out.println("1.- Cantidad de nodos del arbol");
            System.out.println("2.- Cantidad de nodos hoja");
            System.out.println("3.- Altura del arbol");
            System.out.println("4.- BALANCE");
            System.out.println("0.- Salir");
            var = texto.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Cantidad de nodos del árbol:" + abo.cantidad());
                    break;
                case 2:
                    System.out.println("Cantidad de nodos hoja:" + abo.cantidadNodosHoja());
                    break;
                case 3:
                    System.out.println("La altura del arbol es:" + abo.retornarAltura());
                    break;
                case 4:
                    abo.imprimirBalance();
                    break;
            }
        } while (var != 0);
        System.out.println("APLICACIÓN FINALIZADA");
    }
    
}

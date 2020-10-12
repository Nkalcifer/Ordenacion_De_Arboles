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
public class ArbolBinario {

    private Nodo raiz;
    int cantidad;
    int altura;

    public ArbolBinario() {
        this.raiz = null;
    }

    /**
     * Metodo agregar recibe como parametro el dato
     *
     * @param dato
     */
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz);
    }

    /**
     * Metodo insertar recibe como parametros un par de nodos, nuevo y pivote
     *
     * @param nuevo
     * @param pivote
     */
    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }

    /**
     * Metodo exite recibe como parametros info y retorna un boolean
     *
     * @param info
     * @return false or true
     */
    public boolean existe(int info) {
        Nodo reco = raiz;
        while (reco != null) {
            if (info == reco.getDato()) {
                return true;
            } else if (info > reco.getDato()) {
                reco = reco.getDer();
            } else {
                reco = reco.getIzq();
            }
        }
        return false;
    }

    /**
     * Metodo cantidad
     *
     * @return retorna la cantidad
     */
    public int cantidad() {
        cantidad = 0;
        cantidad(raiz);
        return cantidad;
    }

    /**
     * Metodo cantidad recibe como parametro un nodo y utiliza recursividad
     *
     * @param reco
     */
    private void cantidad(Nodo reco) {
        if (reco != null) {
            cantidad++;
            cantidad(reco.getIzq());
            cantidad(reco.getDer());
        }
    }

    /**
     * Metodo cantidad nodos hoja recibe como parametro un nodo y realiza
     * recursividad
     *
     * @param reco
     */
    private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.getIzq() == null && reco.getDer() == null) {
                cantidad++;
            }
            cantidadNodosHoja(reco.getIzq());
            cantidadNodosHoja(reco.getDer());
        }
    }

    /**
     * Metodo publico cantidadNodosHoja
     *
     * @return retorna un valor de cantidad
     */
    public int cantidadNodosHoja() {
        cantidad = 0;
        cantidadNodosHoja(raiz);
        return cantidad;
    }

    /**
     * Metodo retornar altura
     *
     * @return retorna la altura
     */
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    /**
     * Metodo privado retornarAltura recibe como parametro un nodo y un entero
     *
     * @param reco
     * @param nivel
     */
    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getDer(), nivel + 1);
        }
    }

    /**
     * Metodo que se encarga de obtener el menor valor del arbol binario
     */
    public void menorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getIzq() != null) {
                reco = reco.getIzq();
            }
            System.out.println("Menor valor del árbol:" + reco.getDato());
        }
    }

    /**
     * Metodo que se encarga de obtener el mayor valor del arbol binario
     */
    public void mayorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getDer() != null) {
                reco = reco.getDer();
            }
            System.out.println("Mayor valor del árbol:" + reco.getDato());
        }
    }

    int subizq = 0;
    int subder = 0;

    /**
     * Metodo que imprime el arbol balanceado o no
     */
    public void imprimirBalance() {
        subizq = 0;
        subder = 0;

        Balance(this.raiz, true, 0);
        System.out.println("Lado Izquierdo " + subizq + " Lado Derecho " + subder);
        if (subizq - subder == 0) {
            System.out.println("El balance es: 0 ");
        } else if (subizq - subder == -1) {
            System.out.println("El balance es -1, derecha");
        } else if (subizq - subder == 1) {
            System.out.println("El balance 1, izquierda");

        } else {
            System.out.println("No es balanceado.."
                    + "Porque es mas grande el lado "
                    + ((subizq > subder) ? "Izquierdo" : "Derecho"));
        }

    }

    /**
     * Metodo que realiza el balance del arbol recibe como parametro un nodo un
     * bololean y un entero
     *
     * @param reco
     * @param lado
     * @param i
     */
    public void Balance(Nodo reco, boolean lado, int i) {

        if (reco != null) {

            if (reco.getDer() == null && reco.getIzq() == null) {
                if (lado) {
                    subder = (i > subder) ? i : subder;
                } else {
                    subizq = (i > subizq) ? i : subizq;
                }
            }

            Balance(reco.getDer(), lado, i + 1);
            if (i == 0) {
                lado = false;
            }
            Balance(reco.getIzq(), lado, i + 1);
        }

    }

//altura arbol
    String[] niveles;

    /**
     * Toma la rama mas larga de un arbol y obtiene su altura
     *
     * @return retorna la altura del arbol
     */
    public int alturaArbol() {
        altura = 0;
        alturaArbol(raiz, 0);
        return altura;
    }

    /**
     * Metodo que calcula la altura del arbol y realiza recursividad, se le
     * asignan los parametros de pivote y nivel
     *
     * @param pivote
     * @param nivel
     */
    private void alturaArbol(Nodo pivote, int nivel) {
        if (pivote != null) {
            alturaArbol(pivote.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            alturaArbol(pivote.getDer(), nivel + 1);
        }
    }

    /**
     * Metodo que se encarga de imprimir los nodos que se encuentran en
     * determinado nivel
     */
    public void imprimirNivel() {
        niveles = new String[altura + 1];

        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i] + " En nivel: " + i);
        }
    }

    /**
     * Metodo encargado de realizar el algortimo para imprimir un nivel
     * determinado, recibe como parametros el vidotey y el nivel
     *
     * @param pivote
     * @param nivel2
     */
    public void imprimirNivel(Nodo pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.getDato() + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.getDer(), nivel2 + 1);
            imprimirNivel(pivote.getIzq(), nivel2 + 1);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosmadjacencia;

/**
 *
 * 
 * @author Daniel Brunno
 * https://gitlab.com/danielbrunno1/grafos
 */
public class GrafosMAdjacencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grafo grafo = new Grafo(5);        
        grafo.listaVazia(0);
        grafo.inserirAresta(0, 0, 1);
        grafo.inserirAresta(1, 0, 1);
        grafo.imprimir();
    }
    
}

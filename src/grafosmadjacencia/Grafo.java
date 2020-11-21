/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosmadjacencia;

/**
 *
 * @author danielbrunno
 */
public class Grafo {
    
    private int matriz[][];
    private int vertice;
    private ins posicaoAtual[];
    
    public Grafo (int vertice){
        this.matriz = new int[vertice][vertice];
        this.vertice = vertice;
        this.posicaoAtual = new int[vertice];
        
        for(int i = 0; i < this.vertice; i++){
            for(int j = 0; j < this.vertice; j++) this.matriz[i][j] = 0;
            this.posicaoAtual[i] = -1;
        }
    }
    
}

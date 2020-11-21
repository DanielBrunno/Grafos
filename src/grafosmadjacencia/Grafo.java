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
    private int posicaoAtual[];
    
    public Grafo (int vertice){
        this.matriz = new int[vertice][vertice];
        this.vertice = vertice;
        this.posicaoAtual = new int[vertice];
        
        for(int i = 0; i < this.vertice; i++){
            for(int j = 0; j < this.vertice; j++) this.matriz[i][j] = 0;
            this.posicaoAtual[i] = -1;
        }
    }
    
    //aqui começa o CRUD. :) 
    
    //INSERIR ARESTA
    public void inserirAresta(int v1, int v2, int custo){ 
        this.matriz[v1][v2] = custo; 
    }
    public boolean listaVaiza(int v){ 
        for(int i = 0;i <this.vertice; i++) if(this.matriz[v][i] > 0) return false;
        return true;
    }
    public boolean existeLigacao(int v1, int v2){ return this.matriz[v1][v1] > 0; }
    
    public Aresta primeiroDaLista(int v){ 
    this.posicaoAtual[v] = -1;
    return this.proximoLista(v);
    }
    
}

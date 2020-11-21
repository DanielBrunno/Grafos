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
    public boolean listaVazia(int v){ 
        for(int i = 0;i <this.vertice; i++) if(this.matriz[v][i] > 0) return false;
        return true;
    }
    public boolean existeLigacao(int v1, int v2){ return this.matriz[v1][v1] > 0; }
    
    public Aresta primeiroDaLista(int v){ 
    this.posicaoAtual[v] = -1;
    return this.proximoLista(v);
    }

    private Aresta proximoLista(int v) {
        this.posicaoAtual[v]++;
        while((this.posicaoAtual[v]< this.vertice) && (this.matriz[v][this.posicaoAtual[v]] == 0)) this.posicaoAtual[v]++;
        if(this.posicaoAtual[v] == this.vertice) return null;
        else return new Aresta (v, this.posicaoAtual[v], this.matriz[v][this.posicaoAtual[v]]);
    }
    
    public Aresta retirarAresta(int v1, int v2){
        //Primeiro virifico se a Aresta existe, caso não return null atualizo o custo da aresta na matriz para 0 e return a aresta (custo) que nesse caso é 0;
        if(this.matriz[v1][v2] == 0) return null;
        else{
            Aresta aresta = new Aresta(v1, v2, this.matriz[v1][v2]);
            this.matriz[v1][v2] = 0;
            return aresta;
        }
    }
    
    public void imprimir(){
        System.out.print("  ");
        for(int i = 0; i < this.quantVertices(); i++)
            System.out.print(i + "   ");
        System.out.println();
        for(int j = 0; j < this.quantVertices(); j++){
            System.out.print(j + "   ");
            for(int l = 0; l < this.quantVertices(); l++)
                System.out.print(this.matriz[j][l] + "   ");
        System.out.println();
        }
    }
    
    public int quantVertices(){ return this.vertice; }
          
}
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
public class Aresta {
    private int v1, v2, custo;
    public Aresta(int v1,int v2, int custo){
        this.v1 = v1;
        this.v2 = v2;
        this.custo = custo;
    }

    public int getV1() { return v1; }
    public int getV2() { return v2; }
    public int getCusto() { return custo; }

    @Override
    public String toString() {
        return "Aresta{" + "v1=" + v1 + ", v2=" + v2 + ", custo=" + custo + '}';
    }       
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estruturas;

/**
 *
 * @author kaio_
 */

public class Pilha extends NoPilha{
    NoPilha topo;
    int tamanho;

    public NoPilha getTopo() {
        return topo;
    }

    public void setTopo(NoPilha topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Pilha(){
        this.inicializaPilha();
    }

    public void inicializaPilha(){
        this.setTopo(null);
        this.setTamanho(tamanho);
    }

    public void empilhar(int x) {
        NoPilha aux = this.getTopo();
        this.setTopo(new NoPilha());
        this.getTopo().setValor(x);
        this.getTopo().setProximo(aux);
        this.setTamanho(this.getTamanho()+1);
    }

    public NoPilha desempilhar(){
        if( this.pilhaVazia() ){
            System.out.println("Não existem elementos na pilha para serem removidos!");
            return null;
        }else{
            NoPilha aux = this.getTopo();
            this.setTopo(this.getTopo().getProximo());
            this.setTamanho(this.getTamanho()-1);
            return aux;
        }
    }

    public boolean pilhaVazia(){
        if( this.getTopo() == null ){
            return true;
        }
        return false;
    }

    public int tamanhoPilha(){
        return this.getTamanho();
    }

    public void imprimirPilha(){
        if( !this.pilhaVazia() ){
            NoPilha aux = this.getTopo();
            int contador = 0;
            while( aux.getProximo() != null ){
                System.out.println("Elemento da posição "+contador+" possui o valor: "+aux.getValor());
                contador++;
                aux = aux.getProximo();
            }
        }else{
            System.out.println("Estrutura vazia, impossível imprimir dados!");
        }
    }

    /*public int buscarTopo(){
        return this.getTopo().getValor();
    }*/
}
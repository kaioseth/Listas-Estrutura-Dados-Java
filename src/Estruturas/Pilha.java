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

public class Pilha {
    public class Elemento{
        int valor;
        Elemento proximo;

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }
    }

    Elemento topo;
    int tamanho;

    public Elemento getTopo() {
        return topo;
    }

    public void setTopo(Elemento topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void Pilha(){
        this.inicializaPilha();
    }

    public void inicializaPilha(){
        this.setTopo(null);
        this.setTamanho(tamanho);
    }

    public void empilhar(int x) {
        Elemento aux = this.getTopo();
        this.setTopo(new Elemento());
        this.getTopo().setValor(x);
        this.getTopo().setProximo(aux);
        this.setTamanho(this.getTamanho()+1);
    }

    public Elemento desempilhar(){
        if( this.pilhaVazia() ){
            System.out.println("Não existem elementos na pilha para serem removidos!");
            return null;
        }else{
            Elemento aux = this.getTopo();
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
        Elemento aux = this.getTopo();
        int contador = 0;
        while( aux.getProximo() != null ){
            System.out.println("Elemento da posição "+contador+" possui o valor: "+aux.getValor());
            contador++;
            aux = aux.getProximo();
        }
    }

    public int buscarTopo(){
        return this.getTopo().getValor();
    }
}
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

public class LSEC extends NoLista{
    private NoLista ultimo;

    public NoLista getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoLista ultimo) {
        this.ultimo = ultimo;
    }

    public NoLista buscarValor(int x){
        if( this.listaVazia() ){
            return null;
        }else if( x == this.getUltimo().getChave() ){
            return this.getUltimo();
        }else if( !this.listaVazia() ){
            NoLista no = this.getUltimo().getProximo();
            while( no.getChave()!= x && no != this.getUltimo() ){
                no = no.getProximo();
            }
            if( no == this.getUltimo() ){
                return null;                
            }else{
                return no;
            }
        }else{
            return null;
        }
    }

    public void inicializaLista(){
        this.setUltimo(null);
    }

    public boolean listaVazia(){
        if( this.getUltimo() == null ){
            return true;
        }
        return false;
    }

    public void inserirInicio(int x){
        NoLista no = new NoLista();

        no.setChave(x);

        if( this.listaVazia() ){
            no.setProximo(no);
            this.setUltimo(no);
        }else{
            no.setProximo(this.getUltimo().getProximo());
            this.getUltimo().setProximo(no);
        }
    }

    public void inserirFim(int x){
        NoLista no = new NoLista();

        no.setChave(x);

        if( this.listaVazia() ){
            no.setProximo(no);
        }else{
            no.setProximo(this.getUltimo().getProximo());
            this.getUltimo().setProximo(no);
        }

        this.setUltimo(no);
    }

    public void inserirOrdenado(int x){
        if( this.listaVazia() || this.getUltimo().getProximo().getChave() >= x ){
            this.inserirInicio(x);
        }else if( x >= this.getUltimo().getChave() ){
            this.inserirFim(x);
        }else{
            NoLista no = new NoLista();
            NoLista aux = this.getUltimo().getProximo();

            no.setChave(x);
            aux.setProximo(this.getUltimo());

            while( aux.getProximo().getChave() < x ){
                aux = aux.getProximo();
            }

            no.setProximo(aux.getProximo());
            aux.setProximo(no);
        }
    }

    public void remover(int x){
        if( !this.listaVazia() ){
            NoLista no = new NoLista();
            NoLista aux = this.getUltimo();

            while( aux.getProximo() != this.getUltimo() && aux.getProximo().getChave() != x ){
                aux = aux.getProximo();
            }

            if( aux.getProximo().getChave() == x ){
                no = aux.getProximo();
                if( no.getProximo() == no ){
                    this.inicializaLista();
                }else{
                    aux.setProximo(no.getProximo());
                    no.setProximo(null);
                    if( this.getUltimo() == no ){
                        this.setUltimo(aux);
                    }
                }
            }
        }
    }

    public void imprimirEstrutura(){
        if( !this.listaVazia() ){
            NoLista aux = this.getUltimo();
            int contador = 1;

            while( aux.getProximo() != this.getUltimo() ){
                System.out.println("Posição "+contador+": "+aux.getChave());
                aux = aux.getProximo();
                contador++;
            }
        }else{
            System.out.println("Estrutura vazia, impossível imprimir dados!");
        }
    }

    public LSEC(){
        this.inicializaLista();
    }
}
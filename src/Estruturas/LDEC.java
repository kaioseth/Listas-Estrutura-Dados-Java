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

public class LDEC {
    private NoLista primeiro;
    private NoLista ultimo;

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoLista primeiro) {
        this.primeiro = primeiro;
    }

    public NoLista getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoLista ultimo) {
        this.ultimo = ultimo;
    }

    public NoLista buscarValor(int x){
        if( !this.listaVazia() ){
            NoLista no = this.getPrimeiro();
            while( no.getProximo() != this.getPrimeiro() && no.getChave() != x ){
                no = no.getProximo();
            }
            if( no.getChave() == x ){
                return no;
            }
        }
        return null;
    }

    public void inicializaLista(){
        this.setPrimeiro(null);
        this.setUltimo(null);
    }

    public boolean listaVazia(){
        if( this.getPrimeiro() == null ){
            return true;
        }
        return false;
    }

    public void inserirInicio(int x){
        NoLista no = new NoLista();
 
        no.setChave(x);
        
        if( this.listaVazia() ){
            this.setPrimeiro(no);
            this.setUltimo(no);
            no.setAnterior(no);
            no.setProximo(no);
        }else if( this.getUltimo().getAnterior() == this.getPrimeiro() ){
            this.getPrimeiro().setAnterior(no);
            this.getPrimeiro().setProximo(no);
            no.setProximo(this.getPrimeiro());
            no.setAnterior(this.getUltimo());
        }
        
        this.getPrimeiro().setAnterior(no);
        this.getUltimo().setProximo(no);
        no.setAnterior(this.getUltimo());
        no.setProximo(this.getPrimeiro());
    }

    public void inserirFim(int x){
        if( this.listaVazia() ){
            this.inserirInicio(x);
        }else{
            NoLista no = new NoLista();
            NoLista aux;

            no.setChave(x);
            aux = this.getPrimeiro();

            while( aux.getProximo() != this.getPrimeiro() ){
                aux = aux.getProximo();
            }

            aux.setProximo(no);
            no.setAnterior(aux);
            no.setProximo(this.getPrimeiro());
            this.setUltimo(no);
        }
    }

    public void inserirOrdenado(int x){
        if( this.listaVazia() || this.getPrimeiro().getChave() >= x ){
            this.inserirInicio(x);
        }else if( x >= this.getUltimo().getChave() ){
            this.inserirFim(x);
        }else{
            NoLista no = new NoLista();
            NoLista aux = this.getPrimeiro();

            no.setChave(x);

            while( aux.getProximo().getChave() < x ){
                aux = aux.getProximo();
            }

            aux.getProximo().setAnterior(no);
            no.setProximo(aux.getProximo());
            aux.setProximo(no);
            no.setAnterior(aux);
        }
    }

    /*public void remover(int x){
        NoLista no = this.buscarValor(x);

        if( no == null ){
            System.out.println("Elemento não encontrado na estrutura!");
        }else{
            if( this.getPrimeiro() == this.getUltimo() ){
                this.inicializaLista();
            }else{
                if( no == this.getPrimeiro() ){
                    this.setPrimeiro(no.getProximo());
                    this.getPrimeiro().setAnterior(null);
                    no.setProximo(null);
                }else if( no == this.getUltimo() ){
                    this.setUltimo(no.getAnterior());
                    this.getUltimo().setProximo(null);
                    no.setAnterior(null);
                }else{
                    no.getAnterior().setProximo(no.getProximo());
                    no.getProximo().setAnterior(no.getAnterior());
                    no.setAnterior(null);
                    no.setProximo(null);
                }
            }            
        }
    }*/

    public void imprimirEstrutura(){
        if( !this.listaVazia() ){
            NoLista aux = this.getPrimeiro();
            int contador = 1;

            while( aux.getProximo() != this.getPrimeiro() ){
                System.out.println("Posição "+contador+": "+aux.getChave());
                aux = aux.getProximo();
                contador++;
            }
        }else{
            System.out.println("Estrutura vazia, impossível imprimir dados!");
        }
    }

    public LDEC(){
        this.inicializaLista();
    }
}
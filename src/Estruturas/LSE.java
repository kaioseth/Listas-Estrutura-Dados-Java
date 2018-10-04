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

public class LSE extends NoLista{
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
        NoLista no = this.getPrimeiro();
        if( !this.listaVazia() ){
            while( no.getProximo() != null && no.getChave() != x ){
                no = no.getProximo();
            }
        }
        if( no.getChave() == x ){
            return no;
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
        no.setProximo(this.getPrimeiro());

        if( this.listaVazia() ){
            this.setUltimo(no);
        }

        this.setPrimeiro(no);
    }

    public void inserirFim(int x){
        if( this.listaVazia() ){
            this.inserirInicio(x);
        }else{
            NoLista no = new NoLista();
            no.setChave(x);
            no.setProximo(null);
            this.getUltimo().setProximo(no);
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

            no.setProximo(aux.getProximo());
            aux.setProximo(no);
        }
    }

    public NoLista remover(int x){
        NoLista no;
        no = null;
        
        if( !this.listaVazia() ){
            if( x == this.getPrimeiro().getChave() ){
                no = this.getPrimeiro();
                if( this.getPrimeiro() == this.getUltimo() ){
                    this.inicializaLista();
                }else{
                    this.setPrimeiro(no.getProximo());
                    no.setProximo(null);
                }
            }else{
                NoLista aux;
                aux = this.getPrimeiro();
                while( aux.getProximo() != null && aux.getProximo().getChave() != x ){
                    aux = aux.getProximo();
                }
                if( aux.getProximo() != null ){
                    no = aux.getProximo();
                    aux.setProximo(no.getProximo());
                    no.setProximo(null);
                    if( no == this.getUltimo() ){
                        this.setUltimo(aux);
                    }
                }
            }
        }

        return no;
    }

    public void imprimirEstrutura(){
        if( !this.listaVazia() ){
            NoLista aux = this.getPrimeiro();
            int contador = 0;

            while( aux != null ){
                System.out.println("Posição "+contador+": "+aux.getChave());
                aux = aux.getProximo();
                contador++;
            }
        }else{
            System.out.println("Estrutura vazia, impossível imprimir dados!");
        }
    }

    public LSE(){
        this.inicializaLista();
    }
}
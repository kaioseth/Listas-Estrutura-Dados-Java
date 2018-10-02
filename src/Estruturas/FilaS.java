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

public class FilaS extends NoFila{
    NoFila ini;
    NoFila fim;

    public NoFila getIni() {
        return ini;
    }

    public void setIni(NoFila ini) {
        this.ini = ini;
    }

    public NoFila getFim() {
        return fim;
    }

    public void setFim(NoFila fim) {
        this.fim = fim;
    }
    
    public void inicializaFilaS(){
        this.setIni(null);
        this.setFim(null);
    }
    
    public boolean filaSVazia(){
        if( this.getIni() == null ){
            return true;
        }
        return false;
    }
    
    public void imprimirFilaS(){
        NoFila aux = this.getIni();
        int contador = 0;
        while( aux.getProximo() != this.getFim() ){
            System.out.println("Elemento da posição "+contador+" possui o valor: "+aux.getValor());
            contador++;
            aux = aux.getProximo();
        }
        if( this.getFim() != null ){
            System.out.println("Elemento da posição "+contador+" possui o valor: "+this.getFim().getValor());
            contador++;
        }
    }
    
    public void enfileirar(int x){
        NoFila aux = new NoFila();
        aux.setValor(x);
        aux.setProximo(null);

        if( this.filaSVazia() ){
            this.setIni(aux);
            this.setFim(this.getIni());
            this.getIni().setProximo(this.getFim());
        }else{
            this.getFim().setProximo(aux);
            this.setFim(aux);
        }
    }
    
    public NoFila desenfileirar(){
        if( !this.filaSVazia() ){
            NoFila aux = new NoFila();
            if( this.getIni().getProximo() == this.getFim() && this.getFim() == null  ){
                aux = this.getIni();
                this.inicializaFilaS();
                return aux;
            }else{
                NoFila retorno = this.getFim();
                aux = this.getIni();
                while( aux.getProximo() != this.fim ){
                    aux = aux.getProximo();
                }
                this.setFim(aux);
                aux.setProximo(null);
                return retorno;
            }
        }
        return null;
    }
    
    public void FilaS(){
        this.inicializaFilaS();
    }
}
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

public class FilaC extends NoFila{
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
    
    public void inicializaFilaC(){
        this.setIni(null);
        this.setFim(null);
    }
    
    public boolean filaCVazia(){
        if( this.getIni() == this.getFim() && this.getFim() == null ){
            return true;
        }
        return false;
    }
    
    public void imprimirFilaC(){
        if( this.filaCVazia() ){
            System.out.println("Estrutura vazia, impossível imprimir dados!");
        }else{
            NoFila aux = this.getFim().getProximo();
            int contador = 0;
            while( aux.getProximo() != this.getFim().getProximo() ){
                System.out.println("Elemento da posição "+contador+" possui o valor: "+aux.getValor());
                contador++;
                aux = aux.getProximo();
            }
            if( this.getFim() != null ){
                System.out.println("Elemento da posição "+contador+" possui o valor: "+this.getFim().getValor());
                contador++;
            }
        }
    }
    
    public void enfileirar(int x){
        NoFila aux = new NoFila();
        aux.setValor(x);
        aux.setProximo(null);

        if( this.filaCVazia() ){
            this.setIni(aux);
            this.setFim(aux);
            this.getIni().setProximo(this.getFim());
            this.getFim().setProximo(this.getIni());
        }else{
            aux.setProximo(this.getIni());
            this.getFim().setProximo(aux);
            this.setFim(aux);
        }
    }
    
    public NoFila desenfileirar(){
        if( !this.filaCVazia() ){
            NoFila retorno = new NoFila();
            if( this.getIni() == this.getFim() && this.getIni().getProximo() == this.getFim() ){
                retorno = this.getIni();
                this.inicializaFilaC();
            }else{
                retorno = this.getIni();
                this.setFim(this.getIni());
                this.setIni(this.getIni().getProximo());
                this.getFim().setProximo(this.getIni());
            }
            return retorno;
        }
        return null;
    }
    
    public FilaC(){
        this.inicializaFilaC();
    }
}
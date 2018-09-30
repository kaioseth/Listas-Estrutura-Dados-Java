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

public class NoLista {
    int chave;
    NoLista proximo;
    NoLista anterior;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NoLista getProximo() {
        return proximo;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

    public NoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NoLista anterior) {
        this.anterior = anterior;
    }
}
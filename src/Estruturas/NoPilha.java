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

public class NoPilha {
    int valor;
    NoPilha proximo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoPilha getProximo() {
        return proximo;
    }

    public void setProximo(NoPilha proximo) {
        this.proximo = proximo;
    }
}
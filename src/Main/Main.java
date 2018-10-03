/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.util.Scanner;
import javax.swing.JOptionPane;

import Estruturas.LSE;
import Estruturas.LDE;
import Estruturas.LSEC;
import Estruturas.LDEC;
import Estruturas.FilaS;
import Estruturas.FilaC;
import Estruturas.Pilha;
import Estruturas.NoFila;
import Estruturas.NoLista;
import Estruturas.NoPilha;

/**
 *
 * @author kaio_
 */

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    private static  LSE    lse;
    private static boolean lsei = false;

    private static LDE     lde;
    private static boolean ldei = false;

    private static LSEC    lsec;
    private static boolean lseci = false;

    private static LDEC    ldec;
    private static boolean ldeci = false;

    private static FilaS    filas;
    private static boolean filasi = false;
    
    private static FilaC    filac;
    private static boolean filaci = false;

    private static Pilha   pilha;
    private static boolean pilhai = false;

    //private static NoFila nofila;
    //private static NoPilha nopilha;
    //private static NoLista nolista;

    private static int opcaoPrincipal = 1;
    private static int opcaoSecundaria;
    private static int valor;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        while( opcaoPrincipal != 0 ){
            imprimirMenuPrincipal();

            opcaoPrincipal = entrada.nextInt();

            if( opcaoPrincipal < 0 || opcaoPrincipal > 7  ){
                System.out.println("Opção inválida, digite outro valor!");
            }else{

                //System.out.println("Opção principal: "+opcaoPrincipal);

                switch( opcaoPrincipal ) {
                    case 1: // LSE
                        if( !lsei ) { lsei = true; lse = new LSE(); }
                        opcaoSecundaria = 1;

                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuLista();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LSE
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista nolista = lse.buscarValor(valor);
                                if( nolista != null ){
                                    System.out.println("O valor informado foi encontrado na estrutura!");
                                }else{
                                    System.out.println("O valor informado não foi encontrado na estrutura!");
                                }
                            }else if( opcaoSecundaria == 3 ){ // Inserir valor no início de LSE
                                System.out.println("Digite o valor que deseja inserir no início:");
                                valor = entrada.nextInt();
                                lse.inserirInicio(valor);
                            }else if( opcaoSecundaria == 4 ){ // Inserir valor no final de LSE
                                System.out.println("Digite o valor que deseja inserir no final:");
                                valor = entrada.nextInt();
                                lse.inserirFim(valor);
                            }else if( opcaoSecundaria == 5 ){ // Inserir valor em alguma posição de LSE
                                System.out.println("Digite o valor que deseja inserir de maneira ordenada:");
                                valor = entrada.nextInt();
                                lse.inserirOrdenado(valor);
                            }else if( opcaoSecundaria == 6 ){ // Remover valor de LSE
                                System.out.println("Digite o valor que deseja remover:");
                                valor = entrada.nextInt();
                                //lse.remover(valor);
                            }else if( opcaoSecundaria == 7 ){ // Imprimir LSE
                                lse.imprimirEstrutura();
                            }
                        } // fim while opção secundária
                    break; // parada condição 1

                    case 2: // LDE
                        if( !ldei ) { ldei = true; lde = new LDE(); }
                        opcaoSecundaria = 1;

                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuLista();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LDE
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista nolista = lde.buscarValor(valor);
                                if( nolista != null ){
                                    System.out.println("O valor informado foi encontradona estrutura!");
                                }else{
                                    System.out.println("O valor informado não foi encontrado na estrutura!");
                                }
                            }else if( opcaoSecundaria == 3 ){ // Inserir valor no início de LDE
                                System.out.println("Digite o valor que deseja inserir no início:");
                                valor = entrada.nextInt();
                                lde.inserirInicio(valor);
                            }else if( opcaoSecundaria == 4 ){ // Inserir valor no final de LDE
                                System.out.println("Digite o valor que deseja inserir no final:");
                                valor = entrada.nextInt();
                                lde.inserirFim(valor);
                            }else if( opcaoSecundaria == 5 ){ // Inserir valor em alguma posição de LDE
                                System.out.println("Digite o valor que deseja inserir de maneira ordenada:");
                                valor = entrada.nextInt();
                                lde.inserirOrdenado(valor);
                            }else if( opcaoSecundaria == 6 ){ // Remover valor de LDE
                                System.out.println("Digite o valor que deseja remover:");
                                valor = entrada.nextInt();
                                lde.remover(valor);
                            }else if( opcaoSecundaria == 7 ){ // Imprimir LDE
                                lde.imprimirEstrutura();
                            }
                        } // fim while opção secundária
                    break;

                    case 3: // LSEC
                        if( !lseci ){ lseci = true; lsec = new LSEC(); }
                        opcaoSecundaria = 1;

                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuLista();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LSEC
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista nolista = lsec.buscarValor(valor);
                                if( nolista != null ){
                                    System.out.println("O valor informado foi encontrado na estrutura!");
                                }else{
                                    System.out.println("O valor informado não foi encontrado na estrutura!");
                                }
                            }else if( opcaoSecundaria == 3 ){ // Inserir valor no início de LSEC
                                System.out.println("Digite o valor que deseja inserir no início:");
                                valor = entrada.nextInt();
                                lsec.inserirInicio(valor);
                            }else if( opcaoSecundaria == 4 ){ // Inserir valor no final de LSEC
                                System.out.println("Digite o valor que deseja inserir no final:");
                                valor = entrada.nextInt();
                                lsec.inserirFim(valor);
                            }else if( opcaoSecundaria == 5 ){ // Inserir valor em alguma posição de LSEC
                                System.out.println("Digite o valor que deseja inserir de maneira ordenada:");
                                valor = entrada.nextInt();
                                lsec.inserirOrdenado(valor);
                            }else if( opcaoSecundaria == 6 ){ // Remover valor de LSEC
                                System.out.println("Digite o valor que deseja remover:");
                                valor = entrada.nextInt();
                                lsec.remover(valor);
                            }else if( opcaoSecundaria == 7 ){ // Imprimir LSEC
                                lsec.imprimirEstrutura();
                            }
                        } // fim while opção secundária
                    break; // parada condição 3

                    case 4: // LDEC
                        if( !ldeci ){ ldeci = true; ldec = new LDEC(); }
                        opcaoSecundaria = 1;
                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuLista();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LDEC
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista nolista = ldec.buscarValor(valor);
                                if( nolista != null ){
                                    System.out.println("O valor informado foi encontrado na estrutura!");
                                }else{
                                    System.out.println("O valor informado não foi encontrado na estrutura!");
                                }
                            }else if( opcaoSecundaria == 3 ){ // Inserir valor no início de LDEC
                                System.out.println("Digite o valor que deseja inserir no início:");
                                valor = entrada.nextInt();
                                ldec.inserirInicio(valor);
                            }else if( opcaoSecundaria == 4 ){ // Inserir valor no final de LDEC
                                System.out.println("Digite o valor que deseja inserir no final:");
                                valor = entrada.nextInt();
                                ldec.inserirFim(valor);
                            }else if( opcaoSecundaria == 5 ){ // Inserir valor em alguma posição de LDEC
                                System.out.println("Digite o valor que deseja inserir de maneira ordenada:");
                                valor = entrada.nextInt();
                                ldec.inserirOrdenado(valor);
                            }else if( opcaoSecundaria == 6 ){ // Remover valor de LDEC
                                System.out.println("Digite o valor que deseja remover:");
                                valor = entrada.nextInt();
                                //ldec.remover(valor);
                            }else if( opcaoSecundaria == 7 ){ // Imprimir LDEC
                                ldec.imprimirEstrutura();
                            }
                        } // fim while opção secundária
                    break; // parada condição 4

                    case 5: // Fila Simples com Ponteiro 
                        if( !filasi ){ filasi = true; filas = new FilaS(); }
                        opcaoSecundaria = 1;
                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuFila();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Enfileirar
                                System.out.println("Digite o valor que deseja inserir na estrutura:");
                                valor = entrada.nextInt();
                                filas.enfileirar(valor);
                            }else if( opcaoSecundaria == 3 ){ // Desemfileirar
                                NoFila nofila = filas.desenfileirar();
                                if( nofila == null ){
                                    System.out.println("A estrutura estava vazia, sendo impossível executar essa ação!");
                                }else{
                                    System.out.println("Valor desemfileirado: "+nofila.getValor());
                                }
                            }else if( opcaoSecundaria == 4 ){ // Imprimir estrutura
                                filas.imprimirFilaS();
                            }
                        } // fim while submenu fila simples
                    break; // parada condição 5
                    
                    case 6: // Fila Circular com Ponteiro 
                        if( !filaci ){ filaci = true; filac = new FilaC(); }
                        opcaoSecundaria = 1;
                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuFila();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Enfileirar
                                System.out.println("Digite o valor que deseja inserir na estrutura:");
                                valor = entrada.nextInt();
                                filac.enfileirar(valor);
                            }else if( opcaoSecundaria == 3 ){ // Desemfileirar
                                NoFila nofila = filac.desenfileirar();
                                if( nofila == null ){
                                    System.out.println("A estrutura estava vazia, sendo impossível executar essa ação!");
                                }else{
                                    System.out.println("Valor desemfileirado: "+nofila.getValor());
                                }
                            }else if( opcaoSecundaria == 4 ){ // Imprimir estrutura
                                filac.imprimirFilaC();
                            }
                        } // fim while submenu fila circular
                    break; // parada condição 6

                    case 7: // Pilha
                        if( !pilhai ){ pilhai = true; pilha = new Pilha(); }
                        opcaoSecundaria = 1;
                        while( opcaoSecundaria != 0 ){
                            imprimirSubMenuPilha();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Empilhar
                                System.out.println("Digite o valor que deseja empilhar:");
                                valor = entrada.nextInt();
                                pilha.empilhar(valor);
                            }else if( opcaoSecundaria == 3 ){ // Desempilhar
                                NoPilha nopilha = pilha.desempilhar();
                                if( nopilha == null ){
                                    System.out.println("A estrutura estava vazia, sendo impossível executar essa ação!");
                                }else{
                                    System.out.println("Valor desempilhado: "+nopilha.getValor());
                                }
                            }else if( opcaoSecundaria == 4 ){ // Tamanho da pilha
                                System.out.println("A pilha possui tamanho: "+pilha.tamanhoPilha());
                            }else if( opcaoSecundaria == 5 ){ // Imprimir elementos da pilha
                                pilha.imprimirPilha();
                            }else if( opcaoSecundaria == 6 ){ // Ver elemento do topo
                                NoPilha nopilha = pilha.getTopo();
                                if( nopilha == null ){
                                    System.out.println("A estrutura estava vazia, sendo impossível executar essa ação!");
                                }else{
                                    System.out.println("Valor presente no topo da pilha é: "+nopilha.getValor());
                                }
                            }
                        } // fim while submenu pilha
                    break; // parada condição 7

                    default:
                        System.out.println("Opção inválida!");
                } // fim switch opção principal

            } // fim else valida opção inválida

        } // fim while opção principal

        JOptionPane.showMessageDialog(null, "Execução encerrada!");
    }

    public static void imprimirMenuPrincipal(){
        System.out.println("\n");
        System.out.println("# Menu Principal ---------------------- #");
        System.out.println(" Selecione uma estrutura para manipular: ");
        System.out.println(" 1 - Lista SE ");
        System.out.println(" 2 - Lista DE ");
        System.out.println(" 3 - Lista SEC ");
        System.out.println(" 4 - Lista DEC ");
        System.out.println(" 5 - Fila Simples com Ponteiros ");
        System.out.println(" 6 - Fila Cirular com Ponteiros ");
        System.out.println(" 7 - Pilha com Ponteiros ");
        System.out.println(" 0 - Encerrar execução ");
        System.out.println("# ------------------------------------- #");
        System.out.println("\n");
    }

    public static void imprimirSubMenuFila(){
        System.out.println("\n");
        System.out.println("# Menu Secundário---------------------- #");
        System.out.println(" O que deseja fazer com a estrutura: ");
        //System.out.println(" 1 - Inicializar estrutura ");
        System.out.println(" 2 - Enfileirar elemento ");
        System.out.println(" 3 - Desemfileirar elemento ");
        System.out.println(" 4 - Imprimir elementos ");
        System.out.println(" 0 - Voltar para menu principal ");
        System.out.println("# ------------------------------------- #");
        System.out.println("\n");
    }
    
    public static void imprimirSubMenuLista(){
        System.out.println("\n");
        System.out.println("# Menu Secundário---------------------- #");
        System.out.println(" O que deseja fazer com a estrutura: ");
        //System.out.println(" 1 - Inicializar estrutura ");
        System.out.println(" 2 - Buscar valor ");
        System.out.println(" 3 - Inserir no início ");
        System.out.println(" 4 - Inserir no final ");
        System.out.println(" 5 - Inserir ordenadamente ");
        System.out.println(" 6 - Remover ");
        System.out.println(" 7 - Imprimir estrutura ");
        System.out.println(" 0 - Voltar para menu principal ");
        System.out.println("# ------------------------------------- #");
        System.out.println("\n");
    }

    public static void imprimirSubMenuPilha(){
        System.out.println("\n");
        System.out.println("# Menu Secundário---------------------- #");
        System.out.println(" O que deseja fazer com a estrutura: ");
        //System.out.println(" 1 - Inicializar estrutura ");
        System.out.println(" 2 - Empilhar elemento ");
        System.out.println(" 3 - Desempilhar elemento ");
        System.out.println(" 4 - Tamanho atual da pilha ");
        System.out.println(" 5 - Imprimir elementos ");
        System.out.println(" 6 - Ver elemento do topo ");
        System.out.println(" 0 - Voltar para menu principal ");
        System.out.println("# ------------------------------------- #");
        System.out.println("\n");
    }
}
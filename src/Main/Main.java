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
import Estruturas.Fila;
import Estruturas.Pilha;
import Estruturas.NoLista;

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

    private static Fila    fila;
    private static boolean filai = false;

    private static Pilha   pilha;
    private static boolean pilhai = false;

    private static NoLista no;

    private static int opcaoPrincipal = 1;
    private static int opcaoSecundaria = 2;
    private static int valor;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        while( opcaoPrincipal != 0 ){
            imprimirMenuPrincipal();

            opcaoPrincipal = entrada.nextInt();

            if( opcaoPrincipal < 0 || opcaoPrincipal > 6  ){
                System.out.println("Opção inválida, digite outro valor!");
            }else{

                switch( opcaoPrincipal ) {
                    case 1: // LSE
                        if( !lsei ) { lsei = true; lse = new LSE(); }

                        while( opcaoSecundaria != 0 ){
                            imprimirMenuSecundario();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LSE
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista no = lse.buscarValor(valor);
                                if( no != null ){
                                    System.out.println("O valor buscado foi encontrado antes do elemento: "+no.getProximo());
                                }else{
                                    System.out.println("O valor buscado não foi encontrado na estrutura!");
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
                                lse.remover(valor);
                            }else if( opcaoSecundaria == 7 ){ // Imprimir LSE
                                lse.imprimirEstrutura();
                            }
                        } // fim while opção secundária
                    break;

                    case 2: // LDE
                        if( !ldei ) { ldei = true; lde = new LDE(); }

                        while( opcaoSecundaria != 0 ){
                            imprimirMenuSecundario();  
                            opcaoSecundaria = entrada.nextInt();
                            if( opcaoSecundaria == 2 ){ // Buscar valor em LDE
                                System.out.println("Digite o valor que deseja buscar:");
                                valor = entrada.nextInt();
                                NoLista no = lde.buscarValor(valor);
                                if( no != null ){
                                    System.out.println("O valor buscado foi encontrado antes do elemento: "+no.getProximo());
                                }else{
                                    System.out.println("O valor buscado não foi encontrado na estrutura!");
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

                        
                    break;

                    case 4: // LDEC
                        if( !ldeci ){ ldeci = true; ldec = new LDEC(); }

                        
                    break;

                    case 5: // Fila  
                        if( !filai ){ filai = true; fila = new Fila(); }

                        
                    break;

                    case 6: // Pilha
                        if( !pilhai ){ pilhai = true; pilha = new Pilha(); }

                        
                    break;

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
        System.out.println(" 5 - Fila  com Ponteiros ");
        System.out.println(" 6 - Pilha com Ponteiros ");
        System.out.println(" 0 - Encerrar execução ");
        System.out.println("# ------------------------------------- #");
        System.out.println("\n");
    }

    public static void imprimirMenuSecundario(){
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
}
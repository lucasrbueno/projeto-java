package br.edu.infnet.appEstudoCalculadoraEmClasse;

import java.util.Scanner;

public class Calculadora {
    private float n1;
    private float n2;
    private int escolha;
        
    private float soma(){
        return n1 + n2;
    }
    
    private float subtracao(){
        return n1 - n2;
    }
    
    private float divisao(){
        return n1 / n2;
    }
    
    private float multiplicacao(){
        return n1 * n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }
    
    float calcular(int escolha){
        switch(escolha){
            case Constante.SOMA:
                return soma();
            case Constante.SUBTRACAO:
                return subtracao();
            case Constante.DIVISAO:
                return divisao();
            case Constante.MULTIPLICACAO:  
                return multiplicacao();
        }
        return 0;
    }
    
    void impressao(){
        System.out.println(n1 + "" + Constante.OPERACAO_SINAL[escolha] + "" + n2 + "");
    }
}

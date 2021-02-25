package br.edu.infnet.appEstudoCalculadoraEmClasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);
        
//        tratarMenu();
        System.out.println("Escreva o primeiro número: ");
        calc.setN1(scan.nextInt());
        System.out.println("Escreva o segundo número: ");
        calc.setN2(scan.nextInt());
        System.out.println("Escolha sua operação: ");
        calc.calcular(scan.nextInt());
        
        calc.impressao();
    }
        private static int tratarMenu(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println(Constante.SOMA + " - " + Constante.OPERACAO_SINAL[0]);
        System.out.println(Constante.SUBTRACAO + " - " + Constante.OPERACAO_SINAL[1]);
        System.out.println(Constante.DIVISAO + " - " + Constante.OPERACAO_SINAL[2]);
        System.out.println(Constante.MULTIPLICACAO + " - " + Constante.OPERACAO_SINAL[3]);
        System.out.println("Selecione a opção desejada: ");
        
        return scan.nextInt();
    }
}

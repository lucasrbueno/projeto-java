package br.edu.infnet.appEstudo.tp4;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionarioLoteTeste {
    public static void main(String[] args) {
        
        String opcao = null; 
        Scanner scan = new Scanner(System.in);
        int i = 0;
        
        String[] nomes = new String[5];
        
        do {
            if(i < nomes.length){
                System.out.println("Informe seu nome: ");
                nomes[i] = scan.next();

                System.out.println("Funcionario cadastrado com sucesso: " + nomes[i]);
                i++;

                System.out.println("Deseja cadastrar um funcionãrio: (S/N). Resposta: ");
                opcao = scan.next();
            } else {
                System.out.println("Não é possivel cadastrar mais");
                opcao = "N";
            }
        } while ("S".equalsIgnoreCase(opcao));
        
        System.out.println(Arrays.toString(nomes));
        
        System.out.println("Processamento finalizado.");
    }
}

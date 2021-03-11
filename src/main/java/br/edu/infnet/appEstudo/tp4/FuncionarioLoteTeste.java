package br.edu.infnet.appEstudo.tp4;

import java.util.Scanner;

public class FuncionarioLoteTeste {
     public static final int QUANT = 1;
    
    public static void main(String[] args) {
        
        String opcao = null; 
        Scanner scan = new Scanner(System.in);
        int escolha;
        int i = 0;
        
        Funcionario[] funcionario = new Funcionario[QUANT];

        do {
            escolha = menu();
            
            switch(escolha){
                case 1:
                    if(i < QUANT){
                        Funcionario func = new Funcionario();

                        System.out.println("Informe seu nome: ");
                        func.setNome(scan.next());

                        System.out.println("Informe seu email: ");
                        func.setEmail(scan.next());

                        System.out.println("Informe seu salário: ");
                        func.setSalario(scan.nextFloat());

                        System.out.println("Informe sua idade: ");
                        func.setIdade(scan.nextInt());

                        func.impressao();

                        System.out.println("Deseja cadastrar um funcionãrio: (S/N). Resposta: ");
                        opcao = scan.next();

                        funcionario[i] = func;

                        i++;
                    } else {
                        System.out.println("Não é possivel cadastrar mais");
                    }
                    break;
                case 2:
                    
                    if(i < 0){
                        for(int j = 0; j < i ; j++){
                            System.out.println(funcionario[j]);
                        } 
                    } else {
                        System.out.println("Nenhum funcionário cadastrado");
                    }
                opcao = "S";
                break;
                case 3:
                    System.out.println("Saindo...");
                    opcao = "N";
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    opcao = "S";
                    break;
            }
        } while ("S".equalsIgnoreCase(opcao));
        
        System.out.println("Processamento finalizado.");
    }
    
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastramento de funcionários: ");
        System.out.println("1 - Incluir");
        System.out.println("2 - Exibir todos");
        System.out.println("3 - Sair");
        System.out.println("Escolha sua opção: ");
        
        int escolha = scan.nextInt();
        
        return escolha;
    }
}

package br.edu.infnet.appEstudo.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioLoteTeste {
     private static String opcao = null; 
     private static List<Funcionario> funcionario;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        
         funcionario = new ArrayList<>();

        do {
            escolha = menu();
            
            switch(escolha){
                case 1:
                        Programador programador = new Programador();

                        System.out.println("Informe seu nome: ");
                        programador.setNome(scan.next());

                        System.out.println("Informe seu email: ");
                        programador.setEmail(scan.next());

                        System.out.println("Informe seu salário: ");
                        programador.setSalario(scan.nextFloat());

                        System.out.println("Informe sua idade: ");
                        programador.setIdade(scan.nextInt());
                        
                        System.out.println("Informe a sua linguagem: ");
                        programador.setLinguagem(scan.next());
                        
                        System.out.println("Informe o seu valor adicional: ");
                        programador.setValorAdicional(scan.nextFloat());

                        programador.impressao();

                        System.out.println("Deseja cadastrar um funcionãrio: (S/N). Resposta: ");
                        opcao = scan.next();

                        funcionario.add(programador);
                    break;
                case 2:
                    AnalistaSistema analista = new AnalistaSistema();

                    System.out.println("Informe seu nome: ");
                    analista.setNome(scan.next());

                    System.out.println("Informe seu email: ");
                    analista.setEmail(scan.next());

                    System.out.println("Informe seu salário: ");
                    analista.setSalario(scan.nextFloat());

                    System.out.println("Informe sua idade: ");
                    analista.setIdade(scan.nextInt());

                    System.out.println("Informe a sua linguagem: ");
                    analista.setQtdeSistema(scan.nextInt());

                    System.out.println("Informe o seu valor adicional: ");
                    analista.setTempoExperiencia(scan.nextInt());

                    analista.impressao();

                    System.out.println("Deseja cadastrar um funcionãrio: (S/N). Resposta: ");
                    opcao = scan.next();

                    funcionario.add(analista);
                    break;
                case 3:
                    if(funcionario.size() > 0){
                        for(Funcionario f : funcionario){
                            String tipo = f instanceof Programador ? "P" : "A";

                            System.out.println(tipo + " " + f);
                        } 
                    } else {
                        System.out.println("Nenhum funcionário cadastrado");
                    }
                opcao = "S";
                break;
                case 4:
                    System.out.println("Saindo...");
                    opcao = "N";
                    break;
                default:
                    tratarOpcaoInvalida();
                    break;
            }
        } while ("S".equalsIgnoreCase(opcao));
        
        System.out.println("Processamento finalizado.");
    }
    
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastramento de funcionários: ");
        System.out.println("1 - Incluir programadores");
        System.out.println("2 - Incluir analistas");
        System.out.println("3 - Exibir todos");
        System.out.println("4 - Sair");
        System.out.println("Escolha sua opção: ");
        
        int escolha = scan.nextInt();
        
        return escolha;
    }
    
    public static void tratarOpcaoInvalida(){
        System.out.println("Opção inválida, tente novamente");
        opcao = "S";
    }
}

package br.edu.infnet.appEstudo.tp2;


public class Calculadora {
    public static void main(String[] args) {
        System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão\n");
        System.out.println(operacao(3));
    }
    
    public static float operacao(int escolha){
        float n1 = 15;
        float n2 = 3;
        float conta = 0;
        
        switch (escolha) {
            case 1:
                conta = n1 + n2;
                System.out.print("A soma é de: ");
                break;
            case 2:
                conta = n1 - n2;
                System.out.print("A subtração é de: ");
                break;
            case 3:
                conta = n1 * n2;
                System.out.print("A multiplicação é de: ");
                break;
            case 4:
                conta = n1 / n2;
                System.out.print("A divisão é de: ");
                break;
            default:
                System.out.print("Opção inválida.");
                break;
        }
        
        return conta;
    }
}


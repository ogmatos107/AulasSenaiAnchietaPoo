package Aula02_colecoes.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "-----Gerenciador de Tarefas-----\n" +
                "1 - Adicionar tarefa\n" +
                "2 - Listar tarefas\n" +
                "3 - Marcar tarefa como concluída\n" +
                "4 - Remover tarefa\n" +
                "5 - Sair";
        System.out.println("escolha um opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                scanner.nextLine();
                System.out.println("digite o nome da tarefa  ");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("qu");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                break;

        }
    }
}

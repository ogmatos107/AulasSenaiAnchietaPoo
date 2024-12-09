package Aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        Tarefa tarefa1 = new Tarefa("", true);
        Tarefa tarefa2 = new Tarefa("", true);

        System.out.println(tarefa1);
        System.out.println(tarefa2);

        System.out.println(tarefa1.equals(tarefa2));
        String menu = """
                    Escolha:
                        1 - adicionar tarefa
                        2 - exibir tarefa
                        3 - atualizar tarefa
                        4 - deletar tarefa
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa");
                    String nomeTarefa = scanner.nextLine();
                    listaTarefas.add(new Tarefa(nomeTarefa, false));
                    System.out.println("Tarefa cadastrada com sucesso!!");
                    break;
                case 2:
                    exibirTarefas();
                    break;
                case 3:
                    exibirTarefas();
                    System.out.println("Escolha uma tarefa pelo id para marcar como concluida!");
                    listaTarefas.get(scanner.nextInt() - 1).status = true;
                    System.out.println("Tarefa atualizada com sucesso!!");
                    break;
                case 4:
                    exibirTarefas();
                    System.out.println("Escolha uma tarefa pelo id para ser removida");
                    listaTarefas.remove(scanner.nextInt() - 1);
                    System.out.println("Tarefa removida com sucesso!!");
                    break;
                case 5:
                    System.out.println("Fim Programa");
                    scanner.close();
                    break;
            }
        } while (opcao != 5);
    }

    public static void exibirTarefas() {
        }
    }

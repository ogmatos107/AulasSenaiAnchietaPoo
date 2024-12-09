package Aula02_colecoes.exercicios.exercicio01;

import java.util.Objects;

public class Tarefa {
    String nome;
    boolean status;

    public Tarefa(String nome,boolean status) {
        this.status = status;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefas = (Tarefa) o;
        return status == tarefas.status && Objects.equals(nome, tarefas.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, status);
    }
}


package com.senai.aula01_classe_atributo_metodos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "leandro";
        pessoa1.endereco = "Santos";
        pessoa1.idade = 17;

        Pessoa pessoa2 = new Pessoa();
        pessoa1.nome = "leandro";
        pessoa1.endereco = "Santos";
        pessoa1.idade = 18;

        System.out.println(pessoa1.equals(pessoa2));

    }

}

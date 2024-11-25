package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String placa;
    byte portas;
    String cor;
    double precoBase;
    int anoFabricacao;

    public void verificarInformacoes() {
        System.out.println("Marca" + marca + "\n");
        System.out.println("Placa" + placa + "\n");
        System.out.println("Portas" + portas + "\n");
        System.out.println("Cor" + cor + "\n");
        System.out.println("preço" + precoBase + "\n");
        System.out.println("ano" + anoFabricacao + "\n");

    }

    public void ligarCarro() {
        System.out.println("vrum");

    }

    public void testarSom() {
        System.out.println("som ligado");
    }

    public void consultarPlaca() {
        System.out.println("placa" + placa + "esta sem restrinções");
    }

    /*public void soncultarPreco(int anoAtual) {
        int idadeCarro = anoAtual - anoFabricacao;
        double preco = precoBase;
        if (idadeCarro > 0) {
            for (int i = 0; i > idadeCarro; i++) {
                preco -= preco * 0.5;*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return portas == carro.portas && Double.compare(precoBase, carro.precoBase) == 0 && anoFabricacao == carro.anoFabricacao && Objects.equals(marca, carro.marca) && Objects.equals(placa, carro.placa) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, placa, portas, cor, precoBase, anoFabricacao);
    }

    public void aplicarDesconto(double valorInicial, int anos) {
        double valorFinal = valorInicial;
        for (int i = 0; i < anos; i++) {
            valorFinal *= 0.95; // Aplica o desconto de 5%
        }
        System.out.println("o valor do carro é: "+valorFinal);



    }
}




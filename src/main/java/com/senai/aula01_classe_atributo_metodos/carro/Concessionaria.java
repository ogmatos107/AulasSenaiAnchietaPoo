package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        Carro carro03 = new Carro();

        carro01.marca = " fiat";
        carro01.placa = " KCT1077";
        carro01.cor = " vermelho";
        carro01.precoBase = 100.00;
        carro01.portas = 4;
        carro01.anoFabricacao = 2016;

        carro01.verificarInformacoes();
        carro01.ligarCarro();
        carro01.testarSom();
        carro01.consultarPlaca();

        carro02.marca = " Chevrolet";
        carro02.placa = " KCT1088";
        carro02.cor = " amarelo";
        carro02.precoBase = 44.00;
        carro02.portas = 4;
        carro02.anoFabricacao = 2011;

        carro02.verificarInformacoes();
        carro02.ligarCarro();
        carro02.testarSom();
        carro02.consultarPlaca();

        carro03.marca = " Porshe";
        carro03.placa = " KCT1099";
        carro03.cor = " verde";
        carro03.precoBase = 500.00;
        carro03.portas = 2;
        carro03.anoFabricacao = 2018;

        carro03.verificarInformacoes();
        carro03.ligarCarro();
        carro03.testarSom();
        carro03.consultarPlaca();
    }
    }

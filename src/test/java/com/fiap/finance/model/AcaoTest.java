package com.fiap.finance.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fiap.finance.Model.Acao;

public class AcaoTest {

    @Test
    public void criarAcao_DeveDefinirSimboloEPrecoCorretamente(){

        //Arrange
        String simbolo = "AAPL";
        double preco = 120.0;

        //Act
        Acao acao = new Acao(simbolo, preco);

        //Assert
        assertEquals(simbolo, acao.getSimbolo());
        assertEquals(preco, acao.getPreco(), 0.01);
    }
    
}

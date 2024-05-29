package com.fiap.finance.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fiap.finance.Model.Acao;
import com.fiap.finance.Model.Carteira;

public class CarteiraTest {
    
    @Test
    public void adicionarAcao_DeveAdicionarAcaoNaCarteira(){
        List <Acao> acoes = Arrays.asList(
            new Acao("AAPL", 150.0),
            new Acao("GOOGL", 320.0));

            Carteira carteira = new Carteira("Carteira 1", acoes);

            Acao novAcao = new Acao("TSLA", 700.0);
            carteira.adicionarAcao(novAcao);

            assertEquals(3, carteira.getAcoes().size());
    
    }
    
}

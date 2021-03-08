/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleiro_Jogo.Peca;
import tabuleiro_Jogo.Tabuleiro;

/**
 *
 * @author Henrique
 */
public class PecaDeXadrez extends Peca{
    
    private Cor cor;

    public PecaDeXadrez(Cor cor, Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
    
    
}

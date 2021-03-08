/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.pecas;

import tabuleiro_Jogo.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

/**
 *
 * @author Henrique
 */
public class Rei extends PecaDeXadrez{
    
    public Rei(Cor cor, Tabuleiro tabuleiro) {
        super(cor, tabuleiro);
    }

    @Override
    public String toString() {
        return "R";
    }
}

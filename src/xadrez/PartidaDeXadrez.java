/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import java.awt.Color;
import tabuleiro_Jogo.Posicao;
import tabuleiro_Jogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/**
 *
 * @author Henrique
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDeXadrez() {
        
        tabuleiro = new Tabuleiro(8, 8);
        
        setUpInicial();
    }
    
    public PecaDeXadrez[][] getpecas() {
        
        PecaDeXadrez[][] partida = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                
                partida[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
            }
        }
        
        return partida;
    }
    
    private void setUpInicial() {
        
        tabuleiro.colocarPeca(new Torre(Cor.WHITE, tabuleiro), new Posicao(2, 1));
        
        tabuleiro.colocarPeca(new Rei(Cor.BLACK, tabuleiro), new Posicao(0, 4));
    }
}
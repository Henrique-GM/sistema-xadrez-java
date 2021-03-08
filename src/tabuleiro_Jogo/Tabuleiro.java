/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuleiro_Jogo;

/**
 *
 * @author Henrique
 */
public class Tabuleiro {
    
    private Integer linhas;
    private Integer colunas;
    private Peca[][] pecas;

    public Tabuleiro(Integer linhas, Integer colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public Integer getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }

    public Integer getColunas() {
        return colunas;
    }

    public void setColunas(Integer colunas) {
        this.colunas = colunas;
    }
    
    public Peca peca(Integer linhas, Integer colunas) {
        return pecas[linhas][colunas];
    } 
    
    public Peca peca(Posicao posicao) {
        return pecas[posicao.getFileira()][posicao.getColuna()];
    }
}

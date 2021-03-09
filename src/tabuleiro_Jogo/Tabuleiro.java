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
        if (linhas < 1 || colunas < 1) {           
            throw new TabuleiroExecao("Erro criando tabuleiro: È nescessário que aja pelo menos 1 linha e 1 coluna"); 
        }
    }

    public Integer getLinhas() {
        return linhas;
    }
    
    public Integer getColunas() {
        return colunas;
    }
    
    public Peca peca(Integer linha, Integer coluna) {
       
        if (!posicaoExistente(linha, coluna)) {           
            throw new TabuleiroExecao("Posição não encontrada no tabuleiro");
        }
        
        return pecas[linha][coluna];    
    } 
    
    public Peca peca(Posicao posicao) {
        
        if (!posicaoExistente(posicao)) {           
            throw new TabuleiroExecao("Posição não encontrada no tabuleiro");
        }
        
        return pecas[posicao.getFileira()][posicao.getColuna()];
    }
    
    public void colocarPeca(Peca peca, Posicao posicao) {
        
        if (haUmaPeca(posicao)) {               
            throw new TabuleiroExecao("Já existe uma peça nessa posição " + posicao);     
        }
        
        pecas[posicao.getFileira()][posicao.getColuna()] = peca;
        
        peca.posicao = posicao;
    }
    
    private boolean posicaoExistente(Integer linha, Integer coluna) {
        
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    
    public boolean posicaoExistente(Posicao posicao) {
        
        return posicaoExistente(posicao.getFileira(), posicao.getColuna());
    }
    
    public boolean haUmaPeca(Posicao posicao) {
        
        if (!posicaoExistente(posicao)) {           
            throw new TabuleiroExecao("Posição não encontrada no tabuleiro");
        }
        
        return peca(posicao) != null;
    }
}

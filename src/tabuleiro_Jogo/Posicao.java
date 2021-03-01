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
public class Posicao {
    
    private Integer fileira;
    private Integer coluna;

    public Posicao(Integer fileira, Integer coluna) {
        this.fileira = fileira;
        this.coluna = coluna;
    }

    public Integer getFileira() {
        return fileira;
    }

    public void setFileira(Integer fileira) {
        this.fileira = fileira;
    }

    public Integer getColuna() {
        return coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return  fileira + ", " + coluna;
    }
    
    
}

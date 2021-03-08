/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_xadrez;

import tabuleiro_Jogo.Tabuleiro;
import xadrez.PartidaDeXadrez;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        
        InterfaceUsuario.printTabuleiro(partidaDeXadrez.getpecas());
    }

}

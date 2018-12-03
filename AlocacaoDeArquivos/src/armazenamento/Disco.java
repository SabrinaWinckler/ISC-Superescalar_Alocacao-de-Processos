/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazenamento;

import gerais.Arquivo;

/**
 *
 * @author Sabrina Winckler
 */
public class Disco {
    private Arquivo [][] blocos;

    public Disco(int tamanho) {
        this.blocos = new Arquivo[tamanho][tamanho];
    }

    public Arquivo[][] getBlocos() {
        return blocos;
    }
    public void verificarArquivo(Arquivo arquivo){
        for (int i=0; i < blocos.length; i++) {
            for (int j=0; j < blocos[0].length; j++) {
                if(blocos[i][j] == null){
                    this.alocarArquivo(arquivo, i, j);
                }
            }
        }
    }
    
    private void alocarArquivo(Arquivo arquivo, int posicaoI, int posicaoJ){
        
    }
            
}

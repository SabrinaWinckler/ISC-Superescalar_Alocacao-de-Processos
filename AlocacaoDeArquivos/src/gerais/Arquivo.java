/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerais;

import java.util.Date;

/**
 *
 * @author Sabrina Winckler
 */
public class Arquivo {
    private String nome;
    private String diretorio;
    private Date dataCriacao;
    private int tamanho;

    public Arquivo(String nome, String diretorio, Date dataCriacao, int tamanho) {
        this.nome = nome;
        this.diretorio = diretorio;
        this.dataCriacao = dataCriacao;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

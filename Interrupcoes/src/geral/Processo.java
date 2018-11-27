package geral;

public class Processo {

    private final String nome;
    private final int tamanho;
    private final int tempoCheg;
    private int tempoExec;
    private int posicaoMemoria;  
    private int prioridade;
    private Metodo tipo;
    private boolean stop = false;

    public boolean isStop() {
        return stop;
    }

    public Metodo getTipo() {
        return tipo;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public Processo(String nome, int tamanho, int tempoCheg, int tempoExec, int prioridade, Metodo tipo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tempoExec = tempoExec;
        this.tempoCheg = tempoCheg;
        this.prioridade = prioridade;
        this.tipo = tipo; 
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void executar() {
        if (this.tempoExec >= 0) {
            this.tempoExec--;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoExec() {
        return tempoExec;
    }

    public int getTempoCheg() {
        return tempoCheg;
    }

    public int getPosicaoMemoria() {
        return posicaoMemoria;
    }

    public void setPosicaoMemoria(int posicaoMemoria) {
        this.posicaoMemoria = posicaoMemoria;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        Processo outroProcesso = (Processo) o;
        return this.nome.equals(outroProcesso.nome);
    }

}

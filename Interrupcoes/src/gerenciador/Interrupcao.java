/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import geral.InterProcessor;
import geral.Maskable;
import geral.Metodo;
import geral.NonMaskable;
import geral.Processo;
import geral.Software;
import java.util.ArrayList;


/**
 *
 * @author Sabrina Winckler
 */
public class Interrupcao {
    Metodo [] vetMetodo = new Metodo[4];
    ArrayList<Processo> listaProcessos;



    public Metodo[] getVetMetodo() {
        return vetMetodo;
    }

    public ArrayList<Processo> getListaProcessos() {
        return listaProcessos;
    }

    public Interrupcao() {
        this.listaProcessos = new ArrayList();
        definirMetodos();
    }

    public void addProcesso(Processo processo){
        listaProcessos.add(processo);
    }
    public void definirMetodos(){
        vetMetodo[0] = new Maskable();
        vetMetodo[1] = new NonMaskable();
        vetMetodo[2] = new Software();
        vetMetodo[3] = new InterProcessor();
    }
    
    public void bloquear(){
        for(int i = 1; i < listaProcessos.size(); i++){
            Processo atual = listaProcessos.get(i);
            Processo anterior = listaProcessos.get(i - 1);
            
           if(atual.getTipo() instanceof NonMaskable){ //anterior.getTipo() instanceof NonMaskable
               anterior.setStop(true);
           }
           
           if(atual.getTipo() instanceof Maskable){
                anterior.executar();
                atual.setStop(true);
           }
           
           if(atual.getTipo() instanceof Software){
               anterior.setStop(true);
           }
            
           if(atual.getTipo() instanceof InterProcessor){
               anterior.setStop(true);
           }
        }
    }
    public Processo desbloquear(Processo processo){
        Processo processoDesbloqueado = null;
        return processoDesbloqueado;
    }
}

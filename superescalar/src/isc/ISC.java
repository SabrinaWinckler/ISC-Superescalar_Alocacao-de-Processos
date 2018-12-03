/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sabri
 */
public class ISC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Instrucao instrucao = new Instrucao();
       HashMap<String, String> listaInstrucao = new HashMap<String, String>();
       listaInstrucao.put(instrucao.lw, "R1, O(R3)");   
       for(int i = 0; i<listaInstrucao.size(); i++){
           
       }
    }
    
}

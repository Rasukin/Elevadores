/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadores;

import Strategy.Contexto;
import Strategy.InterrupcionDestino;
import Strategy.StrategyInterrupcion;

/**
 *
 * @author rlian
 */
public class Elevadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new InterrupcionDestino());
        
        System.out.println(contexto.executeStrategy("hola"));
    }
    
}

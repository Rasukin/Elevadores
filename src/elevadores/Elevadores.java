/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadores;

import Strategy.*;

/**
 *
 * @author rlian
 */
public class Elevadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StrategyInterrupcion strategy = new StrategyInterrupcion(new InterrupcionDestino());
       
        System.out.println("Nombre de operacion: " + strategy.ejecutarStrategy("hola"));
    }
    
}
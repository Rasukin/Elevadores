/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author rlian
 */
public class StrategyInterrupcion {
    private StrategyInterrupciones strategy;
    
    public StrategyInterrupcion(StrategyInterrupciones funcion){
        strategy = funcion;
    }
    
    public String ejecutarStrategy(String interrupcion){
        return strategy.Interrupcion(interrupcion);
    }
}

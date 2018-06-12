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
public class Contexto {
    private StrategyInterrupcion strategy;
    
    public Contexto(StrategyInterrupcion funcion){
        strategy = funcion;
    }
    
    public int ejecutarStrategy(){
        return strategy.Interrupcion();
    }
}

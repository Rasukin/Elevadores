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
public class InterrupcionDestino implements StrategyInterrupciones{

    @Override
    public String Interrupcion(String interrupcion) {
        return "Interr.Destino";
    }
     
}

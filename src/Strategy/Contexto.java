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
    
    public Contexto(StrategyInterrupcion strategy){
      this.strategy = strategy;
   }

   public String executeStrategy(String caso){
      return strategy.Interrupcion(caso);
   }
}

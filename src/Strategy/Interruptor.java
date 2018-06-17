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
public class Interruptor {
    Contexto contexto;
    
    public Interruptor(){
    }
    
    public String interpretarInterrupcion(int interr){
        String result = "";
        switch(interr){
            case 0: 
                contexto = new Contexto(new InterrupcionLlamadaSubir());
                result = contexto.executeStrategy();
                break;
            case 1: 
                contexto = new Contexto(new InterrupcionLlamadaBajar());
                result = contexto.executeStrategy();
                break;
            case 2: 
                contexto = new Contexto(new InterrupcionDetener());
                result = contexto.executeStrategy();
                break;
            case 3: 
                contexto = new Contexto(new InterrupcionDestino());
                result = contexto.executeStrategy();
                break;
        }
        return result;
    }
}

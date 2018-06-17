/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Strategy.Interruptor;

/**
 *
 * @author rlian
 */
public class Despachador {
    Interruptor interruptor;
    
    public Despachador(){
        interruptor = new Interruptor();
    }
    
    public String asignarInterrupcion(String interr){
        String result = "";
        switch(interr){
            case "0": result = "Ascensor subiendo";
                //System.out.println("Ascensor subiendo");
                break;
            case "1": result = "Asncensor Bajando";
                //System.out.println("Ascensor bajando");
                break;
            case "2": result = "Ascendor detendio";
                //System.out.println("Ascensor deteniendo");
                break;
            case "3": result = "Ascensor pidio destino";
                //System.out.println("Ascensor pidio destino.");
                break;
        }
        return result;
    }
}

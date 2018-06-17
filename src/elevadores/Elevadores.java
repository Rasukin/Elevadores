/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadores;

import Controlador.ControladorVistaElevadores;
import Strategy.Contexto;
import Strategy.InterrupcionDestino;
import Strategy.Interruptor;
import Strategy.StrategyInterrupcion;
import java.util.concurrent.ThreadLocalRandom;
import logica.Despachador;

/**
 *
 * @author rlian
 */
public class Elevadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador.ControladorVistaElevadores controladorVistaPrincipal = new ControladorVistaElevadores();
        controladorVistaPrincipal.initInterface();
            
    }
}

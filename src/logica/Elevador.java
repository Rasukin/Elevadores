/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Builder.Panel;
import Builder.PanelBuilder;

/**
 *
 * @author rlian
 */
public class Elevador {
    public int id;
    public Panel panel;
    
    public Elevador(int pid){
        id = pid;
        panel = new PanelBuilder().crearPanelElevador();
    }
}

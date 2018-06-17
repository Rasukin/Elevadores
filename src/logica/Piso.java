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
public class Piso {
    public int id;
    public Panel panel;
    
    public Piso(int pid){
        id = pid;
        panel = new PanelBuilder().crearPanelPiso();
    }
}

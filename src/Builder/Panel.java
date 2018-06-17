/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rlian
 */
public class Panel {
    public List<Boton> listaBotones = new ArrayList<>();
    
    public void addBoton(Boton boton){
        listaBotones.add(boton);
    }
}

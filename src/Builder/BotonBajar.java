/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author rlian
 */
public class BotonBajar implements Boton{
    public boolean iluminado;
    
    public BotonBajar(){
        iluminado = false;
    }

    @Override
    public String nombre() {
        return "Bajar";
    }
}

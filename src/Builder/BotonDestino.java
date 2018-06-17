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
public class BotonDestino implements Boton{
    public String nombre;
    public boolean ilumindao;
    
    public BotonDestino(String nomb){
        nombre = nomb;
        ilumindao = false;
    }
    
    @Override
    public String nombre() {
        return nombre;
    }
}

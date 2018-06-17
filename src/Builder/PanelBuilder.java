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
public class PanelBuilder {
    
    public Panel crearPanelPiso(){
        Panel panelPiso = new Panel();
        panelPiso.addBoton(new BotonSubir());
        panelPiso.addBoton(new BotonBajar());
        return panelPiso;
    }
    
    public Panel crearPanelElevador(){
        Panel panelElevador = new Panel();
        for (int i = 1; i < 5; i++) {
            panelElevador.addBoton(new BotonDestino(String.valueOf(i)));
        }
        panelElevador.addBoton(new BotonDetener());
        panelElevador.addBoton(new BotonEmergencia());
        return panelElevador;
    }
}

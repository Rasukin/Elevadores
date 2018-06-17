/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Strategy.Interruptor;
import View.MainFrame;
import View.ViewElevadores;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import logica.Despachador;

/**
 *
 * @author rlian
 */
public class ControladorVistaElevadores implements ActionListener{
    private MainFrame mainFrame;
    private ViewElevadores vistaElevador;
    private static ControladorVistaElevadores controladorVistaElevador;
    
     public ControladorVistaElevadores(){
        mainFrame = new MainFrame();
        vistaElevador = new ViewElevadores();
        vistaElevador.btnSolicitud.addActionListener(this);
    }
     
     public void initInterface(){
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().add(vistaElevador);
        mainFrame.pack();
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaElevador.btnSolicitud == e.getSource()) {
            int randomNum;
            Despachador despachador = new Despachador();
            Interruptor interruptor = new Interruptor();

            for (int i = 0; i < 10; i++) {
                randomNum = ThreadLocalRandom.current().nextInt(0, 4);
                String interr = interruptor.interpretarInterrupcion(randomNum);
                vistaElevador.tbMensajes.append(despachador.asignarInterrupcion(interr) + "\n");
            }

        }
    }
}

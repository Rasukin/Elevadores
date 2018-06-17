/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import View.MainFrame;
import View.ViewElevadores;
import View.VistaPrincipal;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rlian
 */
public class ContoladorVistaPincipal implements ActionListener{
    private MainFrame mainFrame;
    private VistaPrincipal vistaPrincipal;
    private static ContoladorVistaPincipal controladorVistaPrincipal;
    
     public ContoladorVistaPincipal(){
        mainFrame = new MainFrame();
        vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.btnCorrer.addActionListener(this);
    }
     
     public void initInterface(){
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().add(vistaPrincipal);
        mainFrame.pack();
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaPrincipal.btnCorrer == e.getSource()) {
            Controlador.ControladorVistaElevadores controladorVistaPrincipal = new ControladorVistaElevadores();
            controladorVistaPrincipal.initInterface();
            String escribir = recolectarDatos();
            writeTxt(escribir);
        }
    }
    
    public void writeTxt(String str) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {

            String data = str;

            File file = new File("C:\\Users\\rlian\\Desktop\\configuracion.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(data);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

    }
    
    public String recolectarDatos(){
        String result = "Cantidad de pisos: "+vistaPrincipal.tf1.getText()+
                "\r\nCantidad de elevadores: "+vistaPrincipal.tf2.getText()+
                "\r\nProbabilidad por piso: "+vistaPrincipal.tf3.getText()+
                "\r\nProbabilidad de detenerse: "+vistaPrincipal.tf4.getText()+
                "\r\nProbabilidad de emergencia: "+vistaPrincipal.tf5.getText()+
                "\r\nUnit Time: "+vistaPrincipal.tf6.getText()+
                "\r\nCantidad de Personas: "+vistaPrincipal.tf7.getText();
        return result;
    }
}

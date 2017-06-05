/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import static java.awt.AWTEventMulticaster.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author alopezcobo
 */
public class InterfaceMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Interfaz23 obxV= new Interfaz23();
        obxV.crearMarcoGen();
        obxV.crearVentana1();
        //obxV.crearVentana2();
        
    }
    
}

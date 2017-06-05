/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alopezcobo
 */
public class Interfaz23 {
    
    public void crearMarcoGen(){
        
       JFrame marcog = new JFrame("marcog");
       marcog.setTitle("marcog");
       marcog.setBounds(0,0,1000,1000);
       marcog.setVisible(true);
       
    
}

    public void crearVentana1(){
       
       JFrame marcoVentana1 = new JFrame("marcoVentana1"); 
       marcoVentana1.setTitle("marcoVentana1");
       marcoVentana1.getContentPane().setBackground(Color.white);
       marcoVentana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marcoVentana1.setVisible(true);
       marcoVentana1.setLayout(null);
       marcoVentana1.setBounds(0,0,1000,499);
       
       JPanel Ventana1 = new JPanel();
       Ventana1.setBounds(50,50,950,450);
       Ventana1.setLayout(null);
       Ventana1.setVisible(true);
       
       
       JTextField Nome = new JTextField("Nome");
       Nome.setLayout(null);
       Nome.setBounds(200,100,250,150);
       Nome.setVisible(true);
       Ventana1.add(Nome);
       
       JTextField Pass = new JTextField("Pass");
       Pass.setLayout(null);
       Pass.setBounds(300,100,350,150);
       Pass.setVisible(true);
       Ventana1.add(Pass);
       
       JButton Premer = new JButton();
       Premer.setLayout(null);
       Premer.setBounds(200,250,300,300);
       Premer.setVisible(true);
       Ventana1.add(Premer);
       
       JButton Limpar = new JButton();
       Limpar.setLayout(null);
       Limpar.setBounds(400,250,300,500);
       Limpar.setVisible(true);
       Ventana1.add(Limpar);
       
    }
    public void crearVentana2(){
        
       JFrame marcoVentana2 = new JFrame("marcoVentana2"); 
       marcoVentana2.setTitle("marcoVentana2");
       marcoVentana2.getContentPane().setBackground(Color.white);
       marcoVentana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marcoVentana2.setVisible(true);
       marcoVentana2.setLayout(null);
       marcoVentana2.setBounds(0,501,1000,1000);
       JPanel Ventana2 = new JPanel();
       Ventana2.setBounds(50,50,950,450);
       Ventana2.setLayout(null);
       Ventana2.setVisible(true);
       JButton Premer = new JButton();
       Premer.setLayout(null);
       Premer.setBounds(200,250,300,300);
       JButton Limpar = new JButton();
       Limpar.setLayout(null);
       Limpar.setBounds(400,250,300,500);
        
    }
}
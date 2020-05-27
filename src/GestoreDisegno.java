package Ambiente1;

//
//  @ Project : Esercizio ambiente
//  @ File Name : GestoreDisegno.java
//  @ Date : 10/03/2020
//  @ Author : Mateoiu Edoardo Luca
//
//

import Ambiente1.Disegno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GestoreDisegno implements ActionListener {

    /**
     * <p>Metodo Disegna() che permette di creare il Frame del disegno</p>
     */
    public void Disegna() {
        JFrame f3 = new JFrame("Disegno");
        Container c = f3.getContentPane();
        Disegno d = new Disegno();
        c.add(d);
        f3.setSize(650, 270);
        f3.setLocation(200, 100);
        f3.setResizable(true);
        f3.setVisible(true);
    }

    /**
     * <p>Metodo actionPerformed() che ci permette tremite il bottone di visualizzare il Frame</p>
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        Disegna();
    }
}


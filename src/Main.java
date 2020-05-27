package Ambiente1;
//
//  La calsse Main ci permette di visualizzare i dati ed il grafico
//  di un file CSV contenente le temperature massime dal 2011 al 2130
//  @ Project : Esercizio Ambiente
//  @ File Name : Main.java
//  @ Date : 10/03/2020
//  @ Author : Mateoiu Edoardo Luca
//
//

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Ambiente"); //creazione del JFrame 


        JPanel p = new JPanel(new GridBagLayout()); //si utilizza il GridBagLayout()
        GridBagConstraints gbc = new GridBagConstraints(); //creazione gbc


       JButton b1 = new JButton("Visualizza dati"); //creazione di b1
        gbc.gridx = 0; //prima colonna
        gbc.gridy = 3; //terza riga
        p.add(b1, gbc); //inserimento nel p


        JButton b2 = new JButton("Visualizza grafico"); //creazione di b2
        gbc.gridx = 0; //prima colonna
        gbc.gridy = 5; //quinta riga
        p.add(b2, gbc);//inserimento nel p

        JComboBox jcb = new JComboBox();
        gbc.gridx = 0; //prima colonna
        gbc.gridy = 7; //settima riga
        p.add(jcb, gbc);//inserimento nel p

        jcb.addItem("2011-2040");
        jcb.addItem("2041-2070");
        jcb.addItem("2071-2100");
        jcb.addItem("2101-2130");

        JButton b3 = new JButton("Crea grafico"); //creazione di b3
        gbc.gridx = 0; //prima colonna
        gbc.gridy = 9; //nona riga
        p.add(b3, gbc);//inserimento nel p


        Visualizza v = new Visualizza(); //metodo Visualizza() che permette di visualizzare il testo
        b1.addActionListener(v); //ActionListener attribuito a b1

        GestoreDisegno gd = new GestoreDisegno(); //metodo GestoreDisegno() che permette di visualizzare il grafico
        b2.addActionListener(gd); //ActionListener attribuito a b1 e "ascolta" gli eventi tramite l'interfaccia ActionListener


        b3.addActionListener(new JCombo(p, jcb));

        f.setSize(300,300); //setteggio delle dimensioni del Frame f
        f.getContentPane().add(p);
        f.setVisible(true); //settaggio a true di setVisible()



    }


}

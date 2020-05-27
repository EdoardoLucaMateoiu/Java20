package Ambiente1;

//
//  @ Project : Esercizio ambiente
//  @ File Name : Visualizza.java
//  @ Date : 10/03/2020
//  @ Author : Mateoiu Edoardo Luca
//
//

import Ambiente1.TemperaturaAnni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class Visualizza implements  ActionListener{


    /**
     * <p>Metodo actionPerformed che permettera' di visualizzare i Dati</p>
     * @param e
     */
    public void actionPerformed(ActionEvent e) {


        JFrame f2 = new JFrame("Dati"); //creazione del frame
        JTextArea jtx = new JTextArea(); //creazione del JTextArea
        jtx.setEditable(false); //non è editabile
        f2.add(jtx); //aggiunge il JTextArea al frame
        f2.setSize(550, 370); //dimensioni
        f2.setResizable(false); //non permette di modificare dall'utente il Frame
        f2.setVisible(true); //visualizzabile


        leggiCSV("Tmax_stagionali_RCP4.5.csv", jtx); //utilizzo del metodo leggiCSV


    }

    /**
     * <p>Metodo leggiCSV che da un file CSV in input ci permette di leggerlo </p>
     * @param inputFile String
     * @param jtx JTextArea
     */
    static void leggiCSV(String inputFile, JTextArea jtx){
        String linea = "";
        String csvSplitBy = ";";
        String in = inputFile;



            try(BufferedReader br = new BufferedReader(new FileReader(in))){

                while((linea = br.readLine()) != null){

                    String[] temperaturaAnni = linea.split(csvSplitBy); //permette di separare le stringhe ogni volta che incontra un ; nella stringa

                    Vector<String> v = new Vector<String>(1); //dichiarazione di una Vector di stringhe
                    //permetterà di visualizzarlo nel Frame
                    TemperaturaAnni ta = new TemperaturaAnni(temperaturaAnni[0], temperaturaAnni[1], temperaturaAnni[2], temperaturaAnni[3], temperaturaAnni[4]); //creazione dell'oggetto ta
                    //permetterà di visualizzarlo nel cmd
                    v.addElement(temperaturaAnni[0]); //metodo addElement() che aggiunge un oggetto in fondo al vettore
                    v.addElement(temperaturaAnni[1]); //metodo addElement() che aggiunge un oggetto in fondo al vettore
                    v.addElement(temperaturaAnni[2]); //metodo addElement() che aggiunge un oggetto in fondo al vettore
                    v.addElement(temperaturaAnni[3]); //metodo addElement() che aggiunge un oggetto in fondo al vettore
                    v.addElement(temperaturaAnni[4]); //metodo addElement() che aggiunge un oggetto in fondo al vettore

                    System.out.println("contenuto del vettore: "+v); //permette di far visualizzare i dati nel CMD

                    jtx.append(ta.toString()); //utilizzo del metodo toString() e permette di concatenare le stinghe
                }


        }catch (IOException e){
            e.printStackTrace();
        }


    }

}

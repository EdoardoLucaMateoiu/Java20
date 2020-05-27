package Ambiente1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCombo implements ActionListener {

    private JPanel p;
    private JComboBox jc;


    public JCombo(JPanel p, JComboBox jc) {
        this.p = p;
        this.jc = jc;

    }

    public void Cartesiano() {
        JFrame f3 = new JFrame("2011-2040");
        Container c = f3.getContentPane();
        Cartesiano ca = new Cartesiano();
        c.add(ca);
        f3.setSize(500, 270);
        f3.setLocation(200, 100);
        f3.setResizable(false); //non permette di modificare dall'utente il Frame
        f3.setVisible(true); //visualizzabile
    }

    public void Cartesiano2() {
        JFrame f3 = new JFrame("2041-2070");
        Container c = f3.getContentPane();
        Cartesiano2 ca2 = new Cartesiano2();
        c.add(ca2);
        f3.setSize(500, 270);
        f3.setLocation(200, 100);
        f3.setResizable(false); //non permette di modificare dall'utente il Frame
        f3.setVisible(true); //visualizzabile
    }

    public void Cartesiano3() {
        JFrame f3 = new JFrame("2071-2100");
        Container c = f3.getContentPane();
        Cartesiano3 ca3 = new Cartesiano3();
        c.add(ca3);
        f3.setSize(500, 270);
        f3.setLocation(200, 100);
        f3.setResizable(false); //non permette di modificare dall'utente il Frame
        f3.setVisible(true); //visualizzabile
    }

    public void Cartesiano4() {
        JFrame f3 = new JFrame("2101-2130");
        Container c = f3.getContentPane();
        Cartesiano4 ca4 = new Cartesiano4();
        c.add(ca4);
        f3.setSize(500, 270);
        f3.setLocation(200, 100);
        f3.setResizable(false); //non permette di modificare dall'utente il Frame
        f3.setVisible(true); //visualizzabile
    }
    /**
     * <p>Metodo actionPerformed() che ci permette tremite il bottone di visualizzare il Frame</p>
     * @param e
     */
    public void actionPerformed(ActionEvent e) {


        String pulsante = e.getActionCommand();

        if(pulsante.equals("Crea grafico")){

            String s2 = (String) jc.getItemAt(jc.getSelectedIndex());

            switch (s2){
                case "2011-2040" :  Cartesiano(); break;
                case "2041-2070" : Cartesiano2(); break;
                case "2071-2100" : Cartesiano3(); break;
                case "2101-2130" : Cartesiano4(); break;
            }
        }

    }



    }



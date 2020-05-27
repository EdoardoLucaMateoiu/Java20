package Ambiente1;
//
//  @ Project : Esercizio ambiente
//  @ File Name : Disegno.java
//  @ Date : 10/03/2020
//  @ Author : Mateoiu Edoardo Luca
//
//

import javax.swing.*;
import java.awt.*;

public class Disegno extends Canvas{

    public void paint(Graphics g) {


        g.setColor(Color.gray); //permette di settare il colore
        g.drawRect(30, 200, 100, 45); //disegna un rettangolo
        g.fillRect(30,200,100,45); //colora il rettangolo internamente

        g.setColor(Color.red); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("Rosso = Inverno", 30, 210); //disegna la stringa

        g.setColor(Color.yellow);//permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("Giallo = Primavera", 30, 220); //disegna la stringa

        g.setColor(Color.green);//permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("Verde = Estate", 30, 230); //disegna la stringa

        g.setColor(Color.blue); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("Blu = Autunno", 30, 240); //disegna la stringa



        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("2011-2040", 75, 20); //disegna la stringa

        g.setColor(Color.red); //permette di settare il colore
        g.drawRect(30, 150, 30, 30);  //disegna un rettangolo
        g.fillRect(30,150,30,30); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("7.0", 35, 140); //disegna la stringa
        g.setColor(Color.yellow); //permette di settare il colore
        g.drawRect(60, 120, 30, 60); //disegna un rettangolo
        g.fillRect(60,120,30,60); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("18.3", 65, 110); //disegna la stringa
        g.setColor(Color.green); //permette di settare il colore
        g.drawRect(90, 60, 30, 120); //disegna un rettangolo
        g.fillRect(90,60,30,120); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("29.0", 95, 50); //disegna la stringa
        g.setColor(Color.blue); //permette di settare il colore
        g.drawRect(120, 115, 30, 65); //disegna un rettangolo
        g.fillRect(120,115,30,65); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("19.1", 125, 105); //disegna la stringa

        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("2041-2070", 225, 20); //disegna la stringa

        g.setColor(Color.red); //permette di settare il colore
        g.drawRect(180, 145, 30, 35); //disegna un rettangolo
        g.fillRect(180,145,30,35); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("8.2", 185, 135); //disegna la stringa
        g.setColor(Color.yellow); //permette di settare il colore
        g.drawRect(210, 115, 30, 65); //disegna un rettangolo
        g.fillRect(210,115,30,65); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("18.7", 215, 105); //disegna la stringa
        g.setColor(Color.green); //permette di settare il colore
        g.drawRect(240, 55, 30, 125); //disegna un rettangolo
        g.fillRect(240,55,30,125); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("31.9", 245, 45); //disegna la stringa
        g.setColor(Color.blue); //permette di settare il colore
        g.drawRect(270, 110, 30, 70); //disegna un rettangolo
        g.fillRect(270,110,30,70); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("20.1", 275, 100); //disegna la stringa


        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("2071-2100", 375, 20); //disegna la stringa



        g.setColor(Color.red); //permette di settare il colore
        g.drawRect(330, 140, 30, 40); //disegna un rettangolo
        g.fillRect(330,140,30,40); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("8.8", 340, 130); //disegna la stringa
        g.setColor(Color.yellow); //permette di settare il colore
        g.drawRect(360, 110, 30, 70); //disegna un rettangolo
        g.fillRect(360,110,30,70); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("19.2", 365, 100); //disegna la stringa
        g.setColor(Color.green); //permette di settare il colore
        g.drawRect(390, 50, 30, 130); //disegna un rettangolo
        g.fillRect(390,50,30,130); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("32.2", 395, 40); //disegna la stringa
        g.setColor(Color.blue); //permette di settare il colore
        g.drawRect(420, 105, 30, 75); //disegna un rettangolo
        g.fillRect(420,105,30,75); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("21.2", 425, 95); //disegna la stringa


        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("2101-2130", 525, 20); //disegna la stringa

        g.setColor(Color.red); //permette di settare il colore
        g.drawRect(480, 135, 30, 45); //disegna un rettangolo
        g.fillRect(480,135,30,45); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("9.8", 485, 125); //disegna la stringa
        g.setColor(Color.yellow); //permette di settare il colore
        g.drawRect(510, 105, 30, 75); //disegna un rettangolo
        g.fillRect(510,105,30,75); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("20.2", 515, 95); //disegna la stringa
        g.setColor(Color.green); //permette di settare il colore
        g.drawRect(540, 45, 30, 135); //disegna un rettangolo
        g.fillRect(540,45,30,135); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("33.2", 545, 35); //disegna la stringa
        g.setColor(Color.blue); //permette di settare il colore
        g.drawRect(570, 100, 30, 80); //disegna un rettangolo
        g.fillRect(570,100,30,80); //colora il rettangolo internamente
        g.setColor(Color.black); //permette di settare il colore
        g.setFont(new Font("Dialog", Font.BOLD, 9)); //permette di settare il Font
        g.drawString("22.2", 575, 90); //disegna la stringa


    }


}

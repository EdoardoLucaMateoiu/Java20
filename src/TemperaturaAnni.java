package Ambiente1;


//
//  @ Project : Esercizio ambiente
//  @ File Name : TemperaturaAnni.java
//  @ Date : 10/03/2020
//  @ Author : Mateoiu Edoardo Luca
//
//

import javax.swing.text.Element;

public class TemperaturaAnni {

//---------------------------Attributi--------------------------------------

    public String Anni;
    public String Inverno;
    public String Primavera;
    public String Estate;
    public String Autunno;

//--------------------------Costruttore-------------------------------------

    /**
     * <p>Metodo costruttore</p>
     * @param anni
     * @param inverno
     * @param primavera
     * @param estate
     * @param autunno
     */
    public TemperaturaAnni(String anni, String inverno, String primavera, String estate, String autunno){

        Anni = anni;
        Inverno = inverno;
        Primavera = primavera;
        Estate = estate;
        Autunno = autunno;


    }

//-----------------------------------Get---------------------------

    /**
     * Metodo getAnni() e ritorna Anni
     * @return Anni
     */
    public String getAnni(){
        return Anni;
    }
    /**
     * Metodo getInverno() e ritorna Inverno
     * @return Inverno
     */
    public String getInverno(){
        return Inverno;
    }
    /**
     * Metodo getPrimavera() e ritorna Primavera
     * @return Primavera
     */
    public String getPrimavera(){
        return Primavera;
    }
    /**
     * Metodo getEstate() e ritorna Estate
     * @return Estate
     */
    public String getEstate(){
        return Estate;
    }
    /**
     * Metodo getAutunno() e ritorna Autunno
     * @return Autunno
     */
    public String getAutunno(){
        return Autunno;
    }

//-----------------------------------Set---------------------------
    /**
     * <p>Metodo setAnni che imposta anni</p>
     * @param anni
     */
    public void setAnni(String anni){
        Anni = anni;
    }

    /**
     * <p>Metodo setInverno che imposta inverno</p>
     * @param inverno
     */
    public void setInverno(String inverno){
        Inverno = inverno;
    }

    /**
     * <p>Metodo setPrimavera che imposta primavera</p>
     * @param primavera
     */
    public void setPrimavera(String primavera){
        Primavera = primavera;
    }

    /**
     * <p>Metodo setEstate che imposta estate</p>
     * @param estate
     */
    public void setEstate(String estate){
        Estate = estate;
    }

    /**
     * <p>Metodo setAutunno che imposta autunno</p>
     * @param autunno
     */
    public void setAutunno(String autunno){
        Autunno = autunno;
    }

//-----------------------------------toString----------------------------
    /**
     * <p>Crea la stringa che sara' una rappresentazione testuale dell'oggetto</p>
     * @return String string
     */
    public String toString(){

        String string = "";

        string += "Anni: " + Anni + "\n";
        string += "Temperatura massima media invernale: " + Inverno + " gradi\n";
        string += "Temperatura massima media primaverile: " + Primavera + " gradi\n";
        string += "Temperatura massima media estvia: " + Estate + " gradi\n";
        string += "Temperatura massima media autunnale: " + Autunno + " gradi\n";



        return string;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Electrico extends Carros{
    private int coeficiente;
    private int canti_motor;
    private int tiempo_recarga;

    public Electrico(int coeficiente, int canti_motor, int tiempo_recarga) {
        this.coeficiente = coeficiente;
        this.canti_motor = canti_motor;
        this.tiempo_recarga = tiempo_recarga;
    }

    public Electrico(int coeficiente, int canti_motor, int tiempo_recarga, String marca, String modelo, int vin, String carroceria) {
        super(marca, modelo, vin, carroceria);
        this.coeficiente = coeficiente;
        this.canti_motor = canti_motor;
        this.tiempo_recarga = tiempo_recarga;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getCanti_motor() {
        return canti_motor;
    }

    public void setCanti_motor(int canti_motor) {
        this.canti_motor = canti_motor;
    }

    public int getTiempo_recarga() {
        return tiempo_recarga;
    }

    public void setTiempo_recarga(int tiempo_recarga) {
        this.tiempo_recarga = tiempo_recarga;
    }

    @Override
    public String toString() {
        return super.toString()+" , Tipo: Electrico";
    }
    
}

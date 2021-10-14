/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectocongit;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Caballo {
    private String color;
    private String raza;
    private Integer edad;
    private String tamaño;

    public Caballo(String color, String raza, Integer edad, String tamaño) {
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public Caballo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author amado
 */
public class Equinos {
    //creamos los atributos de la clase equinos
    private String nombre;
    private String sexo;
    private int edad;
    private String pelaje;

    public Equinos(String nombre, String sexo, int edad, String pelaje) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.pelaje = pelaje;
    }

    // Recuperamos los datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    
}

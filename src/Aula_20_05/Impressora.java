/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_20_05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asamado
 */
public abstract class Impressora {

    /**
     *
     */
    //protected static List<Impressora> totalImpressoras = new ArrayList<>();

    //variváveis da classe pai são sempre protected?
    protected String marca;
    protected String modelo;
    protected double peso;
    protected boolean colorida;

    public Impressora(String marca, String modelo, double peso, boolean colorida) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.colorida = colorida;

    }

    public abstract String getMarca();

    public abstract void setMarca(String marca);

    public abstract String getModelo();

    public abstract void setModelo(String modelo);

    public abstract double getPeso();

    public abstract void setPeso(double peso);

    public abstract boolean isColorida();

    public abstract void setColorida(boolean colorida);

}

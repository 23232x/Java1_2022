/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_20_05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author asamado
 */
public class Laser extends Impressora {

    //list das lasers
    protected static List<Laser> lasers = new ArrayList<>();

    //Iterator
    protected static Iterator<Laser> it = lasers.iterator();

    private double capacidadeToner;
    private boolean freteVerso;

    public Laser(double capacidadeToner, boolean freteVerso, String marca, String modelo, double peso, boolean colorida) {
        super(marca, modelo, peso, colorida);
        this.capacidadeToner = capacidadeToner;
        this.freteVerso = freteVerso;
    }

    //
    public double getCapacidadeToner() {
        return capacidadeToner;
    }

    public void setCapacidadeToner(double capacidadeToner) {
        this.capacidadeToner = capacidadeToner;
    }

    public boolean isFreteVerso() {
        return freteVerso;
    }

    public void setFreteVerso(boolean freteVerso) {
        this.freteVerso = freteVerso;
    }

    //métoos subscritos
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean isColorida() {
        return colorida;
    }

    @Override
    public void setColorida(boolean colorida) {
        this.colorida = colorida;
    }

    public static void MostraMenuLaser() {
        String Str_freteVerso;
        boolean bool_frenteVerso;
        String[] choices = {"s", "n"};

        //Marca da impressora Laser
        String marca = JOptionPane.showInputDialog(null, "Digite a marca da impressora: ");

        //Modelo da impressora Laser
        String modelo = JOptionPane.showInputDialog("Digite o Modelo: ");

        //Peso da impressora Laser
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso:"));

        //Se a impressora laser imprime Frente e Verso.
        Str_freteVerso = (String) JOptionPane.showInputDialog(null, "Duplex?...",
                "Imprime frente e Verso (S/N)", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[1]); // Initial choice

        //Faz a conversão de String para booleaan - Se imprime Frente e Verso ou não
        bool_frenteVerso = Boolean.valueOf(Str_freteVerso);

        String Str_colorido;
        Str_colorido = (String) JOptionPane.showInputDialog(null, "Colorido?...",
                "Imprime Colorido (S/N)", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[1]); // Initial choice

        boolean bool_colorido;
        bool_colorido = Boolean.valueOf(Str_colorido);

        double tonerCapaci = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do toner:"));

        Laser laser = new Laser(peso, bool_frenteVerso, marca, modelo, peso, bool_colorido);

        //adiciona o objeto criado ao ArryList;
        Laser.lasers.add(laser);
       // totalImpressoras.add(laser);

    }

    //iterator
    public static void lista_Impresoras_Lasers() {

        while (it.hasNext()) {
            Laser laser = it.next();

            JOptionPane.showMessageDialog(null, "Impressoras Lasers \n"
                    + "Marca: " + laser.getMarca()
                    + "Modelo: " + laser.getModelo()
                    + "Peso: " + laser.getPeso()
                    + "Imprime Colorido: " + laser.isColorida()
                    + "Imprime Frente e Verso: " + laser.isFreteVerso()
                    + "Capacidade do toner: " + laser.getCapacidadeToner()
            );
        }
    }
}

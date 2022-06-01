/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_20_05;

import static Aula_20_05.Laser.lasers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author asamado
 */
public class Matricial extends Impressora {

    //lista das matriciais
    protected static List<Matricial> matriciais = new ArrayList<>();

//iterator
    Iterator<Matricial> it = matriciais.iterator();

    private int numAgulhas;
    private boolean imprimeVias;

    public Matricial(int numAgulhas, boolean imprimeVias, String marca, String modelo, double peso, boolean colorida) {
        super(marca, modelo, peso, colorida);
        this.numAgulhas = numAgulhas;
        this.imprimeVias = imprimeVias;
    }

    //
    public int getNumAgulhas() {
        return numAgulhas;
    }

    public void setNumAgulhas(int numAgulhas) {
        this.numAgulhas = numAgulhas;
    }

    public boolean isImprimeVias() {
        return imprimeVias;
    }

    public void setImprimeVias(boolean imprimeVias) {
        this.imprimeVias = imprimeVias;
    }

    /////métoos subscritos
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

    //Exibe o menu de opções da impressora Matricial
    public static void MostraMenuMatricial() {

        String marca, modelo, colorido, vias;
        double peso;
        int qtdAgulhas;

        boolean cor, via;

        String[] choices = {"s", "n"};

        marca = JOptionPane.showInputDialog(null, "Digite a marca da impressora: ");

        modelo = JOptionPane.showInputDialog("Digite o Modelo: ");

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso:"));

        colorido = (String) JOptionPane.showInputDialog(null, "Colorido?...",
                "Imprime Colorido (S/N)", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[1]); // Initial choice
        cor = Boolean.valueOf(colorido);

        System.out.println("cor = " + cor);
        /*
        if (!(cor = true)) {
            colorido = "sim";
        } else {
            colorido = "não";
        }*/
        //-------

        vias = (String) JOptionPane.showInputDialog(null, "vias?...",
                "Imprime Vias (S/N)", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[1]); // Initial choice
        via = Boolean.valueOf(vias);

        //quantidade de agulhas
        qtdAgulhas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de agulhas:"));

        Matricial matricial = new Matricial(qtdAgulhas, via, marca, modelo, peso, cor);
        Matricial.matriciais.add(matricial);

    }

    
    public static void lista_Impresoras_Matriciais() {
        
        

    }

}

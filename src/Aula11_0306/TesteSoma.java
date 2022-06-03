/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11_0306;

/**
 *
 * @author asamado
 */
public class TesteSoma {

    public static void main(String[] args) {

        Soma soma = new Soma();
        System.out.println("Soma dois inteiros " + soma.Soma(10, 20));

        System.out.println("Soma de dois Double " +  soma.Soma(1.4,1.2));

        System.out.println("Soma duas Strings " + soma.Soma("2", "4"));

    }

}

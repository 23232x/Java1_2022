/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11_0306;

/**
 *
 * @author Marcio
 */
public class Secretaria extends EmpregadoExemplo {

    public static void main(String args[]) {
        Secretaria sec = new Secretaria();
        sec.setSalario(22, 10.00);
        System.out.println(sec.getSalario());
    }
}

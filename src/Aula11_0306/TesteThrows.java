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
public class TesteThrows {

    public static void main(String args[]) {

        try {
            new TesteThrows().divisao(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Deu erro " + e);
        }
    }

    public void divisao(int d1, int d2) throws ArithmeticException {
        System.out.println("Divisao: " + d1 / d2);
    }
}
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
import java.text.NumberFormat;

public class Formata2 {

  //formatação de numeros de acordo com a configuração regional da máquina(computador)
    public static void main(String[] args) {
        double n[] = {523.34, 54344.23, 95845.223, 1084.895};
        NumberFormat z = NumberFormat.getCurrencyInstance();
        for (int a = 0; a < n.length; a++) {
            if (a != 0) {
                System.out.print(", ");
            }
            System.out.print(z.format(n[a]));
        }
        System.out.println();
    }
}

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
import java.text.DecimalFormat;

public class DecimalFormatMask {

    public static void main(String args[]) {
        double valor = 99991045;
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println(df.format(valor));
        df = new DecimalFormat("###,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("#,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("$#,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("###.##;(-###.##)");
        System.out.println(df.format(valor - 99991500.54));
    }
}

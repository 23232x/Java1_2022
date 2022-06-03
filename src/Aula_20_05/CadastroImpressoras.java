/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_20_05;

import javax.swing.JOptionPane;

/**
 *
 * @author asamado
 */
public class CadastroImpressoras {

    public static void main(String[] args) {

        int switcher_cadastro, switcher_consulta;
        int switcher_menu = 0;

        do {

            //Menu de cadastro principal
            switcher_menu = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções: "
                    + "\n 1 - Cadastrar Impressoras"
                    + "\n 2 - Consultar Impressoras"
                    + "\n 3 - Sair"
            ));

            //submenu de cadastro
            if (switcher_menu == 1) {

                do {

                    switcher_cadastro = Integer.parseInt(JOptionPane.showInputDialog("Menu cadastro Impressoras: "
                            + "\n 1 - Matricial"
                            + "\n 2 - Laser"
                            + "\n 3 - Sair"
                    ));

                    if (switcher_cadastro == 1) {
                        Matricial.MostraMenuMatricial();
                        
                    } else if (switcher_cadastro == 2) {
                        Laser.MostraMenuLaser();
                    }
                } while (switcher_cadastro != 3);

            } else if (switcher_menu == 2) {
                //Consultar Impressoras

                do {
                    switcher_consulta = Integer.parseInt(JOptionPane.showInputDialog("Consulta Impressoras: "
                            + "\n 1 - Consultar Matricial"
                            + "\n 2 - Consultar Laser"
                            + "\n 3 - Todas Impressoras"
                            + "\n 4 - Sair"
                    ));

                    switch (switcher_consulta) {
                        case 1:

                            Matricial.lista_Impresoras_Matriciais();
                            break;
                        case 2:

                            Laser.lista_Impresoras_Lasers();
                            break;
                        case 3:
                            Matricial.lista_Impresoras_Matriciais();
                            Laser.lista_Impresoras_Lasers();
                            break;
                        default:
                    }
                } while (switcher_consulta != 4);
            }
        } while (switcher_menu != 3);
    }
}

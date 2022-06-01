/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asamado
 */
//%d numeros decimais; %.2f -> float ou double
public class CaixaEletronico {

    public static void main(String[] args) {

        int switcher = 0;

        Conta conta = null;

        int conta_contator = 0;

        do {

            switcher = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções: "
                    + "\n 1 - Criar conta Corrente"
                    + "\n 2 - Movimentar Conta"
                    + "\n 3 - Listar Contas"
                    + "\n 4 - Sair"
            ));

            //***** MENU CRIAÇÃO DE CONTA ******
            if (switcher == 1) {

                String nome;
                double depo_inicial;
                int num_conta;

                nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente");

                depo_inicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito inicial: "));

                //gera o numero de conta com 4 dígitos
                Random random = new Random();
                num_conta = random.nextInt(4);

                //adiciona o deposito inicial ao saldo;
                conta = new Conta(nome, depo_inicial, num_conta);
                Conta.contas.add(conta);

                conta_contator++;

                JOptionPane.showMessageDialog(null, "A conta de " + conta.getCliente_nome() + ", "
                        + " numero: " + conta.getNum_conta() + " Tem saldo de " + conta.getSaldo_total() + " Criada com sucesso"
                );

// ***** MENU- MOVIMENTAÇÃO *******
            } else if (switcher == 2) {

                //variável que armazena a conta digitada pelo usuário para movimentaçao.
                int conta_movimentacao = 0;
                boolean found = false;

                conta_movimentacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a conta a ser movimentada: "));

                for (Conta e : Conta.contas) {

                    if (e.getNum_conta() == conta_movimentacao) {
                        found = true;
                        conta.MostrarMenu(conta_movimentacao);

                    }

                }

            } else if (switcher == 3) {
                if (conta.contas == null) {
                    JOptionPane.showMessageDialog(null, "Não existe contas cadastradas neste banco");
                } else {
                    JOptionPane.showMessageDialog(null, conta_contator);
                }

            }

        } while (switcher != 4);

    }

}

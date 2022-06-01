/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author asamado
 */
public class Conta {

    static List<Conta> contas = new ArrayList();
    private String cliente_nome;
    private double depo_inicial;
    private double saldo;
    // numero da conta deve ser de 4 digitos;
    private int num_conta;
    private double limite;
    private double saldo_total = limite + saldo;
    //construtore

    public Conta(String nomes, double depo_inicial, int num_conta) {
        this.cliente_nome = nomes;
        this.saldo += depo_inicial;
        this.num_conta = num_conta;
        this.limite = 1000;
        saldo_total = limite + saldo;

    }

    public Conta() {
    }

    //getters and settters
    public double getSaldo_total() {
        return saldo_total;
    }

    public void setSaldo_total(double saldo_total) {
        this.saldo_total = saldo_total;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public double getDepo_inicial() {
        return depo_inicial;
    }

    public void setDepo_inicial(double depo_inicial) {
        this.depo_inicial = depo_inicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    /// ****** EXIBINDO MENU PRNCIPAL
    public void MostrarMenu(int contaID) {

        //aqui vai mostrar o menu sacar depositar
        int switcher;
        do {
            switcher = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções: "
                    + "\n 1 - Sacar."
                    + "\n 2 - Depositar"
                    + "\n 3 - Extrato"
                    + "\n 4 - Sair"
            ));

            if (switcher == 1) {
                double valor_saque;
                valor_saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar"));
                Saca(valor_saque);

            } else if (switcher == 2) {

                double valor_deposito;
                valor_deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para depósito:"));
                Deposita(valor_deposito);

            } else if (switcher == 3) {

                for (Conta e : contas) {

                    if (e.getNum_conta() == contaID) {
                        System.out.println("Cliente:" + e.getCliente_nome());
                        System.out.println("Numero da conta: " + e.getNum_conta());
                        System.out.println("Saldo :" + e.getSaldo_total());
                        System.out.println("Limite de saque Diário: " + e.getLimite());

                    }

                }
            }
        } while (switcher != 4);

    }

    public void Saca(double valor_saque) {
        if (valor_saque <= saldo_total) {
            JOptionPane.showMessageDialog(null, " Saque realizado com sucesso ");

            saldo_total = saldo_total - valor_saque;

        } else {
            JOptionPane.showMessageDialog(null, " Não há limite disponível!");

        }

    }

    public void Deposita(double valor) {
        this.saldo_total += valor;
    }

}

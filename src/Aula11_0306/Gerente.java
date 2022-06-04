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
public class Gerente extends EmpregadoExemplo {

    private double bonus = .15;

    public static void main(String args[]) {
        Gerente g = new Gerente();
        g.setSalario(22, 35.00);
        System.out.println(g.getSalario());
    }
 
    @Override
    public double getSalario(){
        return super.getSalario()
                +super.getSalario()*bonus;
    }
 
}
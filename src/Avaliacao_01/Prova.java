/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliacao_01;

import java.util.Scanner;

/**
 *
 * @author asamado
 */
public class Prova {

    public static void main(String[] args) {

        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("1 – Cadastro de Jogadores.\n"
                    + "\n"
                    + "2 – Lista Time do Inter.\n"
                    + "\n"
                    + "3 – Lista Time do Grêmio.\n"
                    + "\n"
                    + "4 – Lista Todos os Jogadores.\n"
                    + "\n"
                    + "5 – Sair." + "\n");
            opcao = Integer.parseInt(leitura.nextLine());

            if (opcao == 1) {

                Jogador jogador = new Jogador();

                //time
                System.out.print("Digite o time a ser cadastrado: \n ");
                jogador.time = leitura.nextLine();

                //nome
                System.out.print("Digite seu nome: ");
                jogador.nome = leitura.nextLine();

                //idade
                System.out.println("Digite sua idade: ");
                jogador.idade = leitura.nextLine();

                //peso
                System.out.println("Digite seu peso: ");
                jogador.peso = leitura.nextLine();

                //altura
                System.out.println("Digite sua altura: ");
                jogador.altura = leitura.nextLine();

                //posicao
                System.out.println("Digite sua posição: ");
                jogador.posicao = leitura.nextLine();
                Jogador.lista.add(jogador);

            } else if (opcao == 2) {
                System.out.println("Listando Jogadores do time do Internacional");

                for (Jogador a : Jogador.lista) {

                    if (a.time.equals("internacional")) {
                        System.out.println("Nome : " + a.nome);
                        System.out.println("Idade : " + a.idade);
                        System.out.println("Peso: " + a.peso);
                        System.out.println("Altura: " + a.altura);
                        System.out.println("Posicao: " + a.posicao);
                        System.out.println("-------------------------------------");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Listando Jogadores do time do Grêmio");

                for (Jogador a : Jogador.lista) {
                    if (a.time.equals("gremio")) {
                        System.out.println("Nome : " + a.nome);
                        System.out.println("Idade : " + a.idade);
                        System.out.println("Peso: " + a.peso);
                        System.out.println("Altura: " + a.altura);
                        System.out.println("Posicao: " + a.posicao);
                        System.out.println("-------------------------------------");
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Listando todos o Jogadores");
                for (Jogador a : Jogador.lista) {
                    System.out.println("Nome : " + a.nome);
                    System.out.println("Idade : " + a.idade);
                    System.out.println("Peso: " + a.peso);
                    System.out.println("Altura: " + a.altura);
                    System.out.println("Posicao: " + a.posicao);
                    System.out.println("-------------------------------------");
                }

            } else {
                System.out.println("Opcao inválida");
                break;
            }

        } while (opcao != 5);

    }

}

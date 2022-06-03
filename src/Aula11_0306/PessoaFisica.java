/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11_0306;

/**
 *
 * @author asamado
 */
public class PessoaFisica extends Pessoa implements Mamifero{

    public PessoaFisica(String nome) {
        super(nome);
    }

    public int getCodPessoa() {
        return codPessoa;
    }

    @Override
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getQtdPernas() {
      return 2;
    }

    
    
}
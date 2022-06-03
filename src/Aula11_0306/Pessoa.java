/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11_0306;

/**
 *
 * @author asamado
 */
public abstract class Pessoa {
     protected int codPessoa;
     protected String nome;
     protected int idade;
    
     public Pessoa(String nome){
         this.nome = nome;
     }
     public abstract String getNome();  
     public abstract void setCodPessoa(int codigo);
     public abstract int getIdade();
    public abstract void setIdade(int idade);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemadejosephus;
import java.util.ArrayList;
/**
 *
 * @author Nyta
 */
public class Pessoas {
    private ArrayList<Pessoa> listaDePessoas;

    public Pessoas() {
        listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa(1, "Ana", "(01)0101-0101", "Rua 1, numero 1, Centro", "010.010.010-01"));
        listaDePessoas.add(new Pessoa(2, "Bruno", "(22)2222-2222", "Avenida 2, numero 2, Centro", "222.222.222-22"));
        listaDePessoas.add(new Pessoa(3, "Claudia", "(33)3333-3333", "Rua 3, numero 3, Centro", "333.333.333-33"));
        listaDePessoas.add(new Pessoa(4, "Diego", "(44)4444-4444", "Avenida 4, numero 4, Centro", "444.444.444-44"));
        listaDePessoas.add(new Pessoa(5, "Erica", "(55)5555-5555", "Rua 5, numero 5, Centro", "555.555.555-55"));
        listaDePessoas.add(new Pessoa(6, "Fernando", "(66)6666-6666", "Avenida 6, numero 6, Centro", "666.666.666-66"));
        listaDePessoas.add(new Pessoa(7, "Gabriela", "(77)7777-7777", "Rua 7, numero 7, Centro", "777.777.777-77"));
        listaDePessoas.add(new Pessoa(8, "Henrique", "(88)8888-8888", "Avenida 8, numero 8, Centro", "888.888.888-88"));
        listaDePessoas.add(new Pessoa(9, "Isabela", "(99)9999-9999", "Rua 9, numero 9, Centro", "999.999.999-99"));
        listaDePessoas.add(new Pessoa(10, "Joao", "(10)1010-1010", "Avenida 10, numero 10, Centro", "101.101.101-10"));
        listaDePessoas.add(new Pessoa(11, "Karla", "(11)1111-1111", "Rua 11, numero 11, Centro", "111.111.111-11"));
        listaDePessoas.add(new Pessoa(12, "Leonardo", "(12)1212-1212", "Avenida 12, numero 12, Centro", "121.121.121-12"));
        listaDePessoas.add(new Pessoa(13, "Marina", "(13)1313-1313", "Rua 13, numero 13, Centro", "131.131.131-13"));
        listaDePessoas.add(new Pessoa(14, "Nelson", "(14)1414-1414", "Avenida 14, numero 14, Centro", "141.141.141-14"));
        listaDePessoas.add(new Pessoa(15, "Otilia", "(15)1515-1515", "Rua 15, numero 15, Centro", "151.151.151-15"));
        listaDePessoas.add(new Pessoa(16, "Paulo", "(16)1616-1616", "Avenida 16, numero 16, Centro", "161.161.161-16"));
        listaDePessoas.add(new Pessoa(17, "Quenia", "(17)1717-1717", "Rua 17, numero 17, Centro", "171.171.171-17"));
        listaDePessoas.add(new Pessoa(18, "Reinaldo", "(18)1818-1818", "Avenida 18, numero 18, Centro", "181.181.181-18"));
        listaDePessoas.add(new Pessoa(19, "Sara", "(19)1919-1919", "Rua 19, numero 19, Centro", "191.191.191-19"));
        listaDePessoas.add(new Pessoa(20, "Tiago", "(20)2020-2020", "Avenida 20, numero 20, Centro", "202.202.202-20"));
    }

    public ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public int encontrarSobrevivente(int m) {
        int n = listaDePessoas.size();
        int indice = 0;

        while (n > 1) {
            // Calculamos o índice para evitar que ele seja maior que o tamanho da lista
            indice = (indice + m - 1) % n;
            
            // Removemos a pessoa da lista
            listaDePessoas.remove(indice);
            n--;
        }

        return listaDePessoas.get(0).getNumero();
    }

    public class Pessoa {
        private int numero;
        private String nome;
        private String telefone;
        private String endereco;
        private String cpf;

        public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
            this.numero = numero;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.cpf = cpf;
        }

        public int getNumero() {
            return numero;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getCpf() {
            return cpf;
        }
    }
}

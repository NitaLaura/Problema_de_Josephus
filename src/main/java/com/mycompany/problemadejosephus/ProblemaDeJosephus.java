/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemadejosephus;
import javax.swing.JOptionPane;
/**
 *
 * @author Nyta
 */
public class ProblemaDeJosephus {

    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();

        String mInput = JOptionPane.showInputDialog("Digite o valor de m:");
        int m = Integer.parseInt(mInput);

        int sobreviventeNumero = pessoas.encontrarSobrevivente(m);

        Pessoas.Pessoa sobreviventeData = null;
        for (Pessoas.Pessoa pessoa : pessoas.getListaDePessoas()) {
            if (pessoa.getNumero() == sobreviventeNumero) {
                sobreviventeData = pessoa;
                break;
            }
        }

        String mensagem = "A pessoa sobrevivente é a de número: " + sobreviventeNumero + "\n";
        mensagem += "Dados da pessoa sobrevivente:\n";
        mensagem += "Nome: " + sobreviventeData.getNome() + "\n";
        mensagem += "Telefone: " + sobreviventeData.getTelefone() + "\n";
        mensagem += "Endereço: " + sobreviventeData.getEndereco() + "\n";
        mensagem += "CPF: " + sobreviventeData.getCpf();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaquestao2java;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMI
 */
public class ListaQuestao2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int livros;
        float a=0, b=0;
        String s = JOptionPane.showInputDialog("Digite a quantidade de livros desejados: ");
        livros = Integer.parseInt(s);
            a = (float) (7.50 + (livros*2.50));
            b = (float) (2.50 + (livros*0.50));
                if (a>b){
                    JOptionPane.showMessageDialog(null, "O melhor desconto para você é o critério B");
                }
                if (b>a){
                    JOptionPane.showMessageDialog(null, "O melhor desconto para você é o critério A");
                }
    }
    
}

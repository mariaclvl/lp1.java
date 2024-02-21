/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaquestao1java;

import java.util.Scanner;

/**
 *
 * @author ADMI
 */
public class ListaQuestao1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float n=0, soma=0, media=0, f=0, recu=0;
        
        Scanner s = new Scanner (System.in);
        System.out.println("Insira a nota das suas três provas: ");
       
        int i;
            for (i=0; i<3; i++){
                n = s.nextFloat();
                soma += n;
            }
            media = (soma/3);
                if (media>=7){
                System.out.println("Aprovado!");
            }
                else {
                System.out.println("Reprovado. Por favor, feito a prova de recuperação, digite aqui a sua nota:");
                recu = s.nextFloat();
                f = (media+recu)/2;
                
                    if (f>=5){
                    System.out.println("Aprovado pela recuperação");
                }
                    else {
                    System.out.println("Perdeu de ano.");
                }
            }
        }
    }

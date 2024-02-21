/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaquestao4java;

import java.util.Scanner;

/**
 *
 * @author ADMI
 */
public class ListaQuestao4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,cont;
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número maior ou igual a 0: ");
        num = s.nextInt();
        
        if (num<0){
            System.out.println("Número menor que 0. Não foi possível processar.");
        }
        else {
            cont = contardigitos(num);
            System.out.println("O número de digitos desse numéro é igual a "+ cont + ".");
            
        }
    }

    private static int contardigitos(int num) {
        int contador=0;
        if (num==0){
            return 1;
        }
        while (num!=0){
            num/=10;
            contador++;
        }
        return contador;
    }
}
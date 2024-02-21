/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaquestao3java;

import java.util.Scanner;

/**
 *
 * @author ADMI
 */
public class ListaQuestao3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h1, m1, s1, h2, m2, s2;
        int dh=0, dm=0, ds=0, soh = 0, som=0, sos=0;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite o intervalo 1: hora, minuto e segundo");
        h1 = s.nextInt();
        m1 = s.nextInt();
        s1 = s.nextInt();
        
        System.out.println("Digite o intervalo 2: hora, minuto e segundo");
        h2 = s.nextInt();
        m2 = s.nextInt();
        s2 = s.nextInt();
        
            sos= s1+s2;
             if (sos>=60){
                sos-=60;
                som++;
            }
            som= m1+m2;
             if (som>=60){
                som-=60;
                soh++;
            }
            soh= h1+h2;
             if(soh>=24){
                soh-=24;
            }
            if (m1 < m2 || m1 == m2) {
            if(m1==60){
                m1 = 0;
                dm += m2 - m1;
            }else{
            dm += m2 - m1;
            }
        } else {
            dm += (60 - m1) + m2;
            dh--;
        }
        
        if(h1<h2 || h1==h2){
           if(h1 == 24){
            h1 = 0;
            dh += h2 - h1;
           }else{
           dh += h2 - h1;
           }
        }else{
            dh += (24 - h1) + h2;
        }
        System.out.println("A soma dos intervalos é igual à "+ soh + ":"+ som +":"+ sos);
        System.out.println("A diferença dos intervalos é igual à "+ dh + ":"+ dm +":"+ ds);
        
        
    
    }
    
}

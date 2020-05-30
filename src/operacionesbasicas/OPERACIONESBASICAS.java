/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class OPERACIONESBASICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1,numero2,suma,resta,mult,div,resto;
        
        System.out.println("DIGITE LOS 2 NUMEROS");
        numero1= entrada.nextFloat();
        numero2= entrada.nextFloat();
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        resto=numero1%numero2;
        
        System.out.println("EL RESULTADO DE LA SUMA ES :"+suma);
        System.out.println("EL RESULTADO DE LA RESTA ES :"+resta);
        System.out.println("EL RESULTADO DE LA MULTI ES :"+mult);
        System.out.println("EL RESULTADO DE LA DIVISION ES :"+div);
        System.out.println("EL RESULTADO DEL RESTO ES :"+resto);
     
    }
    
}

package pos_neg_nul;

import java.util.Scanner;

/**
 * @author Pablo Sanjuan Montesdeoca
 */
public class Pos_Neg_Nul {

    public static void main(String[] args) {
        
        Scanner numeros= new Scanner(System.in);
        
        int pos=0;
        int neg=0;
        int nul=0;
        
/*1*/   System.out.print("Numeros a verificar: ");
        int cant = numeros.nextInt();
               
/*2*/       for (int i = 0; i < cant; i++) {
/*3*/       System.out.print("Ingresar numeros: ");
            int num = numeros.nextInt();
/*4*/           if (num<0) {
/*5*/                nul=nul+1;
                } else {
    
/*6*/               if (num>0) {                    
/*7*/                pos=pos+1;
                     }else{    
/*8*/                   neg=neg+1;                                        }
            }
        }
/*9*/   System.out.println("Ingresó " + pos + " números positivos");
/*9*/   System.out.println("Ingresó " + neg + " números negativos");
/*9*/   System.out.println("Ingresó " + nul + " números nulos");       
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equações;

/**
 *
 * @author Micro
 */import java.util.Scanner;
public class Equações {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner
        (System.in);
        
        float a,b,c,delta,x1,x2;
                
        System.out.print("Digite um número: ");
        a = entrada.nextFloat();
        
        System.out.print("Digite outro valor: ");
        b = entrada.nextFloat();
        
        System.out.print("Digite outro valor: ");
        c = entrada.nextFloat();
       if(a!=0){
            System.out.println("Não é possivvel calcular, pois 'A' é diferente de 0");
        delta =(b*b)-(4*a*c);
        
        if((delta > 0)){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("O resultados das Equações é:"+x1+x2);
        }}else{
        System.out.println("A Equação não possui resultados reais");
        }
        
        
        
    }
    
}

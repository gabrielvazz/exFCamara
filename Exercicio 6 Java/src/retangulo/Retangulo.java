/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        eRetangulo r = new eRetangulo();
        
       r.construc();
       r.mostrar();
    }
}

class eRetangulo {
    
    Scanner entrada = new Scanner(System.in);
    double comprimento,largura, area, per;
    
    
    double cArea (){
        
        area = comprimento*largura;
        
        return area;
    }
     double cPerimetro (){
        
        per = (2*comprimento)+(2*largura);
        
        return per;
    }
     
    void mostrar(){
        
        System.out.println("Largura: "
                +largura+"\nComprimento: "+comprimento+"\nÁrea: "+cArea()
                +"\nPerimetro: "+cPerimetro());
    }
    
    void construc(){
        
     System.out.println("Comprimento do retângulo");
        comprimento = entrada.nextDouble();
   System.out.println("Largura do retângulo");
        largura = entrada.nextDouble();
    }
    
}
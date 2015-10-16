
package exemplo2;

import java.util.Scanner;

/**
 *
 * @author agomezcastro
 */
public class Exemplo2 {

    
    public static void main(String[] args) {
        
        //float base, altura;
        Metodos aux = new Metodos();
        float base= aux.pedirFloat();
        float altura = aux.pedirFloat();
        /*Scanner obx=new Scanner (System.in);
        System.out.println("introduce la base: ");
        base= obx.nextFloat();
        System.out.println("introduce la altura: ");
        altura= obx.nextFloat();
        */
        Rectangulo rectangulo1 = new Rectangulo(base, altura);
        System.out.println("base: "+ rectangulo1.getBase());
        System.out.println("altura: "+ rectangulo1.getAltura());
        System.out.println("area: "+ rectangulo1.calcularArea(base, altura));
        System.out.println("perimetro: "+ rectangulo1.calcularPerimetro());
    }
    
    
}

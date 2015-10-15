
package exemplo2;

/**
 *
 * @author agomezcastro
 */
public class Exemplo2 {

    
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3,5);
        System.out.println("base: "+ rectangulo1.getBase());
        System.out.println("altura: "+ rectangulo1.getAltura());
        System.out.println("area: "+ rectangulo1.calcularArea(3, 5));
        System.out.println("perimetro: "+ rectangulo1.calcularPerimetro());
    }
    
    
}

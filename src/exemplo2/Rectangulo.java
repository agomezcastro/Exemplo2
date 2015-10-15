

package exemplo2;

/**
 *
 * @author agomezcastro
 */
public class Rectangulo {
    private float base;
    private float altura;
    //constructores
    public Rectangulo(){
        
    }
    public Rectangulo(float ba, float al){
    base = ba;
    altura = al;
    }
    //metodos de acceso
    public void setBase(float ba){
        base = ba;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float al){
        altura = al;
    }
    public float getAltura(){
        return altura;
    }
    public float calcularArea(float ba, float al){
        return base*altura;
        
    }
    public float calcularPerimetro(){
        return base*2+altura*2;
    }
}



package exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Metodos {
    public float pedirFloat(){
        return Float.parseFloat(JOptionPane.showInputDialog("teclea dato"));
        //String dato = JOptionPane.showInputDialog("dame dato");
        //return (Float.parseFloat(dato));
    }
}

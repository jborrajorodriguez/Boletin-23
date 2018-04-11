package boletin23.ejercicio4;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventana2 {
    JFrame marco;
    JPanel panel;
    

    public Ventana2() {
         //Inicializar componentes:
        marco=new JFrame("Boton Premer");
        panel=new JPanel();
        
        
        
        //Caracteristicas:
        
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.yellow);
        
        //Añadir contenido:
        
        
     
        marco.add(panel);
        
        //Hacer Visible:
        
        
        marco.setLocationRelativeTo(null);
        
    }
}

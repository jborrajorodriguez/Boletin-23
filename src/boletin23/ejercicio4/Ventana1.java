package boletin23.ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventana1 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bVentana;
    Ventana2 otra;

    public Ventana1() {
         //Inicializar componentes:
        marco=new JFrame("Ventana 1");
        panel=new JPanel();
        bVentana=new JButton("Nueva Ventana");
        otra=new Ventana2();
        
        //Caracteristicas:
        
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bVentana.addActionListener(this);
        
        //Añadir contenido:
        
        panel.add(bVentana);
     
        marco.add(panel);
        
        //Hacer Visible:
        
        
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        marco.pack();
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        otra.marco.setVisible(true);
    }

}

package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Premer implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton bPremer;
    JLabel e1;

    public Premer() {
        
        //Inicializar componentes:
        marco=new JFrame("Boton Premer");
        panel=new JPanel();
        bPremer=new JButton("Presiona");
        
        
        //Caracteristicas:
        
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bPremer.addActionListener(this);
        
        //Añadir contenido:
        
        panel.add(bPremer);
     
        marco.add(panel);
        
        //Hacer Visible:
        
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e1=new JLabel("Presionaste el boton");
        panel.add(e1);
        panel.updateUI();//Metodo que actualiza el contenido del panel.
    }
    
    

}

package boletin23.ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class SaudoDespedida implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bSaudo, bDespedida;
    JLabel e1;   

    public SaudoDespedida() {
        //Inicializar componentes:
        marco = new JFrame("Curso Dam");
        panel = new JPanel();
        bSaudo = new JButton("Saudo");
        bDespedida = new JButton("Despedida");
        e1=new JLabel();
        //Caracteristicas:
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bSaudo.addActionListener(this);
        bDespedida.addActionListener(this);
        //Añadir contenido:
        panel.add(bSaudo);
        panel.add(bDespedida);
        marco.add(panel);
        //Hacer Visible:
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        marco.pack();
       
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == bSaudo) {
            e1.setText("Un saudo Dam");
            panel.add(e1);
            panel.updateUI();
            marco.pack();
        } else {
            e1.setText("Fin do Programa");
            panel.add(e1);
            panel.updateUI();
            marco.pack();
        }
        
    }

}

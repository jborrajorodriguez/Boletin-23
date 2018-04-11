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
public class CursoDam implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bProgramacion, bBases;
    JLabel e1;

    public CursoDam() {

        //Inicializar componentes:
        marco = new JFrame("Curso Dam");
        panel = new JPanel();
        bProgramacion = new JButton("Programacion");
        bBases = new JButton("Bases");
        //Caracteristicas:
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bProgramacion.addActionListener(this);
        bBases.addActionListener(this);
        //Añadir contenido:
        panel.add(bProgramacion);
        panel.add(bBases);
        marco.add(panel);
        //Hacer Visible:
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        marco.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == bProgramacion) {
            marco.setTitle("Programacion");
        } else {
            marco.setTitle("Bases");
        }

    }
}

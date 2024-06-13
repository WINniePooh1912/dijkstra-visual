/* @author sly */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DijkstraNodes extends JFrame {

    public DijkstraNodes() {
	try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException 
        		| IllegalAccessException | UnsupportedLookAndFeelException ex) {}
		
            this.setTitle("Dijkstra :p");
            this.setBounds(500, 300, 800, 500);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            add(new DijkstraNodesJPanel());

            this.setVisible(true);
    }
}

    
class DijkstraNodesJPanel extends JPanel {
    private PaintingPanel paintingPanel;
    private JScrollPane spPaintingPanel;
    private JTextArea textArea;

    public DijkstraNodesJPanel() {
        initialize();
    }

    private void initialize() {
        this.setLayout(new BorderLayout());

        textArea = new JTextArea("Presiona dentro del panel para agregar un nodo, da click derecho al nodo para desplegar el menu", 1, 1);
        textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        textArea.setEditable(false);
        textArea.setBackground(Color.white);
        textArea.setLineWrap(true);


        paintingPanel = new PaintingPanel(textArea);
        spPaintingPanel = new JScrollPane(paintingPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        this.add(textArea, BorderLayout.NORTH);
        this.add(spPaintingPanel, BorderLayout.CENTER);
    }
}

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.io.IOException;

public class GUI extends JFrame {
    
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 800;

    Panel panel;

    private BufferedImage orchard;

    public GUI() {
        System.setProperty("sun.java2d.opengl", "true"); // Enable video acceleration.

        try {
            orchard = ImageIO.read(getClass().getResourceAsStream("images/orchard.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }


        ImageIcon img = new ImageIcon("images/pomegranate.png");

        // initialize frame.
        setTitle("Pomegranate Punchout!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,0, FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setIconImage(img.getImage());
        setVisible(true);
        panel = new Panel();
        add(panel);
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    class Panel extends JPanel {
        public void paint(Graphics g) {

            // draw background.
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

            g.drawImage(orchard, 0, 0, getWidth(), getHeight(), null);

            g.dispose();
        }
    }
    
}

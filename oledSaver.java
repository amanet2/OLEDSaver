import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class oledSaver {
    static int width = 3840, height = 2160;
    private static class listener implements KeyListener, MouseListener {
        public void keyPressed(KeyEvent e) {
            System.exit(0);
        }
        
        public void keyReleased(KeyEvent e) {}
    
        public void keyTyped(KeyEvent e) {}

        public void mousePressed(MouseEvent e) {}
    
        public void mouseReleased(MouseEvent e) {}
    
        public void mouseEntered(MouseEvent e) {}
    
        public void mouseExited(MouseEvent e) {}
    
        public void mouseClicked(MouseEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        listener inputs = new listener();
        JFrame frame2 = new JFrame("OLED Saver");
        frame2.addKeyListener(inputs);
        frame2.addMouseListener(inputs);
        frame2.setUndecorated(true);
        frame2.getContentPane().setBackground(Color.BLACK);
        frame2.setPreferredSize(new Dimension(width, height));
        frame2.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
            new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "blank cursor"
        ));
        frame2.setResizable(false);
		frame2.pack();
        frame2.setVisible(true);
    }
}
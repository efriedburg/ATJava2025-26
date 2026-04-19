import java.awt.*;
import javax.swing.*;

public class GraphicsActivity {

    public static void draw(Graphics g) {
        // background
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 800, 600);

        // pokeball main circle
        g.setColor(Color.RED);
        g.fillOval(250, 150, 300, 300);

        // bottom half
        g.setColor(Color.WHITE);
        g.fillArc(250, 150, 300, 300, 180, 180);

        // outline
        g.setColor(Color.BLACK);
        g.drawOval(250, 150, 300, 300);

        // middle black band
        g.setColor(Color.BLACK);
        g.fillRect(250, 290, 300, 20);

        // center outer button
        g.setColor(Color.BLACK);
        g.fillOval(365, 263, 70, 70);

        // center inner button
        g.setColor(Color.WHITE);
        g.fillOval(378, 276, 44, 44);

        // button outline
        g.setColor(Color.BLACK);
        g.drawOval(378, 276, 44, 44);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom 2D Drawing");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics g) {
                draw(g);
            }
        };

        frame.add(component);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
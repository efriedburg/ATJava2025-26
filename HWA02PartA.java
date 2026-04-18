import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HWA02PartA extends JFrame {

    public HWA02PartA() {
        add(new Board());
        setTitle("Burger");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    class Board extends JPanel {
        private Image myImage;

        public Board() {
            setPreferredSize(new Dimension(800, 600));
            setBackground(Color.CYAN);

            ImageIcon icon = new ImageIcon("media/burger.jpg");
            myImage = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            int panelWidth = getWidth();
            int panelHeight = getHeight();

            int imageWidth = myImage.getWidth(this);
            int imageHeight = myImage.getHeight(this);

            double scaleX = (panelWidth / 2.0) / imageWidth;
            double scaleY = (panelHeight / 2.0) / imageHeight;

            double x = panelWidth - (imageWidth * scaleX);
            double y = panelHeight - (imageHeight * scaleY);

            AffineTransform at = new AffineTransform();
            at.translate(x, y);
            at.scale(scaleX, scaleY);

            g2d.drawImage(myImage, at, this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new HWA02PartA();
        frame.setVisible(true);
    }
}
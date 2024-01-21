import javax.swing.*;
import java.awt.*;

public class SmileyApplet2 extends JFrame {

   public SmileyApplet2() {
      setTitle("Smiley Face 2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 400);
      setVisible(true);
   }

   public void paint(Graphics g) {
      // Set background color
      getContentPane().setBackground(Color.WHITE);

      // Draw face
      g.setColor(Color.YELLOW);
      g.fillOval(100, 100, 200, 200);

      // Draw eyebrows
      g.setColor(Color.BLACK);
      g.drawLine(145, 145, 175, 165);
      g.drawLine(235, 165, 265, 145);

      // Draw eyes
      g.setColor(Color.BLACK);
      g.fillOval(155, 175, 20, 20);
      g.fillOval(225, 175, 20, 20);

      // Draw nose
      g.setColor(Color.BLACK);
      g.fillOval(190, 205, 20, 20);

      // Draw smile
      g.setColor(Color.BLACK);
      g.drawArc(150, 175, 100, 100, 200, 140);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new SmileyApplet2());
   }
}

//Name : Heba Ayman Mesluh ---- Id : 20200175
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex4 {
   public static void main(String[] args) {
      new Ex4();
   }

   // constructor
   public Ex4() {
      EventQueue.invokeLater(new Runnable() {
         @Override
         public void run() {
            JFrame frame = new JFrame("Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            JPanel layout = new JPanel();
            layout.setLayout(new BoxLayout(layout, BoxLayout.PAGE_AXIS));
            JPanel option = new JPanel();
            option.setSize(500, 50);
            JComboBox comboBox = new JComboBox();

            // Add items in combobox
            comboBox.addItem("Select Shape");
            comboBox.addItem("Shape Tree");
            comboBox.addItem("Shape Pattern");
            comboBox.addItem("Shape Eyes");
            comboBox.addItem("Shape F");
            comboBox.addItem("Shape Circles");
            comboBox.setBounds(84, 45, 50, 20);

            option.add(comboBox);

            // create shapes object
            ShapeTree panelTree = new ShapeTree();
            ShapeEyes panelEyes = new ShapeEyes();
            ShapeHexa panelHexa = new ShapeHexa();
            ShapeAlpha panelAlpha = new ShapeAlpha();
            ShapeCircle panelCircle = new ShapeCircle();

            // add all components
            frame.add(layout);
            layout.add(option);
            layout.add(panelEyes);
            layout.add(panelHexa);
            layout.add(panelTree);
            layout.add(panelAlpha);
            layout.add(panelCircle);

            // set all shapes invisible initially
            panelTree.setVisible(false);
            panelHexa.setVisible(false);
            panelEyes.setVisible(false);
            panelAlpha.setVisible(false);
            panelCircle.setVisible(false);

            // add item listener on combobox
            comboBox.addItemListener(new ItemListener() {
               public void itemStateChanged(ItemEvent arg) {
                  int selectedIndex = comboBox.getSelectedIndex(); // get selected item index
                  switch (selectedIndex) { // check selected index
                     case 1: { // if tree is selected
                        panelTree.setVisible(true); // only show tree shape hide rest
                        panelEyes.setVisible(false);
                        panelHexa.setVisible(false);
                        panelAlpha.setVisible(false);
                        panelCircle.setVisible(false);
                        break;
                     }
                     case 2: { // if hexa is selected
                        panelTree.setVisible(false);
                        panelHexa.setVisible(true); // only show hexa shape hide rest
                        panelEyes.setVisible(false);
                        panelAlpha.setVisible(false);
                        panelCircle.setVisible(false);

                        break;
                     }
                     case 3: { // if eye is selected
                        panelTree.setVisible(false);
                        panelHexa.setVisible(false);
                        panelEyes.setVisible(true);
                        panelAlpha.setVisible(false);
                        panelCircle.setVisible(false);

                        // only show eye shape hide rest
                        break;
                     }
                     case 4: { // if alpha is selected
                        panelTree.setVisible(false);
                        panelHexa.setVisible(false);
                        panelEyes.setVisible(false);
                        panelAlpha.setVisible(true);
                        panelCircle.setVisible(false);

                        // only show alpha shape hide rest
                        break;
                     }
                     case 5: { // if circle is selected
                        panelTree.setVisible(false);
                        panelHexa.setVisible(false);
                        panelEyes.setVisible(false);
                        panelAlpha.setVisible(false);
                        panelCircle.setVisible(true);
                        // only show circle shape hide rest
                        break;
                     }
                     default: {
                        panelTree.setVisible(false);
                        panelHexa.setVisible(false);
                        panelEyes.setVisible(false);
                        panelAlpha.setVisible(false);
                     }
                  }
               }
            });
         }
      });
   }

   // Tree Shape
   public class ShapeTree extends JPanel {
      public ShapeTree() {
      }

      @Override
      public Dimension getPreferredSize() {
         return new Dimension(200, 200);
      }

      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g.create();
         int width = getWidth();

         g2d.setColor(new Color(139, 69, 19));
         g2d.fillRect((width / 2) - 20, 50, 40, 170);

         // draw circle
         g2d.setColor(Color.GREEN);
         int radius = 60;
         g2d.fillOval((width / 2) - radius, 0, radius * 2, radius * 2);
         g2d.dispose();
      }
   }

   // Hexa shape
   public class ShapeHexa extends JPanel {
      public ShapeHexa() {
      }

      @Override
      public Dimension getPreferredSize() {
         return new Dimension(200, 200);
      }

      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g.create();

         g2d.setColor(Color.CYAN);
         g2d.drawLine(225 - 50 + 5, 100 - 20 + 5, 225 - 25 + 5, 100 - 70 + 5);
         g2d.drawLine(225 - 25 + 5, 100 - 70 + 5, 225 + 25 + 5, 100 - 70 + 5);
         g2d.drawLine(225 + 25 + 5, 100 - 70 + 5, 225 + 50 + 5, 100 - 20 + 5);
         g2d.drawLine(225 + 50 + 5, 100 - 20 + 5, 225 + 25 + 5, 100 + 30 + 5);
         g2d.drawLine(225 + 25 + 5, 100 + 30 + 5, 225 - 25 + 5, 100 + 30 + 5);
         g2d.drawLine(225 - 25 + 5, 100 + 30 + 5, 225 - 50 + 5, 100 - 20 + 5);
         g2d.setColor(Color.PINK);

         g2d.drawLine(225 - 25 + 5, 100 - 70 + 5, 225 + 25 + 5, 100 + 30 + 5);
         g2d.drawLine(225 - 50 + 5, 100 - 20 + 5, 225 + 50 + 5, 100 - 20 + 5);
         g2d.drawLine(225 - 25 + 5, 100 + 30 + 5, 225 + 25 + 5, 100 - 70 + 5);

         // draw dots
         g2d.setColor(Color.RED);
         g2d.fillOval(225, 100 - 20, 10, 10);
         g2d.fillOval(225 - 50, 100 - 20, 10, 10);
         g2d.fillOval(225 - 25, 100 - 70, 10, 10);
         g2d.fillOval(225 - 25, 100 + 30, 10, 10);
         g2d.fillOval(225 + 50, 100 - 20, 10, 10);
         g2d.fillOval(225 + 25, 100 - 70, 10, 10);
         g2d.fillOval(225 + 25, 100 + 30, 10, 10);

         g2d.dispose();
      }
   }

   // Eyes shape
   public class ShapeEyes extends JPanel {
      public ShapeEyes() {
      }

      @Override
      public Dimension getPreferredSize() {
         return new Dimension(200, 200);
      }

      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g.create();
         int width = getWidth();
         int height = getHeight();

         g2d.setColor(Color.red);
         // Right Side
         g2d.drawOval((width / 2) - 20, height / 2, 65, 70);
         g2d.drawOval((width / 2) - 20, height / 2 - 10, 75, 90);
         g2d.drawOval((width / 2) - 20, height / 2 - 20, 85, 110);
         g2d.drawOval((width / 2) - 20, height / 2 - 30, 95, 130);
         g2d.drawOval((width / 2) - 20, height / 2 - 40, 105, 150);
         // Left Side
         g2d.drawOval((width / 2) - 20 - 65, height / 2, 65, 70);
         g2d.drawOval((width / 2) - 20 - 75, height / 2 - 10, 75, 90);
         g2d.drawOval((width / 2) - 20 - 85, height / 2 - 20, 85, 110);
         g2d.drawOval((width / 2) - 20 - 95, height / 2 - 30, 95, 130);
         g2d.drawOval((width / 2) - 20 - 105, height / 2 - 40, 105, 150);
         // box
         g2d.setColor(Color.blue);
         g2d.drawRect((width / 2) - 20 - 105, height / 2 - 40, 210, 150);

         g2d.dispose();
      }
   }

   // Alpha shape
   public class ShapeAlpha extends JPanel {
      public ShapeAlpha() {
      }

      @Override
      public Dimension getPreferredSize() {
         return new Dimension(400, 400);
      }

      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g.create();
         g2d.drawLine(100, 100, 300, 100);
         g2d.drawLine(150, 150, 300, 150);
         g2d.drawLine(300, 100, 300, 150);
         g2d.drawLine(100, 100, 100, 400);
         g2d.drawLine(100, 100, 100, 400);
         g2d.drawLine(150, 150, 150, 200);
         g2d.drawLine(150, 200, 200, 200);
         g2d.drawLine(200, 200, 200, 250);
         g2d.drawLine(150, 250, 200, 250);
         g2d.drawLine(150, 250, 150, 400);
         g2d.drawLine(100, 400, 150, 400);

      }
   }

   // circle shape
   // Alpha shape
   public class ShapeCircle extends JPanel {
      public ShapeCircle() {
      }

      @Override
      public Dimension getPreferredSize() {
         return new Dimension(400, 400);
      }

      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         Graphics2D g2d = (Graphics2D) g.create();
         g2d.drawRect(100, 100, 200, 200);//
         g2d.setColor(new Color(255,0,0));
         g2d.fillOval(175, 100, 50, 50);// 3
         g2d.fillOval(250, 175, 50, 50);// 2
         g2d.fillOval(175, 250, 50, 50);// 4
         g2d.fillOval(100, 175, 50, 50);// 1
         g2d.setColor(new Color(0,0,255));
         g2d.fillOval(150, 150, 100, 100);
      }
   }
}
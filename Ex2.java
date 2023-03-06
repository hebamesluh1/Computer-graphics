import javax.swing.*;//JFrame 
import java.awt.*;//graphics , colors 

public class Ex2 extends JFrame {
    // constructor
    public Ex2() {
        super("Example -2- ");
        setSize(400, 400);
        setVisible(true);
    }

    Color randomColor() {
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);
        return new Color(R, G, B);
    }

    public static void main(String[] args) {
        new Ex2();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // you can make color likes :
        // draw without fill color
        g.setColor(randomColor());
        g.drawRect(100, 50, 200, 100);
        // draw with fill color
        g.setColor(randomColor());
        g.fillRect(200, 100, 200, 100);
        // draw rectangle with border
        g.setColor(new Color(0, 44, 89));
        g.drawRect(100, 50, 200, 100);
        g.setColor(new Color(144, 255, 89));
        g.fillRect(100, 50, 200, 100);
    }
}

import java.awt.*;//color & graphics
import javax.swing.*;//JFrame,Timer
import java.awt.event.*;//ActionListener ,ActionEvent

public class Ex3 extends JFrame implements ActionListener {
    Timer t;
    JTextArea a;
    int i = 1;

    public Ex3() {
        t = new Timer(800, this);
        add(a = new JTextArea());
        t.start();
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        a.append("Hello World\n");
        i++;
        if (i == 6) {
            t.stop();
        }
    }

    public static void main(String[] args) {
        new Ex3();
    }
}

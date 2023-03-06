import javax.swing.*;//JFrame 
import java.awt.*;//graphics , colors 
public class Ex1 extends JFrame{
    //constructor 
    public Ex1(){
        super("Example -1- ");
        setSize(400,400);
        setVisible(true);
    }
    //main 
    public static void main(String[] args){
        new Ex1();
    }
    //here we can draw 
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(100, 100, 200, 200);
        g.drawLine(200, 100, 200, 200);
        g.setColor(Color.green);
        g.drawLine(100, 100, 200, 100);
    }
}
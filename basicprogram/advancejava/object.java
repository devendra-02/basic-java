import javax.swing.*;
import java.awt.*;
import java.applet.*;
public class object extends Applet{
    @Override
    public void paint(Graphics g){
        g.drawRect(300, 300, 150, 100);
        g.drawString("Hello World", 100,100);
        g.drawOval(500, 500, 40, 60);
        g.setColor(Color.RED);
        g.fillOval(500, 500, 40, 60);
    }
    public static void main(String[] args) {
        Frame f= new Frame("Draw Object By 22EARAD039");
        object applet=new object();
        f.setSize(700,700);
        f.add(applet);
        f.setVisible(true);
    }

}
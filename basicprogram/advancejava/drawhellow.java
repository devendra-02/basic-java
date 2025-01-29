package advancejava;


import java.awt.*;
import java.applet.*;
public class drawhellow extends Applet{
	@Override
	public void paint(Graphics g){
		g.drawRect(300, 300, 100, 100);
		g.drawString("Hello World", 100,100);
		g.drawOval(500, 500, 60, 60);
		g.setColor(Color.RED);
		g.fillOval(500, 500, 60, 60);
	}
	public static void main(String[] args) {
		Frame f= new Frame("Draw Object By 22EARAD029");
		drawhellow applet=new drawhellow();
		f.setSize(700,700);
		f.add(applet);
		f.setVisible(true);
	}
	

}
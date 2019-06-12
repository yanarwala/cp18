import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class mmouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box); 

		g2.setColor(Color.black);
		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		    g2.fill(circle);
g2.setColor(Color.black);
		Ellipse2D.Double circle1 = new Ellipse2D.Double(50, 50, 100, 100);
            g2.fill(circle1);
	g2.setColor(Color.black);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(50, 50, 100, 100);
		g2.fill(circle2);


	}
}

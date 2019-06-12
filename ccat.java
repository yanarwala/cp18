import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.geom.Arc2D;
import javax.swing.JComponent;


public class ccat extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

        
        
      
                 g2.setColor(Color.orange);
		Ellipse2D.Double circle = new Ellipse2D.Double(120, 100, 200, 200);
		    g2.fill(circle);
        
        
        g2.setColor(Color.black);
        Ellipse2D.Double circle9 = new Ellipse2D.Double(190, 140, 20, 20);
        g2.fill(circle9);
        
        g2.setColor(Color.black);
        Ellipse2D.Double circle10 = new Ellipse2D.Double(220, 140, 20, 20);
        g2.fill(circle10);
        
g2.setColor(Color.orange);
		Ellipse2D.Double circle1 = new Ellipse2D.Double(300, 100, 100, 200);
            g2.fill(circle1);
	g2.setColor(Color.orange);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(50, 100, 100, 200);
		g2.fill(circle2);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(120, 300, 200, 300);
        g2.fill(circle4);
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(60, 330, 100, 50);
        g2.fill(circle5);
        
        Ellipse2D.Double circle6 = new Ellipse2D.Double(295, 330, 100, 50);
        g2.fill(circle6);
        
        Ellipse2D.Double circle7 = new Ellipse2D.Double(220, 540, 50, 100);
        g2.fill(circle7);
        
        Ellipse2D.Double circle8 = new Ellipse2D.Double(138, 540, 50, 100);
        g2.fill(circle8);
        
        g2.setColor(Color.pink);
        Rectangle box = new Rectangle(180, 190, 50, 25);
        g2.draw(box);
        g2.fill(box);
        
        g2.setColor(Color.black);
        Ellipse2D.Double circle15 = new Ellipse2D.Double(180, 240, 60, 20);
        g2.fill(circle15);
        
       
	}
    
}

 import javax.swing.JFrame;

public class cframe
{
    public static void main(String[] args){
 
       
	
	
        JFrame frame = new JFrame("Animal");

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ccat picture = new ccat();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
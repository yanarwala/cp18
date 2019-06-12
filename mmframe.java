import javax.swing.JFrame;

public class mmframe{
    public static void main(String[] args){
        JFrame frame = new JFrame("MM Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        mmouse r = new mmouse();
        frame.add(r);
        
        frame.setVisible(true);
    }}

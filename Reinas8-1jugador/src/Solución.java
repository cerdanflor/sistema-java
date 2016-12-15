import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Solución extends JFrame{
    private JLabel sol=new JLabel();
        public Solución(){
        super("Posible Solución");
        setSize(800,600);
        setLocation(300,100);
        setResizable(false);
        sol.setIcon(new ImageIcon("Solución.jpg"));
        add(sol);
        setVisible(true);
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui extends JFrame{

	
	public Gui() {
		super("Hellau");
		this.setBounds(100,100,500,500);
		this.setVisible(true);
	
		this.add(new JButton("Hello Java"));
	
	}
	
}

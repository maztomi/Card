import  javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Card");
		
		setLayout(new FlowLayout());
		setVisible(true);
	}
}

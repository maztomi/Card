import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;



public class StartScreen extends JPanel {
	Toolkit kit=Toolkit.getDefaultToolkit();
	Dimension screenSize=kit.getScreenSize();
	
	BufferedImage img;
	
	JButton button =new JButton("Start");
	this.add(button);
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	public StartScreen() {
		try {
			img=ImageIO.read(new File("C:\\农肺快 墨靛.jpg"));
		}catch(IOException e) {	}
	}
	public Dimension getPreferredSize() {

		return new Dimension(700,700);

	}
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Start Screen");

		Image i=kit.getImage("C:\\农肺快.jpg");
		f.setIconImage(i);
		
		f.add(new StartScreen());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

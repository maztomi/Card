import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * 시작화면
 */
//재업로드
public class Screen extends JPanel{
	JButton startButton;

	BufferedImage img;
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
	public Screen() {
		try {
			img=ImageIO.read(new File("image\\크로우.png"));
		}catch (IOException e) {}
		
		startButton = new JButton("START");
//		startButton.setBounds(200, 200, 70, 40);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				JButton a = new JButton();
//				JButton b = new JButton();
//				JButton c = new JButton();
//				JButton d = new JButton();
//				
//				add(a);
//				add(b);
//				add(c);
//				add(d);
//				a.setBounds(0,0,40,40);
//				a.setBackground(Color.red);
//				b.setBounds(40,0,40,40);
//				b.setBackground(Color.blue);
//				c.setBounds(80,0,40,40);
//				c.setBackground(Color.red);
//				d.setBounds(120,0,40,40);
//				d.setBackground(Color.yellow);
//				
				
			}
		});
		
		add(startButton);
	}
	public Dimension getPreferredSize() {
		if(img==null) {
			return new Dimension(800,800);
		}
		else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
	public static void main(String[] args) {
		
		JFrame f = new JFrame("시작화면");
		
		f.add(new Screen());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
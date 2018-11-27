import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * 연동화면
 */

public class StartScreen extends JFrame {
	public Screen startP = null;
	public CardScreen gameP = null;

	public void changeRoom(String panel) {
		if(panel.equals("startP")) {
		}
	}

	ImageIcon i=new ImageIcon("C:\\Users\\6405-29\\git\\Card\\image\\image\\크로우.png");
	Image im=i.getImage();

	class Background extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(),getHeight(), this);
		}
	}

	public StartScreen() {
		this.setLayout(null);
		JPanel startScreen = new JPanel();

		Background bg=new Background();
		CardScreen gameScreen = new CardScreen();
		gameScreen.setBackground(Color.red);

		JButton start = new JButton("start");
		start.setBounds(165, 260, 70, 40);

		//start.setBorderPainted(false);     // 버튼 테두리 제거
		//start.setContentAreaFilled(false); // 버튼 채우기 없앰
		//start.setFocusPainted(false);      // 버튼 마우스 포커스 제거

		bg.setLayout(null);

		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();

				revalidate();
				repaint();

				gameScreen.setBounds(0,0,400,400);
				getContentPane().add(gameScreen);


			}
		});

		this.add(bg);
		bg.add(start);
		bg.setBounds(0, 0, 396, 396);
		setSize(412, 430);

		this.add(startScreen);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		StartScreen f = new StartScreen();
		//f.add(new Screen());
	}
}
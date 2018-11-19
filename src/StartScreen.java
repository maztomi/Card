import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartScreen extends JFrame {
	//	public Screen startP = null;
	//	public CardScreen gameP = null;
	//
	//	public void changeRoom(String panel) {
	//		if(panel.equals("startP")) {
	//			
	//		}
	//	}
	public StartScreen() {
		JPanel startScreen = new JPanel();
		startScreen.setBackground(Color.ORANGE);
		startScreen.setLayout(null);

		CardScreen gameScreen = new CardScreen();
		gameScreen.setBackground(Color.red);

		add(startScreen);

		JButton start = new JButton("start");
		start.setBounds(200, 200, 70, 40);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
				getContentPane().add(gameScreen);
				revalidate();
				repaint();
			}
		});

		startScreen.add(start);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		StartScreen f = new StartScreen();
		//		f.startP = new Screen();
		//		f.gameP = new CardScreen();
		//		
		//		f.add(f.startP);
	}
}

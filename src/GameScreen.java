import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame {
	JLabel info = new JLabel("정보");

	ArrayList<Integer> card;

	ImageIcon cardback;

	JPanel cardPanel = new JPanel();
	JButton[] b = new JButton[16];
	ImageIcon[] img = new ImageIcon[8];

	Timer timer;
	TimerTask task;

	JPanel buttonPanel = new JPanel();
	JButton start = new JButton("시작");
	JButton reset = new JButton("리셋");

	public GameScreen() {
		setSize(1000, 1000);

		setLayout(new BorderLayout());

		add(info, "North");

		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(start);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 16; i++) {
					b[i].setIcon(img[card.get(i)]);

					timer= new Timer();
					task=new TimerTask() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							for (int i = 0; i < 16; i++) {
								b[i].setIcon(cardback);
							}
						}
					};
					timer.schedule(task, 2000);
				}
			}
		});

		buttonPanel.add(reset);
		add(buttonPanel, "South");



		cardPanel.setLayout(new GridLayout(4, 4));
		cardback = new ImageIcon("image\\image\\크로우 뒷면.png");

		card = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			img[i] = new ImageIcon("image\\image\\card" + i + ".png");
			card.add(i);
			card.add(i);
		}

		Collections.shuffle(card);

		for (int i = 0; i < 16; i++) {
			b[i] = new JButton(cardback);
			cardPanel.add(b[i]);
		}

		// img[card.get(i)]
		add(cardPanel, "Center");


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		GameScreen g = new GameScreen();
	}

}

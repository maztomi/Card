
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/*
 * ����ȭ��
 */
public class CardScreen extends JPanel{
	BufferedImage img1;
	BufferedImage img2;

	//public class TimerTask{

	//		@Override
	//		public void run() {
	//			
	//		}
	//	}
	//	BufferedImage img;
	//	//BufferedImage img2;
	//
	//	public static int count;
	//
	//	public void paint(Graphics g) {
	//		g.drawImage(img, 0 , 0, null);
	//
	//	}
	//
	//	public CardScreen() {
	//		try {
	//			img1=ImageIO.read(new File("C:\\\\Users\\\\smfqh\\\\Desktop\\\\Card\\\\image\\\\image\\card1.png"));
	//			img2=ImageIO.read(new File("C:\\\\Users\\\\smfqh\\\\Desktop\\\\Card\\\\image\\\\image\\card2.png"));
	//	}catch(IOException e) {}
	//
	//	}
	public static void main(String[] args) {
		//
		//		JFrame f = new JFrame("ũ�ο� ī��");
		//		
		Integer count=0;

		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {

			@Override
			public void run() {
				if(count<5)
				{
					try {
						img1=ImageIO.read(new File("C:\\\\Users\\\\smfqh\\\\Desktop\\\\Card\\\\image\\\\image\\card1.png"));

					}catch(IOException e) {}
				}
				else 
					m_timer.cancel();
			}
		};

		m_timer.schedule(m_task, 2000, 2000);
	}

}

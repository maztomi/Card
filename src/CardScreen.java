
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * ����ȭ��
 */
public class CardScreen extends JPanel{
	Image image;
	
	JButton b1=new JButton(new ImageIcon("image\\image\\card1.png"));
	JButton b2=new JButton(new ImageIcon("image\\image\\card2.png"));
	
	
	public CardScreen() {
		JPanel cardPanel = new JPanel();
		cardPanel.setBounds(0,0,700,700);
		//cardPanel.setBackground(Color.red);
		add(cardPanel);
		cardPanel.setLayout(new GridLayout(1,2)); // �ٵ��ǽ�?
		
		b1.setBorderPainted(false);     // ��ư �׵θ� ����
		b1.setContentAreaFilled(false); // ��ư ä��� ����
		
		b2.setBorderPainted(false);     // ��ư �׵θ� ����
		b2.setContentAreaFilled(false); // ��ư ä��� ����
		
		cardPanel.add(b1);
		cardPanel.add(b2);
		
	}
	
}


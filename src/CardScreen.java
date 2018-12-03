import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;

 import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * 게임화면
 * 화면이 나와도 바로 버튼이 보이지 않음-> 이벤트 발생 시 버튼이 보임
 * --> 새로 게임카드화면 클래스 생성-> 게임실행 코드 작성 후 -> 다시 연동 문제 해결 
 */
//재업로드
public class CardScreen extends JPanel{
	Image image;

	JButton b1=new JButton(new ImageIcon("image\\card1.png"));
	JButton b2=new JButton(new ImageIcon("image\\card2.png"));


	public CardScreen() {
		JPanel cardPanel = new JPanel();
		cardPanel.setBounds(0,0,700,700);
		//cardPanel.setBackground(Color.red);
		add(cardPanel);
		cardPanel.setLayout(new GridLayout(1,2)); // 바둑판식 정렬

		b1.setBorderPainted(false);     // 버튼 테두리 제거
		b1.setContentAreaFilled(false); // 버튼 채우기 없앰

		b2.setBorderPainted(false);     // 버튼 테두리 제거
		b2.setContentAreaFilled(false); // 버튼 채우기 없앰

		cardPanel.add(b1);
		cardPanel.add(b2);

	}

}


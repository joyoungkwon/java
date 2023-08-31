package qhrkd;
import java.awt.*;
//밑배치
import javax.swing.*;
//swing
public class Test extends JFrame{
	public Test() {
		setSize(500,500); //사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //처리
		setTitle("뭐가문제야"); //타이틀제목
		
		setLayout(new FlowLayout());
		JButton button = new JButton("골라");
		
		this.add(button);
        setVisible(true);
	}
	public static void main(String []args) {
		new Test();
	}
}

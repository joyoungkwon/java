package qhrkd;
import java.awt.*;
//�ع�ġ
import javax.swing.*;
//swing
public class Test extends JFrame{
	public Test() {
		setSize(500,500); //������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ó��
		setTitle("����������"); //Ÿ��Ʋ����
		
		setLayout(new FlowLayout());
		JButton button = new JButton("���");
		
		this.add(button);
        setVisible(true);
	}
	public static void main(String []args) {
		new Test();
	}
}

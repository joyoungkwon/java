package src01;
import java.io.*;
import java.util.*;
import  java.text.*;

public class ObjectStreamExample {
	// Object���� ����� 
	public static void main(String[] args) throws Exception{
		
		//���� 26line�� �޼ҵ� ����.(����)
		writerList();
		// ���� 43line�� �޼ҵ� ����
		List <Board> list = readList();
		//BoardŬ���� Ÿ���� list�� (readlist)�� 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat - date��¥ fromat(�ʱ�ȭ �缳�� �̷��ǹ��ε�)
		//SimpleDateFormat - ���ڸ� �ҷ��ö� ������ ���� ("yyyy-MM-dd")������.
		for(Board board : list) {
			//�������� board �� list��ŭ 
			System.out.println(//<-��±���
			board.getBno()+"\t"+ board.getTitle()+"\t"+
			board.getContent()+"\t"+board.getWiter()+"\t"+
			sdf.format(board.getDate())
			// ��±���. board�� �޼ҵ� 
			//sdf�� ���� ������, �Է¹���� board�� get������ �޼ҵ�� �޾ƿ��� �޼ҵ带 ���Խ�Ŵ
			
					);//<- �̰Ŵ� �׳� syso ��±��� ������ �ȿ��� ������
		}

	}//<-���α��� ���� �� ��.
	
public static void writerList( )throws Exception{
	// ó�� ���α������� ȣ���� �޼ҵ�
	//return ���� ���� void �޼���
	
	List<Board> list  = new ArrayList<>();
	// List�������̽��� boardŬ������ ��ü�� �޴� ArrayList ����
	list.add(new Board(1,"����1","aa","bb",new Date()));
	//Board�� ������ ��ĸ��缭 add�� �߰�.
	list.add(new Board(1,"����2","cc","ff",new Date()));
	list.add(new Board(1,"����3","ee","qq",new Date()));
	
	FileOutputStream fos = new FileOutputStream("c:/temp/board.db");
	// ���� ������ ����.
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	//�װ� �д� �ٽ�. ������Ʈ ���������.
	
	oos.writeObject(list);
	// ������Ʈ ����������̶� ������Ʈ�� �Ķ���ͷ� �;���
	oos.flush();
	//��������
	oos.close();
	//�ݱ�.
}
// return���� list board�� readList �޼ҵ�
// ���α������� List <Board> list = readList();�� ȣ��
// �߱⶧����  ��list<Board>Ÿ������ ����.
public static List<Board > readList() throws Exception{
	// ����ó��.
	FileInputStream fis = new FileInputStream("c:/temp/board.db");
	//FileOutStream ���� ������ ������ �о� ���̴� input
	ObjectInputStream ois = new ObjectInputStream(fis);
	// ����� �������α׷��� object�� �޾ƿ��� ���� ����� ����. (fis)
	List<Board> list =(List<Board>) ois.readObject();
	// List �� ��ü�� list�� ois.readObject�� �б����ؼ�
	// �տ� �޾Ƶ��̴� ������ ���� ��ȯ
	// �� ĳ������ �ʿ��� (�߿�)
	// list<Board>Ÿ������ ������ (List<Board>)���� 
	// ���� String Integer Char byte ���̸�
	// (String)ois.readObject
	// (Integer)ois.readObject
	// (Char)ois.readObject
	// (Byte)ois.readObject
	//������ ������Ʈ ����� ���� ������ �� ���� ĳ������ �ʿ���. �ֳ��ϸ� ������Ʈ Ÿ������ �ѱ�°ű⋚����
	
	return list;
	// �׸��� void �� �ٸ��� list�� return��.
	
}
}

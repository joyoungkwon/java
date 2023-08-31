package src01;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		// ���ϰ�� �׸����ϰ�� 
		String targetFilePath1 = "C:/Temp/targetFile.jpg";
		// �����

		FileInputStream fis = new FileInputStream(originalFilePath1);
		//�ҷ����°�
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("orginalFile2.jpg").getPath();
		// String Ÿ������ NonBufferVsBufferExample.class.�� getResource�� �޼ҵ�� ������ ��θ� ����
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		//	String ���ڿ� ������ c����̺� ������ Ÿ�� ���� 2jpg�� ����.
		
		FileInputStream fis2 = new FileInputStream(originalFilePath1);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath1);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		//copy�޼ҵ�ȣ��
		System.out.println("���۸� ��������ʾ����� :\t" + nonBufferTime + "ns");
		long BufferTime = copy(fis2, fos2);
		//copy�޼ҵ�ȣ��
		System.out.println("���۸� ��������ʾ����� :\t" + BufferTime + "ns");

		fis.close();
		fos.close();
		// ù���� ���� �ț����� �ݱ�
		fis2.close();
		fos2.close();
		// �ι�° ���� ������ �޼ҵ� �ݱ�.

	}

	static int data = -1;
	//�������� ��������.

	public static long copy(InputStream is, OutputStream os) throws Exception {
		//copy�޼ҵ�
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}

}

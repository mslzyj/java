/*
  IO+Properties
  �����ļ�(�����ļ�ͨ����.Properties����)test�������ݣ�username=zhangsan��
  �������ļ��еĺ���ת����Unicode�뷽����
  ���������룺 
        1. native2ascii �س�
		2. ���뺺��    
		3.��ת���ɵ�Unicode�븴�Ƶ������ļ���Ӧ��λ��
		����

*/
import java.io.*;
import java.util.*;
class ReflectTest04 
{
	public static void main(String[] args) throws Exception
	{
		//�������Զ���
		Properties p = new Properties();//ͬmap����Key��Valueֻ�����ַ�����Key�����ظ�������ظ���Value����
		//����������
		FileInputStream fis =new  FileInputStream("test.Properties");
		//��fis���е��������ݼ��ص����Զ�����
		p.load(fis);
		fis.close();
		String v = p.getProperty("username");
		System.out.println(v);
	}
}

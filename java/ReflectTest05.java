
/*
 �����ļ�test1.Properties�е����ݣ�className = java.util.Date
*/
import java.io.*;
import java.util.*;
class ReflectTest05 
{
	public static void main(String[] args) throws Exception
	{
		//1.�������Զ���
		Properties p = new Properties();
		
		//2.������
        FileInputStream  fr = new FileInputStream("test1.Properties"); 
		//����
		p.load(fr);
		//ͨ��key��ȡvalue
		String className = p.getProperty("className");
		System.out.println(className);
		//ͨ��������ƴ�������
		Class c = Class.forName(className);
		Object o = c.newInstance();
		System.out.println(o);
	}
}
/*
java.util.Date
Mon May 22 18:05:19 CST 2017
�밴���������. . .

*/

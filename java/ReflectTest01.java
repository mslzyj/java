/*
   ��ȡClass�����ַ�ʽ
*/
import java.util.Date;
class  ReflectTest01
{
	public static void main(String[] args) throws Exception
	{
		/*��ȡReflectTest01test��*/
		//��һ�ַ�ʽ
		//c1���ñ����ڴ��ַֻ����еĶ��󣬸ö�������ʱReflectTest01test������
		Class c1= Class.forName("ReflectTest01test");
		//�ڶ��ַ�ʽ
		//java��ÿ�����Ͷ���clas����
		Class c2 = ReflectTest01test.class;
		//�����ַ�ʽ
		//java�������κ�һ��java������getclass����
		ReflectTest01test e = new ReflectTest01test();//e������ʱ��ʱReflectTest01test
		Class c3 = e.getClass();//c3ʱ����ʱ��


        System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		/*��ȡjava.util.Date��*/
		Class c4 = Class.forName("java.util.Date");//����д��ȫ��
		Class c5 = Date.class;

		Date d = new Date();
		Class c6 = d.getClass();

		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		
	}
}

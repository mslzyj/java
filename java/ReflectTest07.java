/*
   java.lang.reflect.Field��ȡĳ���ض�������
*/
import java.lang.reflect.*;
class ReflectTest07 
{
	public static void main(String[] args) throws Exception
	{
		//��ȡ��
		Class c = Class.forName("User");
	   //��ȡid����
	   Field idf = c.getDeclaredField("id");
	   //��ȡĳ���ض������Կ�����������set..��get..
	   Object o = c.newInstance();
	   //���Ʒ�װ,����java���Բ���ȫ
	   idf.setAccessible(true);
	   idf.set(o,"001");
		System.out.println(idf.get(o));//001
	}
}

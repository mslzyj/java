    /*
  java.lang.reflect
*/
import java.lang.reflect.*;
class ReflectTest09 
{
	public static void main(String[] args) throws Exception 
	{
		//��ȡ��
		Class c = Class.forName("Test2");
        //��ȡĳ���ض��ķ���,ͨ�����������β��б�
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		//ͨ���������ִ��login����
		Object o = c.newInstance();
		//����o�����m����������������������������reValue��
		Object reValue = m.invoke(o,"z","123");
		System.out.println(reValue);
	}
}

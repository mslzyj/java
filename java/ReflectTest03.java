/*
  ��ȡclass���͵Ķ���֮�󣬿��Դ�������Ķ���
*/
import java.util.*;
import java.text.*;
class ReflectTest03 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("ReflectTest01test");
		//��������Class��������ʾ�����һ����ʵ��
		Object o = c.newInstance();//ReflectTest01test����޲������췽��(�˷����������޲������췽��)

		System.out.println(o);// ReflectTest01test@15db9742

		//���ϵͳ��ǰʱ��
		Class c1 = Class.forName("java.util.Date");
        Object o1 = c1.newInstance();
		if(o1 instanceof Date){
		  Date t = (Date)o1;
		  System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		}
	 }
}

/*
ReflectTest01test����޲������췽��
ReflectTest01test@15db9742
2017-05-22 15:34:12 059
�밴���������. . .
*/
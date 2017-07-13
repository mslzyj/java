/*
java.lang.reflect.Filed���е�����
*/
import java.lang.reflect.*;
class ReflectTest06 
{
	public static void main(String[] args) throws Exception
	{
		//��ȡ������
		Class c = Class.forName("User");
		//��ȡ����Filed
		//��ȡ����public���ε�����
		Field [] fs = c.getFields();
		System.out.println(fs.length);
		System.out.println(fs[0].getName());
		System.out.println(".............................");
		//��ȡ���е�����
		Field [] fs1 = c.getDeclaredFields();
		for(Field field:fs1){
			//getModifiers��Ϊ���������ɴ� Member ����ʾ�ĳ�Ա���췽���� 
			//Java �������η���Ӧ��ʹ�� Modifier ����������е����η�
		 int i = field.getModifiers();
		 System.out.println(i);
		 System.out.println(".............................");
		 String strmodifiers = Modifier.toString(i);
         System.out.println(strmodifiers);
		 System.out.println(".............................");
		 Class type = field.getType();
         System.out.println(type.getName());//��ȡ���͵ĵ�һ�ַ�ʽ
		 System.out.println(type.getSimpleName());//��ȡ���͵ĵڶ��ַ�ʽ
		 System.out.println(field.getName());
		}
        System.out.println(".............................");

		//��ȡ������
        
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class"+" "+c.getSimpleName()+"{\n");
		for(Field field:fs1){
		 sb.append("\t");
		 sb.append(Modifier.toString(field.getModifiers())+" ");
		 sb.append(field.getType().getSimpleName()+" ");
		 sb.append(field.getName()+";\n");
		}
		sb.append("}");
		System.out.println(sb);

	}
}

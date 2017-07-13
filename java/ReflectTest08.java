
/*
  java.reflect.Method;
*/
import java.lang.reflect.*;
class ReflectTest08 
{
	public static void main(String[] args) throws Exception
	{
		//��ȡ��
		Class c = Class.forName("Test2");
		//��ȡ���еķ���
		Method[] ms = c.getDeclaredMethods();//���� Method �����һ�����飬��Щ����ӳ�� Class �����ʾ�����ӿ����������з���
		for(Method m : ms){
		  System.out.println(Modifier.toString(m.getModifiers()));//Modifier����ͳ�Ա�������η����н���
		  //�����ķ���ֵ����
		  Class returnType = m.getReturnType();
		
		  System.out.println(returnType.getSimpleName());//�õ����͵ļ�д����
		  //������
		  System.out.println(m.getName());
		  //�������β��б�
		  Class [] ParameterType = m.getParameterTypes();//getParameterTypes()��������˳�򷵻� Class ��������飬��Щ���������˴� Method ��������ʾ�ķ������β����͡�
		  for(Class ParmeterType:ParameterType )
			    System.out.println(ParmeterType.getSimpleName());
		}
        System.out.println("..............������.............");
		//������
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class");
		sb.append(c.getSimpleName()+"{\n");
		for(Method m:ms){
		  sb.append("\t");
		  sb.append(Modifier.toString(m.getModifiers())+" ");
		  sb.append(m.getReturnType().getSimpleName()+" ");
		  sb.append(m.getName()+"(");
		  //�β�
		  Class [] parameterTypes = m.getParameterTypes();
		  for(int i = 0;i<parameterTypes.length;i++){
			Class parameterType = parameterTypes[i];
			if(i==parameterTypes.length-1){
			   sb.append(parameterType.getSimpleName());
			}else{
				sb.append(parameterType.getSimpleName()+",");
			  }
			}
			sb.append("){}\n");
			
		}
		sb.append("}\n");
		
		System.out.println(sb);
	}
}

/*
  ��ȡ���췽��
*/
import java.lang.reflect.*;
class ReflectTest10 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Test2");
		//��ȡ���еĹ��췽��
		Constructor[] cs = c.getDeclaredConstructors();
		for(Constructor con : cs){
		  //��ȡ���η�
		  System.out.println(Modifier.toString(con.getModifiers()));
		  //��ȡ���췽����
		  System.out.println(c.getName());
		  //���췽������ʽ�����б�
		  Class [] parameterTypes = con.getParameterTypes();
		  for(Class parameterTyppe :parameterTypes){
		   System.out.println(parameterTyppe.getSimpleName());
		  }
		}
		//������
        StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class"+c.getSimpleName()+"{\n");
		//���췽��
		for(Constructor con:cs){
		  sb.append("\t");
		  sb.append(Modifier.toString(con.getModifiers())+" ");
		  sb.append(c.getSimpleName()+"(");
		  //�β�
		  Class [] parameterTypes = con.getParameterTypes();
		  for(int i=0;i<parameterTypes.length;i++){
		   Class parameterType = parameterTypes[i];
		   if(i==parameterTypes.length-1){
		    sb.append(parameterType.getSimpleName());
		   }
		   else{
		    sb.append(parameterType.getSimpleName()+",");
		   }
		  }
		  sb.append("){}\n");
		}
		sb.append("}");
		System.out.println(sb);
	}
}
/*
public
Test2
classTest2{
        public Test2(){}
}
�밴���������. . .
*/

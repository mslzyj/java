/*
  ���ȡ����͸��ӿ�
*/

class ReflectTest12 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("java.lang.String");
        //��ȡ����
		Class superclass = c.getSuperclass();
		System.out.println(superclass.getName());
		//��ȡ���ӿ�(���)
		Class [] ins = c.getInterfaces();
		for(Class in :ins){
		System.out.println(in.getName());
		}
	}
/*
java.lang.Object
java.io.Serializable
java.lang.Comparable
java.lang.CharSequence
�밴���������. . .

*/
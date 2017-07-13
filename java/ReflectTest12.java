/*
  类获取父类和父接口
*/

class ReflectTest12 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("java.lang.String");
        //获取父类
		Class superclass = c.getSuperclass();
		System.out.println(superclass.getName());
		//获取父接口(多个)
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
请按任意键继续. . .

*/
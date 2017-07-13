/*
   java.lang.reflect.Field获取某个特定的属性
*/
import java.lang.reflect.*;
class ReflectTest07 
{
	public static void main(String[] args) throws Exception
	{
		//获取类
		Class c = Class.forName("User");
	   //获取id属性
	   Field idf = c.getDeclaredField("id");
	   //获取某个特定的属性可以用来代替set..，get..
	   Object o = c.newInstance();
	   //打破封装,导致java属性不安全
	   idf.setAccessible(true);
	   idf.set(o,"001");
		System.out.println(idf.get(o));//001
	}
}

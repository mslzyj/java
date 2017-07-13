    /*
  java.lang.reflect
*/
import java.lang.reflect.*;
class ReflectTest09 
{
	public static void main(String[] args) throws Exception 
	{
		//获取类
		Class c = Class.forName("Test2");
        //获取某个特定的方法,通过方法名加形参列表
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		//通过反射机制执行login方法
		Object o = c.newInstance();
		//调用o对象的m方法，传递两个参数将结果存放在reValue中
		Object reValue = m.invoke(o,"z","123");
		System.out.println(reValue);
	}
}

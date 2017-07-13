/*
  获取class类型的对象之后，可以创建该类的对象
*/
import java.util.*;
import java.text.*;
class ReflectTest03 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("ReflectTest01test");
		//创建此类Class对象所表示的类的一个新实例
		Object o = c.newInstance();//ReflectTest01test类的无参数构造方法(此方法调用了无参数构造方法)

		System.out.println(o);// ReflectTest01test@15db9742

		//获得系统当前时间
		Class c1 = Class.forName("java.util.Date");
        Object o1 = c1.newInstance();
		if(o1 instanceof Date){
		  Date t = (Date)o1;
		  System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		}
	 }
}

/*
ReflectTest01test类的无参数构造方法
ReflectTest01test@15db9742
2017-05-22 15:34:12 059
请按任意键继续. . .
*/
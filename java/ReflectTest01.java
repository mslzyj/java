/*
   获取Class的三种方式
*/
import java.util.Date;
class  ReflectTest01
{
	public static void main(String[] args) throws Exception
	{
		/*获取ReflectTest01test类*/
		//第一种方式
		//c1引用保存内存地址只想堆中的对象，该对象代表的时ReflectTest01test整个类
		Class c1= Class.forName("ReflectTest01test");
		//第二种方式
		//java种每个类型都有clas属性
		Class c2 = ReflectTest01test.class;
		//第三种方式
		//java语言种任何一个java对象都有getclass方法
		ReflectTest01test e = new ReflectTest01test();//e的运行时类时ReflectTest01test
		Class c3 = e.getClass();//c3时运行时类


        System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		/*获取java.util.Date类*/
		Class c4 = Class.forName("java.util.Date");//必须写类全名
		Class c5 = Date.class;

		Date d = new Date();
		Class c6 = d.getClass();

		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		
	}
}

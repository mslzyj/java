
/*
 配置文件test1.Properties中的内容：className = java.util.Date
*/
import java.io.*;
import java.util.*;
class ReflectTest05 
{
	public static void main(String[] args) throws Exception
	{
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.创建流
        FileInputStream  fr = new FileInputStream("test1.Properties"); 
		//加载
		p.load(fr);
		//通过key获取value
		String className = p.getProperty("className");
		System.out.println(className);
		//通过反射机制创建对象
		Class c = Class.forName(className);
		Object o = c.newInstance();
		System.out.println(o);
	}
}
/*
java.util.Date
Mon May 22 18:05:19 CST 2017
请按任意键继续. . .

*/

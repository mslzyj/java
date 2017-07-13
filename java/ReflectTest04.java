/*
  IO+Properties
  配置文件(属性文件通常以.Properties结束)test：（内容：username=zhangsan）
  将配置文件中的汉字转换成Unicode码方法：
  命令行输入： 
        1. native2ascii 回车
		2. 输入汉字    
		3.将转换成的Unicode码复制到配置文件相应的位置
		李四

*/
import java.io.*;
import java.util.*;
class ReflectTest04 
{
	public static void main(String[] args) throws Exception
	{
		//创建属性对象
		Properties p = new Properties();//同map，单Key和Value只能是字符串，Key不能重复，如果重复则Value覆盖
		//创建输入流
		FileInputStream fis =new  FileInputStream("test.Properties");
		//将fis流中的所有数据加载到属性对象中
		p.load(fis);
		fis.close();
		String v = p.getProperty("username");
		System.out.println(v);
	}
}

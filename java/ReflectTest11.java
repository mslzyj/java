/*
  反射某个类某个构造方法，创建对象
*/
import java.lang.reflect.*;
class ReflectTest11 
{
	public static void main(String[] args) throws Exception 
	{
		//获取类
        Class c = Class.forName("Customer");
		//获取特定的构造方法
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		//创建对象
		Object o = con.newInstance("zhangsan",90);
		System.out.println(o);
	}
}
class Customer
{
	String name;
	int age;
	Customer(String name,int age){
	  this.name = name;
	  this.age=age;
	}
	public String toString(){
	  return "Customer["+name+","+age+"]";
	}


}
/*
Customer[zhangsan,90]
请按任意键继续. . .
*/
/*
  ����ĳ����ĳ�����췽������������
*/
import java.lang.reflect.*;
class ReflectTest11 
{
	public static void main(String[] args) throws Exception 
	{
		//��ȡ��
        Class c = Class.forName("Customer");
		//��ȡ�ض��Ĺ��췽��
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		//��������
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
�밴���������. . .
*/
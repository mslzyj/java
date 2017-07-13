/*
java.lang.reflect.Filed类中的属性
*/
import java.lang.reflect.*;
class ReflectTest06 
{
	public static void main(String[] args) throws Exception
	{
		//获取整个类
		Class c = Class.forName("User");
		//获取属性Filed
		//获取所有public修饰的属性
		Field [] fs = c.getFields();
		System.out.println(fs.length);
		System.out.println(fs[0].getName());
		System.out.println(".............................");
		//获取所有的属性
		Field [] fs1 = c.getDeclaredFields();
		for(Field field:fs1){
			//getModifiers作为整数返回由此 Member 所表示的成员或构造方法的 
			//Java 语言修饰符。应该使用 Modifier 类解码整数中的修饰符
		 int i = field.getModifiers();
		 System.out.println(i);
		 System.out.println(".............................");
		 String strmodifiers = Modifier.toString(i);
         System.out.println(strmodifiers);
		 System.out.println(".............................");
		 Class type = field.getType();
         System.out.println(type.getName());//获取类型的第一种方式
		 System.out.println(type.getSimpleName());//获取类型的第二种方式
		 System.out.println(field.getName());
		}
        System.out.println(".............................");

		//获取整个类
        
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class"+" "+c.getSimpleName()+"{\n");
		for(Field field:fs1){
		 sb.append("\t");
		 sb.append(Modifier.toString(field.getModifiers())+" ");
		 sb.append(field.getType().getSimpleName()+" ");
		 sb.append(field.getName()+";\n");
		}
		sb.append("}");
		System.out.println(sb);

	}
}

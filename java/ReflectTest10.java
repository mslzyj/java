/*
  获取构造方法
*/
import java.lang.reflect.*;
class ReflectTest10 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Test2");
		//获取所有的构造方法
		Constructor[] cs = c.getDeclaredConstructors();
		for(Constructor con : cs){
		  //获取修饰符
		  System.out.println(Modifier.toString(con.getModifiers()));
		  //获取构造方法名
		  System.out.println(c.getName());
		  //构造方法的形式参数列表
		  Class [] parameterTypes = con.getParameterTypes();
		  for(Class parameterTyppe :parameterTypes){
		   System.out.println(parameterTyppe.getSimpleName());
		  }
		}
		//反编译
        StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class"+c.getSimpleName()+"{\n");
		//构造方法
		for(Constructor con:cs){
		  sb.append("\t");
		  sb.append(Modifier.toString(con.getModifiers())+" ");
		  sb.append(c.getSimpleName()+"(");
		  //形参
		  Class [] parameterTypes = con.getParameterTypes();
		  for(int i=0;i<parameterTypes.length;i++){
		   Class parameterType = parameterTypes[i];
		   if(i==parameterTypes.length-1){
		    sb.append(parameterType.getSimpleName());
		   }
		   else{
		    sb.append(parameterType.getSimpleName()+",");
		   }
		  }
		  sb.append("){}\n");
		}
		sb.append("}");
		System.out.println(sb);
	}
}
/*
public
Test2
classTest2{
        public Test2(){}
}
请按任意键继续. . .
*/

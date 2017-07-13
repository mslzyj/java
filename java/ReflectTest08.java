
/*
  java.reflect.Method;
*/
import java.lang.reflect.*;
class ReflectTest08 
{
	public static void main(String[] args) throws Exception
	{
		//获取类
		Class c = Class.forName("Test2");
		//获取所有的方法
		Method[] ms = c.getDeclaredMethods();//返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法
		for(Method m : ms){
		  System.out.println(Modifier.toString(m.getModifiers()));//Modifier对类和成员访问修饰符进行解码
		  //方法的返回值类型
		  Class returnType = m.getReturnType();
		
		  System.out.println(returnType.getSimpleName());//得到类型的简写名称
		  //方法名
		  System.out.println(m.getName());
		  //方法的形参列表
		  Class [] ParameterType = m.getParameterTypes();//getParameterTypes()按照声明顺序返回 Class 对象的数组，这些对象描述了此 Method 对象所表示的方法的形参类型。
		  for(Class ParmeterType:ParameterType )
			    System.out.println(ParmeterType.getSimpleName());
		}
        System.out.println("..............反编译.............");
		//反编译
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+"class");
		sb.append(c.getSimpleName()+"{\n");
		for(Method m:ms){
		  sb.append("\t");
		  sb.append(Modifier.toString(m.getModifiers())+" ");
		  sb.append(m.getReturnType().getSimpleName()+" ");
		  sb.append(m.getName()+"(");
		  //形参
		  Class [] parameterTypes = m.getParameterTypes();
		  for(int i = 0;i<parameterTypes.length;i++){
			Class parameterType = parameterTypes[i];
			if(i==parameterTypes.length-1){
			   sb.append(parameterType.getSimpleName());
			}else{
				sb.append(parameterType.getSimpleName()+",");
			  }
			}
			sb.append("){}\n");
			
		}
		sb.append("}\n");
		
		System.out.println(sb);
	}
}

/*

*/
class ReflectTest02 
{
	public static void main(String[] args) throws Exception
	{
		//将A.class文件加载到虚拟机中的过程
		Class.forName("A");
	}
}
class A
{
	static {
	 System.out.println("Hello World!");
	}
}

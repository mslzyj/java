/*

*/
class ReflectTest02 
{
	public static void main(String[] args) throws Exception
	{
		//��A.class�ļ����ص�������еĹ���
		Class.forName("A");
	}
}
class A
{
	static {
	 System.out.println("Hello World!");
	}
}

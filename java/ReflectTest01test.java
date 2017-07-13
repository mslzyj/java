class ReflectTest01test 
{
	//Filed
	private String name;
	//Construction
	public ReflectTest01test(){
	    System.out.println("ReflectTest01test类的无参数构造方法");
	}
	public ReflectTest01test(String name){
	 this.name=name;
	}
	//Method
	public void work(){
		  System.out.println(name+"Hellod Word");
	}
	
}

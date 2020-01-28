package ArrayBasic;

public class ParameterExample {

	String name;
	int age;
	double height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void ParamaterExample(String name,int age,double height) {
		this.height = height;
		this.age = age;
		this.name = name;
		
	}
	 
	
	public static void main (String[]args) {
		
	ParameterExample obj1 =new ParameterExample();
		
		obj1.ParamaterExample("Moni", 26, 5.6);
		System.out.println(obj1.getName() +" " + obj1.getAge()+  " "+ obj1.getHeight());
			
		
	ParameterExample obj2 =new ParameterExample();
		
		obj2.ParamaterExample("Rahat", 29, 5.0);
		System.out.println(obj2.getName() +" " + obj2.getAge()+  " "+ obj2.getHeight());
		
	}

}

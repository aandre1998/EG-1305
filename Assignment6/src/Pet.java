public class Pet {
	String name;
	String type;
	int age;
	
	public Pet(String name, String type, int age)
	{
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getAge()
	{
		return age;
	}
}

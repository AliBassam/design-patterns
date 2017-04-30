package observer;

public class Person {

	private String name;
	private String gender;
	private Integer age;
	
	public Person(String name, String gender, Integer age) {
		setName(name);
		setGender(gender);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

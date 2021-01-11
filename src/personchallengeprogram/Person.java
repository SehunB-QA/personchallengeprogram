package personchallengeprogram;


public class Person {
	String name = "";
	int age;
	String jobTitle = "";
	
	
	
	
	@Override
	public String toString(){
		return "Name: "  +  name + "\n" + "Age: " + age + "\n" + "Job Title: " + jobTitle + "\n " ;
		
	}
	
	
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


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	
	
	

}

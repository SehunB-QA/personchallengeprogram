package personchallengeprogram;

public class Main {

	public static void main(String[] args) {
		Person personOne = new Person();
		Person personTwo = new Person();
		PersonList personListObject = new PersonList();
		personOne.setName("John Smith");
		personOne.setAge(30);
        personOne.setJobTitle("Postman");
        
		personTwo.setName("Jane Smith");
		personTwo.setAge(24);
        personTwo.setJobTitle("Doctor");
        
        personListObject.personList.add(personOne);
        personListObject.personList.add(personTwo);
        
       // personListObject.DisplayPersonList();
        
        personListObject.SearchForPersonNameInList("Jane Smith");
        
        //System.out.println(personOne.toString());
	}

}

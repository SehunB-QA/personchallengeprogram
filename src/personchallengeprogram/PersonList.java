//Sehun Babatunde
package personchallengeprogram;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	public List<Person> personList = new ArrayList<>();
	
	public void process(Person persons) {
        System.out.println(persons);
    }

	
	
	public void DisplayPersonList(){
		
		 for(Person person : personList) {
	            process(person);
	        }

	}
	
	public String SearchForPersonNameInList(String personName)
	{
		// Thanks :)  : https://stackoverflow.com/questions/12496038/searching-in-a-arraylist-with-custom-objects-for-certain-strings
		  for (Person name : personList)
		  {
			  if(name.getName() != null && name.getName().contains(personName)) {
		               System.out.println(name);
		         }
		  }
		  
		return personName;
	
	}

}

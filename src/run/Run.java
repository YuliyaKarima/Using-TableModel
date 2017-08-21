package run;
import java.util.ArrayList;
import java.util.List;

import model.Model;
import view.SimpleTable;

/**
 * Main-Class of the application
 * 
 * @author Yuliya
 *
 */
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating data for app's model
		Person person1 = new Person("Bob Harris", "123 Low Street", "222-222-2222", "bob@harris.org", "(123) 123-1234",
				"(123) 123-1234");
		Person person2 = new Person("John Lewis", "123 Foo Street", "333-333-3333", "john@lewis.org", "(123) 123-1234",
				"(123) 123-1234");
		Person person3 = new Person("Bill Harris", "123 High Street", "444-444-4444", "bill@harris.org",
				"(123) 123-1234", "(123) 123-1234");
		List<Person> person = new ArrayList<Person>();
		person.add(person1);
		person.add(person2);
		person.add(person3);
		// setting model's data
		Model mainModel = new Model(person);
		//
		// creating view and passing model to constructor
		SimpleTable client = new SimpleTable(mainModel);
		// starting model
		client.launchFrame();
	}

}

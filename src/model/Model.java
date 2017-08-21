package model;

import java.util.List;

import run.Person;

/**
 * Application's model
 * 
 * @author Yuliya
 *
 */
public class Model {
	// Model's data
	private List<Person> data;

	/**
	 * Constructor sets model's data
	 * 
	 * @param a_data
	 *            object List<Person> - model's data
	 */
	public Model(List<Person> a_data) {
		data = a_data;
	}

	/**
	 * Retrieves model's data
	 * 
	 * @return object List<Person> - model's data
	 */
	public List<Person> getData() {
		return data;
	}

	/**
	 * Sets model's data
	 * 
	 * @param a_data
	 *            object List<Person> - model's data
	 */
	public void setData(List<Person> a_data) {
		data = a_data;
	}

}

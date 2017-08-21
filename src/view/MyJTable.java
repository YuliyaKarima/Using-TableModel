package view;

import java.util.List;

import javax.swing.JTable;

import run.MyTableModel;
import run.Person;

/**
 * Realization of JTable for the view
 * 
 * @author Yuliya
 *
 */
public class MyJTable extends JTable {
	/**
	 * Constructor takes List of Person objects
	 * 
	 * @param data
	 */
	public MyJTable(List<Person> data) {
		// passes List of Person objects to constructor of MyTableModel
		setModel(new MyTableModel(data));
	}
}

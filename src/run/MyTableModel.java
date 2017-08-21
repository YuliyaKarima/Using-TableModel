package run;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * Implementation of TableModel
 * 
 * @author Yuliya
 *
 */
public class MyTableModel implements TableModel {
	// list of object of type Person that will be displaying on the table
	private List<Person> data;
	// not used in this version
	private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

	/**
	 * Constructor sets value for variable data
	 * 
	 * @param data
	 *            List<Person>
	 */
	public MyTableModel(List<Person> data) {
		super();
		this.data = data;
	}

	/**
	 * Returns column's names by columns name. We use "switch - case"
	 * construction to set column name accordingly to the name of Person class
	 * field
	 */
	public String getColumnName(int column) {
		String name = null;
		switch (column) {
		case (0):
			name = "Address";
			break;
		case (1):
			name = "Email";
			break;
		case (2):
			name = "Home Phone";
			break;
		case (3):
			name = "Name";
			break;
		case (4):
			name = "Ssn";
			break;
		case (5):
			name = "Work Phone";
			break;
		default:
			name = null;
		}
		return name;
	}

	/**
	 * Determines how much rows the table will be contain by returning size of
	 * variable data
	 */
	public int getRowCount() {
		return data.size();
	}

	/**
	 * Determines how much columns the table will be contain by returning count
	 * of Person class fields
	 */
	public int getColumnCount() {
		return 6;
	}

	//
	/**
	 * Returns Class object of columns - in this case it's String.class because
	 * all fields of Person are of type String
	 */
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	/**
	 * Determines a value at the cell with definite row index and column index
	 * of the table by calling getter methods to data object
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object object;
		switch (columnIndex) {
		case (0):
			object = ((Person) data.get(rowIndex)).getAddress();
			break;
		case (1):
			object = ((Person) data.get(rowIndex)).getEmail();
			break;
		case (2):
			object = ((Person) data.get(rowIndex)).getHomePhone();
			break;
		case (3):
			object = ((Person) data.get(rowIndex)).getName();
			break;
		case (4):
			object = ((Person) data.get(rowIndex)).getSsn();
			break;
		case (5):
			object = ((Person) data.get(rowIndex)).getWorkPhone();
			break;
		default:
			object = null;
		}
		return object;
	}

	/**
	 * Sets cells not editable
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	// not used in this version
	public void removeTableModelListener(TableModelListener listener) {
		listeners.remove(listener);
	}

	// not used in this version
	public void setValueAt(Object value, int rowIndex, int columnIndex) {

	}

	public void addTableModelListener(TableModelListener listener) {
		listeners.add(listener);
	}
}

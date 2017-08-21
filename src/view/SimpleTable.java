package view;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;

import model.Model;
import run.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Application view
 * 
 * @author Yuliya
 *
 */
public class SimpleTable {
	// view's components
	JFrame tableFrame;
	JTable table;
	JScrollPane scroller;
	// view's model
	Model the_model;

	/**
	 * Constructor sets view's model
	 * 
	 * @param a_model
	 *            view's model
	 */
	public SimpleTable(Model a_model) {
		the_model = a_model;
	}

	/**
	 * Method initialize view's components, size and visibility
	 */
	public void launchFrame() {

		tableFrame = new JFrame("Table");
		// passing model's data List to component JMyTable
		table = new MyJTable(the_model.getData());
		scroller = new JScrollPane(table);
		tableFrame.add(scroller);
		tableFrame.setVisible(true);
		tableFrame.setSize(220, 220);
	}
}

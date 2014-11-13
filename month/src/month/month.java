package month;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;


import javax.swing.JComboBox;
import javax.swing.JFrame;

public class month {

	private JFrame calender;
	
	public static final String[] MONTHS = {"Janurary","February","March","April","May","June","July","August","September","October","November","December"};
	
	
	
	public static final String[] DAYS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	
	
	
	public static final int[] YEARS = {2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					month window = new month();
					window.calender.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public month() {
		
		initialize();
	
	
	}	

	
	private void initialize() {
		
		
		calender = new JFrame();
		calender.setBounds(250, 250, 250, 250);
		calender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calender.getContentPane().setLayout(null);
		
		final JComboBox<String> comboBox = new JComboBox<String>(MONTHS);
		comboBox.setBounds(90, 90,90,90);
		calender.getContentPane().add(comboBox);
	}
}
	
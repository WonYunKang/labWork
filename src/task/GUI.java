package task;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

	static JFrame jf;
	static JFrame Fin;
	private CardLayout cards = new CardLayout();

	DefaultTableModel model;
	Calendar cal = new GregorianCalendar();
	JLabel label;

	JTextField Year, Month, Day;
	JTextField Year2, Month2, Day2;
	JTextField Year3, Month3, Day3;

	GUI() {
		


		/*
		 * Panel p1 = new Panel(new GridLayout(1,1)); p1.add(new JButton("==MENU=="));
		 * 
		 * 
		 * 
		 * Panel p2 = new Panel(new GridLayout(1,1)); p2.add(new JButton("양음력변환"));
		 * Panel p3 = new Panel(new GridLayout(1,1)); p3.add(new JButton("날짜계산")); Panel
		 * p4 = new Panel(new GridLayout(1,1)); p4.add(new JButton("전역일계산")); Panel p5 =
		 * new Panel(new GridLayout(1,1)); p5.add(new JButton("만나이계산"));
		 */

		getContentPane().setLayout(cards);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		this.setTitle("Calandar");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setVisible(true);

		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.blue);

		/*
		 * JButton b1 = new JButton("<<<"); b1.addActionListener(new ActionListener() {
		 * public void actionPerformed(ActionEvent ae) { cal.add(Calendar.MONTH, -1);
		 * updateMonth(); } }); JButton b1 = new JButton("<<<");
		 * b1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent ae) { cal.add(Calendar.MONTH, -1); updateMonth();
		 * } }); JButton b1 = new JButton("<<<"); b1.addActionListener(new
		 * ActionListener() { public void actionPerformed(ActionEvent ae) {
		 * cal.add(Calendar.MONTH, -1); updateMonth(); } }); JButton b1 = new
		 * JButton("<<<"); b1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent ae) { cal.add(Calendar.MONTH, -1); updateMonth();
		 * } }); JButton b1 = new JButton("<<<"); b1.addActionListener(new
		 * ActionListener() { public void actionPerformed(ActionEvent ae) {
		 * cal.add(Calendar.MONTH, -1); updateMonth(); } });
		 * 
		 */

		JButton b1 = new JButton("<<<");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cal.add(Calendar.MONTH, -1);
				updateMonth();
			}
		});

		JButton p2 = new JButton("<<MENU>>");
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				jf = new JFrame("Home");
			

				JTabbedPane jtab = new JTabbedPane();

				// jp1.setBackground(Color.red);

				JLabel jp11 = new JLabel();

				JPanel mainPanel = new JPanel();
				mainPanel.add(jp11);
				jtab.addTab("날짜계산", mainPanel);
				GridLayout grid = new GridLayout(4, 2);
				grid.setVgap(4);

				mainPanel.add(new JLabel("Year : "));
				Year = new JTextField(4);
				mainPanel.add(Year);

				mainPanel.add(new JLabel("Month : "));
				Month = new JTextField(4);
				mainPanel.add(Month);

				mainPanel.add(new JLabel("Day : "));
				Day = new JTextField(4);
				mainPanel.add(Day);

				JButton CH = new JButton(">>>");
				mainPanel.add(CH, BorderLayout.WEST);

				CH.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String num1 = Year.getText().toString();
						String num2 = Month.getText().toString();
						String num3 = Day.getText().toString();

						int YearCh = Integer.parseInt(num1);
						int MonthCh = Integer.parseInt(num2);
						int DayCh = Integer.parseInt(num3);

						try {
							D_Day d = new D_Day();
							int q = d.getDDay(YearCh, MonthCh, DayCh);
							mainPanel.add(new JLabel("일수는 : " + q + " 일 차이납니다"));

						} catch (Exception e) {
							mainPanel.add(new JLabel("ERROR"));
						}

					}
				});

				JLabel jp12 = new JLabel();

				JPanel mainPanel2 = new JPanel();
				mainPanel2.add(jp12);
				jtab.addTab("전역일계산", mainPanel2);
				GridLayout grid2 = new GridLayout(4, 2);
				grid2.setVgap(4);

				mainPanel2.add(new JLabel("Year : "));
				Year2 = new JTextField(4);
				mainPanel2.add(Year2);

				mainPanel2.add(new JLabel("Month : "));
				Month2 = new JTextField(4);
				mainPanel2.add(Month2);

				mainPanel2.add(new JLabel("Day : "));
				Day2 = new JTextField(4);
				mainPanel2.add(Day2);

				JButton CH2 = new JButton(">>>");
				mainPanel2.add(CH2, BorderLayout.WEST);

				CH2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String num12 = Year2.getText().toString();
						String num22 = Month2.getText().toString();
						String num32 = Day2.getText().toString();

						int YearCh2 = Integer.parseInt(num12);
						int MonthCh2 = Integer.parseInt(num22);
						int DayCh2 = Integer.parseInt(num32);

						try {
							Mar d2 = new Mar();
							int q2 = d2.getDDay(YearCh2, MonthCh2, DayCh2);
							mainPanel2.add(new JLabel("전역일까지 : " + q2 + " 일 남았습니다"));

						} catch (Exception e) {
							mainPanel2.add(new JLabel("ERROR"));
						}

					}
				});

				JLabel jp13 = new JLabel();

				JPanel mainPanel3 = new JPanel();
				mainPanel3.add(jp13);
				jtab.addTab("만 나이계산", mainPanel3);
				GridLayout grid3 = new GridLayout(4, 2);
				grid3.setVgap(4);

				mainPanel3.add(new JLabel("Year : "));
				Year3 = new JTextField(4);
				mainPanel3.add(Year3);

				mainPanel3.add(new JLabel("Month : "));
				Month3 = new JTextField(4);
				mainPanel3.add(Month3);

				mainPanel3.add(new JLabel("Day : "));
				Day3 = new JTextField(4);
				mainPanel3.add(Day3);

				JButton CH3 = new JButton(">>>");
				mainPanel3.add(CH3, BorderLayout.WEST);

				CH3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						String num13 = Year3.getText().toString();
						String num23 = Month3.getText().toString();
						String num33 = Day3.getText().toString();

						int YearCh3 = Integer.parseInt(num13);
						int MonthCh3 = Integer.parseInt(num23);
						int DayCh3 = Integer.parseInt(num33);

						try {
							Age d3 = new Age();
							int q3 = d3.getAge(YearCh3, MonthCh3, DayCh3);
							mainPanel3.add(new JLabel("나이는 : " + q3 + " 살 입니다"));

						} catch (Exception e) {
							mainPanel3.add(new JLabel("ERROR"));
						}

					}
				});

				jf.setLocation(700, 400);
				jf.setSize(400, 300);
				jf.add("Center", jtab);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setVisible(true);
				jf.setLocationRelativeTo(null);
			}
		});

		JButton b2 = new JButton(">>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				cal.add(Calendar.MONTH, +1);
				updateMonth();
			}
		});

		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());

		panel.add(b1, BorderLayout.WEST);

		panel.add(label, BorderLayout.CENTER);
		panel.add(b2, BorderLayout.EAST);
		panel.add(p2, BorderLayout.CENTER);

		String[] columns = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		model = new DefaultTableModel(null, columns);
		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);

		this.add(panel, BorderLayout.NORTH);
		this.add(pane, BorderLayout.CENTER);

		this.updateMonth();

	}

	void updateMonth() {
		cal.set(Calendar.DAY_OF_MONTH, 1);

		String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
		int year = cal.get(Calendar.YEAR);
		label.setText(month + " " + year);

		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

		model.setRowCount(0);
		model.setRowCount(weeks);

		int i = startDay - 1;
		for (int day = 1; day <= numberOfDays; day++) {
			model.setValueAt(day, i / 7, i % 7);
			i = i + 1;

		}

	}

}

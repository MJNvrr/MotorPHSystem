package motorPHManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EmployeeLeaveProcessingPage {

	private JFrame frmEmployeeLeaveProcess;
	private JTable LeaveListtable;
	private JScrollPane LeaveListScrollPanel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLeaveProcessingPage window = new EmployeeLeaveProcessingPage();
					window.frmEmployeeLeaveProcess.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeLeaveProcessingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeLeaveProcess = new JFrame();
		frmEmployeeLeaveProcess.getContentPane().setBackground(new Color(192, 192, 192));
		frmEmployeeLeaveProcess.setTitle("Employee Leave Processing Page");
		frmEmployeeLeaveProcess.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeaveProcess.setBounds(100, 100, 1015, 881);
		frmEmployeeLeaveProcess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeLeaveProcess.getContentPane().setLayout(null);
		
		LeaveListScrollPanel = new JScrollPane();
		LeaveListScrollPanel.setBounds(229, 235, 764, 490);
		frmEmployeeLeaveProcess.getContentPane().add(LeaveListScrollPanel);
		
		LeaveListtable = new JTable();
		LeaveListtable.setBackground(new Color(255, 255, 255));
		LeaveListScrollPanel.setViewportView(LeaveListtable);
		LeaveListtable.setColumnSelectionAllowed(true);
		LeaveListtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Employee No", "Last Name", "First Name", "Position", "Start Date", "End Date", "Status"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		LeaveListtable.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnSystemManagementIT = new JButton("System Management (IT)");
		btnSystemManagementIT.setBounds(14, 509, 200, 50);
		btnSystemManagementIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSystemManagementIT.setBackground(new Color(255, 255, 255));
		btnSystemManagementIT.setFont(new Font("Arial", Font.BOLD, 13));
		frmEmployeeLeaveProcess.getContentPane().add(btnSystemManagementIT);
		
		JButton btnPayrollManagement = new JButton("Payroll Processing");
		btnPayrollManagement.setBounds(16, 440, 200, 50);
		btnPayrollManagement.setFont(new Font("Arial", Font.BOLD, 14));
		btnPayrollManagement.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnPayrollManagement);
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.setBounds(15, 375, 200, 50);
		btnEmployeeManagement.setFont(new Font("Arial", Font.BOLD, 14));
		btnEmployeeManagement.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnEmployeeManagement);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(15, 674, 200, 50);
		btnSignOut.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignOut.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnSignOut);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(15, 235, 200, 50);
		btnDashboard.setFont(new Font("Arial", Font.BOLD, 14));
		btnDashboard.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnDashboard);
		
		JButton btnLeaveRequest = new JButton("Leave Process");
		btnLeaveRequest.setBounds(15, 305, 200, 50);
		btnLeaveRequest.setFont(new Font("Arial", Font.BOLD, 14));
		btnLeaveRequest.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(btnLeaveRequest);
		
		JPanel panelDepartment = new JPanel();
		panelDepartment.setBounds(15, 68, 200, 35);
		panelDepartment.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(panelDepartment);
		
		JLabel DepartmentLabel = new JLabel("Department: Human Resources");
		panelDepartment.add(DepartmentLabel);
		DepartmentLabel.setBackground(new Color(255, 255, 255));
		DepartmentLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel Timepanel = new JPanel();
		Timepanel.setBounds(17, 118, 200, 25);
		Timepanel.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(Timepanel);
		
		JLabel lblTimeAm = new JLabel("Time: 09:00 AM");
		Timepanel.add(lblTimeAm);
		lblTimeAm.setFont(new Font("Arial", Font.BOLD, 12));
		lblTimeAm.setBackground(Color.WHITE);
		
		JPanel Datepanel = new JPanel();
		Datepanel.setBounds(17, 157, 200, 25);
		Datepanel.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(Datepanel);
		
		JLabel lblDateMarch = new JLabel("Date: March 9,2024");
		Datepanel.add(lblDateMarch);
		lblDateMarch.setFont(new Font("Arial", Font.BOLD, 12));
		lblDateMarch.setBackground(Color.WHITE);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(16, 609, 200, 50);
		btnSettings.setFont(new Font("Arial", Font.BOLD, 14));
		btnSettings.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnSettings);
		
		JLabel WelcomeLabel_ = new JLabel("Welcome to MotorPH Leave Processing");
		WelcomeLabel_.setBounds(406, 16, 318, 20);
		WelcomeLabel_.setFont(new Font("Arial", Font.BOLD, 16));
		frmEmployeeLeaveProcess.getContentPane().add(WelcomeLabel_);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(989, 722, 2, 2);
		frmEmployeeLeaveProcess.getContentPane().add(scrollPane_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(528, 786, 89, 23);
		frmEmployeeLeaveProcess.getContentPane().add(btnNewButton);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SearchButton.setBounds(653, 198, 89, 23);
		frmEmployeeLeaveProcess.getContentPane().add(SearchButton);
		
		textField = new JTextField();
		textField.setText("Enter Employee No ");
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(746, 201, 247, 25);
		frmEmployeeLeaveProcess.getContentPane().add(textField);
	}
}

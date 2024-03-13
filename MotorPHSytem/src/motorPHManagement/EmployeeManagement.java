package motorPHManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeManagement {

	private JFrame frmEmployeeManagement;
	private JTable table;
	private JTextField employeeNotextField;
	private JTextField lastNametextField;
	private JTextField firstNametextField;
	private JTextField birthdaytextField;
	private JTextField phoneNotextField;
	private JTextField addresstextField;
	private JTextField ssstextField;
	private JTextField tinNotextField;
	private JTextField pagibigtextField;
	private JTextField philhealthtextField;
	private JTextField statusField;
	private JTextField positiontextField;
	private JTextField departmenttextField;
	private JTextField supervisortextField;
	private JTextField riceSubsidytextField;
	private JTextField phoneAllowancetextField;
	private JTextField clothingAllowancetextField;
	private JTextField basicSalarytextField;
	private JTextField hourlyRatetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement window = new EmployeeManagement();
					window.frmEmployeeManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeManagement = new JFrame();
		frmEmployeeManagement.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeManagement.setTitle("Employee Management ");
		frmEmployeeManagement.setBounds(100, 100, 1015, 881);
		frmEmployeeManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeManagement.getContentPane().setLayout(null);
		
		JLabel WelcomeLabel_ = new JLabel("Welcome to MotorPH Employee Management");
		WelcomeLabel_.setFont(new Font("Arial", Font.BOLD, 16));
		WelcomeLabel_.setBounds(359, 16, 365, 20);
		frmEmployeeManagement.getContentPane().add(WelcomeLabel_);
		
		JPanel panelDepartment = new JPanel();
		panelDepartment.setBackground(new Color(176, 196, 222));
		panelDepartment.setBounds(15, 80, 200, 40);
		frmEmployeeManagement.getContentPane().add(panelDepartment);
		
		JLabel DepartmentLabel = new JLabel("Department: Human Resources");
		panelDepartment.add(DepartmentLabel);
		DepartmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DepartmentLabel.setFont(new Font("Arial", Font.BOLD, 12));
		DepartmentLabel.setBackground(Color.WHITE);
		
		JPanel Timepanel = new JPanel();
		Timepanel.setBackground(new Color(176, 196, 222));
		Timepanel.setBounds(15, 183, 200, 31);
		frmEmployeeManagement.getContentPane().add(Timepanel);
		
		JLabel lblTimeAm = new JLabel("Time: 09:00 AM");
		Timepanel.add(lblTimeAm);
		lblTimeAm.setFont(new Font("Arial", Font.BOLD, 12));
		lblTimeAm.setBackground(Color.WHITE);
		
		JPanel Datepanel = new JPanel();
		Datepanel.setBackground(new Color(176, 196, 222));
		Datepanel.setBounds(15, 136, 200, 31);
		frmEmployeeManagement.getContentPane().add(Datepanel);
		
		JLabel lblDateMarch = new JLabel("Date: March 9,2024");
		lblDateMarch.setHorizontalAlignment(SwingConstants.CENTER);
		Datepanel.add(lblDateMarch);
		lblDateMarch.setFont(new Font("Arial", Font.BOLD, 12));
		lblDateMarch.setBackground(Color.WHITE);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDashboard.setBackground(new Color(255, 255, 255));
		btnDashboard.setBounds(16, 452, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnDashboard);
		
		JButton btnLeaveRequest = new JButton("Leave Process");
		btnLeaveRequest.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLeaveRequest.setBackground(new Color(255, 255, 255));
		btnLeaveRequest.setBounds(15, 509, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnLeaveRequest);
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.setFont(new Font("Arial", Font.BOLD, 14));
		btnEmployeeManagement.setBackground(new Color(176, 196, 222));
		btnEmployeeManagement.setBounds(15, 234, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnEmployeeManagement);
		
		JButton btnPayrollManagement = new JButton("Payroll Process");
		btnPayrollManagement.setFont(new Font("Arial", Font.PLAIN, 14));
		btnPayrollManagement.setBackground(new Color(255, 255, 255));
		btnPayrollManagement.setBounds(15, 565, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnPayrollManagement);
		
		JButton btnSystemManagementIT = new JButton("System Management (IT)");
		btnSystemManagementIT.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSystemManagementIT.setBackground(new Color(255, 255, 255));
		btnSystemManagementIT.setBounds(15, 623, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnSystemManagementIT);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSettings.setBackground(new Color(255, 255, 255));
		btnSettings.setBounds(13, 681, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnSettings);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSignOut.setBackground(new Color(255, 255, 255));
		btnSignOut.setBounds(13, 739, 200, 50);
		frmEmployeeManagement.getContentPane().add(btnSignOut);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(223, 558, 1600, 235);
		frmEmployeeManagement.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Employee No", "Last Name", "First Name", "Birthday", "Phone No", "Address", "SSS No", "Philhealth", "TIN No", "Pagibig No", "Status", "Position", "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance"
			}
		));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setColumnSelectionAllowed(true);
		table.setBackground(Color.WHITE);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.setBackground(new Color(240, 248, 255));
		btnAddEmployee.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddEmployee.setBounds(15, 294, 200, 31);
		frmEmployeeManagement.getContentPane().add(btnAddEmployee);
		
		JButton btnUpdateDetails = new JButton("Update Details");
		btnUpdateDetails.setFont(new Font("Arial", Font.BOLD, 12));
		btnUpdateDetails.setBackground(new Color(240, 248, 255));
		btnUpdateDetails.setBounds(15, 330, 200, 31);
		frmEmployeeManagement.getContentPane().add(btnUpdateDetails);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete.setBackground(new Color(240, 248, 255));
		btnDelete.setBounds(16, 367, 200, 31);
		frmEmployeeManagement.getContentPane().add(btnDelete);
		
		JLabel employeeNoLabelPI = new JLabel("Employee No:");
		employeeNoLabelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		employeeNoLabelPI.setBounds(246, 115, 111, 14);
		frmEmployeeManagement.getContentPane().add(employeeNoLabelPI);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lastNameLabel.setBounds(246, 151, 85, 14);
		frmEmployeeManagement.getContentPane().add(lastNameLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		firstNameLabel.setBounds(246, 186, 85, 14);
		frmEmployeeManagement.getContentPane().add(firstNameLabel);
		
		JLabel birthdayLabel = new JLabel("Birthday:");
		birthdayLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		birthdayLabel.setBounds(246, 222, 85, 14);
		frmEmployeeManagement.getContentPane().add(birthdayLabel);
		
		JLabel phoneNoLabel = new JLabel("Phone No:");
		phoneNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		phoneNoLabel.setBounds(246, 258, 85, 14);
		frmEmployeeManagement.getContentPane().add(phoneNoLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		addressLabel.setBounds(246, 297, 85, 14);
		frmEmployeeManagement.getContentPane().add(addressLabel);
		
		employeeNotextField = new JTextField();
		employeeNotextField.setColumns(10);
		employeeNotextField.setBounds(334, 108, 221, 25);
		frmEmployeeManagement.getContentPane().add(employeeNotextField);
		
		lastNametextField = new JTextField();
		lastNametextField.setColumns(10);
		lastNametextField.setBounds(334, 143, 221, 25);
		frmEmployeeManagement.getContentPane().add(lastNametextField);
		
		firstNametextField = new JTextField();
		firstNametextField.setColumns(10);
		firstNametextField.setBounds(334, 180, 221, 25);
		frmEmployeeManagement.getContentPane().add(firstNametextField);
		
		birthdaytextField = new JTextField();
		birthdaytextField.setColumns(10);
		birthdaytextField.setBounds(335, 216, 221, 25);
		frmEmployeeManagement.getContentPane().add(birthdaytextField);
		
		phoneNotextField = new JTextField();
		phoneNotextField.setColumns(10);
		phoneNotextField.setBounds(336, 252, 221, 25);
		frmEmployeeManagement.getContentPane().add(phoneNotextField);
		
		addresstextField = new JTextField();
		addresstextField.setColumns(10);
		addresstextField.setBounds(337, 290, 221, 25);
		frmEmployeeManagement.getContentPane().add(addresstextField);
		
		JSeparator PIseparator_4 = new JSeparator();
		PIseparator_4.setOrientation(SwingConstants.VERTICAL);
		PIseparator_4.setBounds(230, 96, 17, 232);
		frmEmployeeManagement.getContentPane().add(PIseparator_4);
		
		JSeparator PIseparator_3 = new JSeparator();
		PIseparator_3.setBounds(231, 327, 348, 14);
		frmEmployeeManagement.getContentPane().add(PIseparator_3);
		
		JSeparator PIseparator2 = new JSeparator();
		PIseparator2.setOrientation(SwingConstants.VERTICAL);
		PIseparator2.setBounds(606, 371, 17, 165);
		frmEmployeeManagement.getContentPane().add(PIseparator2);
		
		JLabel personalInformationLabel = new JLabel("Personal Information");
		personalInformationLabel.setFont(new Font("Arial", Font.BOLD, 14));
		personalInformationLabel.setBackground(Color.WHITE);
		personalInformationLabel.setBounds(231, 80, 153, 14);
		frmEmployeeManagement.getContentPane().add(personalInformationLabel);
		
		JSeparator PIseparator_1 = new JSeparator();
		PIseparator_1.setBounds(383, 87, 195, 14);
		frmEmployeeManagement.getContentPane().add(PIseparator_1);
		
		JLabel GovermentIdsInformationLabel = new JLabel("Goverment Id's Information");
		GovermentIdsInformationLabel.setFont(new Font("Arial", Font.BOLD, 14));
		GovermentIdsInformationLabel.setBackground(Color.WHITE);
		GovermentIdsInformationLabel.setBounds(230, 367, 210, 14);
		frmEmployeeManagement.getContentPane().add(GovermentIdsInformationLabel);
		
		JLabel sssLabel = new JLabel("SSS:");
		sssLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		sssLabel.setBounds(244, 397, 85, 14);
		frmEmployeeManagement.getContentPane().add(sssLabel);
		
		JLabel tinNoLabel = new JLabel("Tin No:");
		tinNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		tinNoLabel.setBounds(243, 431, 85, 14);
		frmEmployeeManagement.getContentPane().add(tinNoLabel);
		
		JLabel pagibigLabel = new JLabel("Pagibig:");
		pagibigLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		pagibigLabel.setBounds(243, 464, 85, 14);
		frmEmployeeManagement.getContentPane().add(pagibigLabel);
		
		JLabel philhealthLabel = new JLabel("Philhealth:");
		philhealthLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		philhealthLabel.setBounds(244, 499, 85, 14);
		frmEmployeeManagement.getContentPane().add(philhealthLabel);
		
		ssstextField = new JTextField();
		ssstextField.setColumns(10);
		ssstextField.setBounds(334, 391, 221, 25);
		frmEmployeeManagement.getContentPane().add(ssstextField);
		
		tinNotextField = new JTextField();
		tinNotextField.setColumns(10);
		tinNotextField.setBounds(334, 427, 221, 25);
		frmEmployeeManagement.getContentPane().add(tinNotextField);
		
		pagibigtextField = new JTextField();
		pagibigtextField.setColumns(10);
		pagibigtextField.setBounds(334, 461, 221, 25);
		frmEmployeeManagement.getContentPane().add(pagibigtextField);
		
		philhealthtextField = new JTextField();
		philhealthtextField.setColumns(10);
		philhealthtextField.setBounds(334, 493, 221, 25);
		frmEmployeeManagement.getContentPane().add(philhealthtextField);
		
		JSeparator GIseparator_1 = new JSeparator();
		GIseparator_1.setBounds(436, 373, 140, 14);
		frmEmployeeManagement.getContentPane().add(GIseparator_1);
		
		JSeparator GIseparator_2 = new JSeparator();
		GIseparator_2.setOrientation(SwingConstants.VERTICAL);
		GIseparator_2.setBounds(576, 372, 17, 165);
		frmEmployeeManagement.getContentPane().add(GIseparator_2);
		
		JSeparator GIseparator_3 = new JSeparator();
		GIseparator_3.setBounds(225, 533, 350, 14);
		frmEmployeeManagement.getContentPane().add(GIseparator_3);
		
		JSeparator GIseparator_4 = new JSeparator();
		GIseparator_4.setOrientation(SwingConstants.VERTICAL);
		GIseparator_4.setBounds(223, 373, 17, 160);
		frmEmployeeManagement.getContentPane().add(GIseparator_4);
		
		JLabel CompanyDeploymentLabel = new JLabel("Company Deployment");
		CompanyDeploymentLabel.setFont(new Font("Arial", Font.BOLD, 14));
		CompanyDeploymentLabel.setBackground(Color.WHITE);
		CompanyDeploymentLabel.setBounds(608, 365, 210, 14);
		frmEmployeeManagement.getContentPane().add(CompanyDeploymentLabel);
		
		JSeparator pictureSeparator_4 = new JSeparator();
		pictureSeparator_4.setOrientation(SwingConstants.VERTICAL);
		pictureSeparator_4.setBounds(577, 89, 17, 237);
		frmEmployeeManagement.getContentPane().add(pictureSeparator_4);
		
		JLabel statusLabel = new JLabel("Status:");
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		statusLabel.setBounds(624, 397, 85, 14);
		frmEmployeeManagement.getContentPane().add(statusLabel);
		
		JLabel positionNewLabel = new JLabel("Position:");
		positionNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		positionNewLabel.setBounds(624, 431, 85, 14);
		frmEmployeeManagement.getContentPane().add(positionNewLabel);
		
		JLabel DepartmentLabel_1 = new JLabel("Department");
		DepartmentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		DepartmentLabel_1.setBounds(624, 463, 85, 14);
		frmEmployeeManagement.getContentPane().add(DepartmentLabel_1);
		
		JLabel immediateSupervisorLabel = new JLabel("\nSupervisor:");
		immediateSupervisorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		immediateSupervisorLabel.setVerticalAlignment(SwingConstants.TOP);
		immediateSupervisorLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		immediateSupervisorLabel.setBounds(585, 499, 140, 14);
		frmEmployeeManagement.getContentPane().add(immediateSupervisorLabel);
		
		JSeparator pictureSeparator_3 = new JSeparator();
		pictureSeparator_3.setBounds(606, 537, 365, 14);
		frmEmployeeManagement.getContentPane().add(pictureSeparator_3);
		
		statusField = new JTextField();
		statusField.setFont(new Font("Arial", Font.PLAIN, 16));
		statusField.setColumns(10);
		statusField.setBounds(718, 390, 221, 25);
		frmEmployeeManagement.getContentPane().add(statusField);
		
		positiontextField = new JTextField();
		positiontextField.setFont(new Font("Arial", Font.PLAIN, 16));
		positiontextField.setColumns(10);
		positiontextField.setBounds(719, 420, 221, 25);
		frmEmployeeManagement.getContentPane().add(positiontextField);
		
		departmenttextField = new JTextField();
		departmenttextField.setFont(new Font("Arial", Font.PLAIN, 16));
		departmenttextField.setColumns(10);
		departmenttextField.setBounds(719, 452, 221, 25);
		frmEmployeeManagement.getContentPane().add(departmenttextField);
		
		supervisortextField = new JTextField();
		supervisortextField.setFont(new Font("Arial", Font.PLAIN, 16));
		supervisortextField.setColumns(10);
		supervisortextField.setBounds(719, 488, 221, 25);
		frmEmployeeManagement.getContentPane().add(supervisortextField);
		
		JSeparator CDseparator_1 = new JSeparator();
		CDseparator_1.setBounds(761, 373, 210, 14);
		frmEmployeeManagement.getContentPane().add(CDseparator_1);
		
		JSeparator CDseparator_2 = new JSeparator();
		CDseparator_2.setOrientation(SwingConstants.VERTICAL);
		CDseparator_2.setBounds(970, 373, 17, 165);
		frmEmployeeManagement.getContentPane().add(CDseparator_2);
		
		JLabel lblBenefitssalaryDetails = new JLabel("Benefits &Salary Details");
		lblBenefitssalaryDetails.setFont(new Font("Arial", Font.BOLD, 14));
		lblBenefitssalaryDetails.setBackground(Color.WHITE);
		lblBenefitssalaryDetails.setBounds(608, 80, 210, 14);
		frmEmployeeManagement.getContentPane().add(lblBenefitssalaryDetails);
		
		JSeparator BSDseparator_4 = new JSeparator();
		BSDseparator_4.setOrientation(SwingConstants.VERTICAL);
		BSDseparator_4.setBounds(606, 93, 17, 232);
		frmEmployeeManagement.getContentPane().add(BSDseparator_4);
		
		JSeparator BSDseparator_3 = new JSeparator();
		BSDseparator_3.setBounds(606, 326, 365, 14);
		frmEmployeeManagement.getContentPane().add(BSDseparator_3);
		
		JSeparator BSDSeparator_2 = new JSeparator();
		BSDSeparator_2.setOrientation(SwingConstants.VERTICAL);
		BSDSeparator_2.setBounds(970, 86, 17, 237);
		frmEmployeeManagement.getContentPane().add(BSDSeparator_2);
		
		JSeparator PIseparator_1_1 = new JSeparator();
		PIseparator_1_1.setBounds(776, 87, 195, 14);
		frmEmployeeManagement.getContentPane().add(PIseparator_1_1);
		
		JLabel lblRiceSubsidy = new JLabel("Rice Subsidy:");
		lblRiceSubsidy.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRiceSubsidy.setBounds(624, 115, 85, 14);
		frmEmployeeManagement.getContentPane().add(lblRiceSubsidy);
		
		JLabel lblPhoneAllowance = new JLabel("Phone Allowance:");
		lblPhoneAllowance.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhoneAllowance.setBounds(624, 151, 101, 14);
		frmEmployeeManagement.getContentPane().add(lblPhoneAllowance);
		
		JLabel lblClothingAllowance = new JLabel("Clothing Allowance:");
		lblClothingAllowance.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClothingAllowance.setBounds(624, 183, 111, 14);
		frmEmployeeManagement.getContentPane().add(lblClothingAllowance);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary:");
		lblBasicSalary.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBasicSalary.setBounds(624, 248, 111, 14);
		frmEmployeeManagement.getContentPane().add(lblBasicSalary);
		
		JLabel lblY = new JLabel("Hourly Rate:");
		lblY.setFont(new Font("Arial", Font.PLAIN, 12));
		lblY.setBounds(624, 292, 111, 14);
		frmEmployeeManagement.getContentPane().add(lblY);
		
		riceSubsidytextField = new JTextField();
		riceSubsidytextField.setFont(new Font("Arial", Font.PLAIN, 16));
		riceSubsidytextField.setColumns(10);
		riceSubsidytextField.setBounds(735, 108, 221, 25);
		frmEmployeeManagement.getContentPane().add(riceSubsidytextField);
		
		phoneAllowancetextField = new JTextField();
		phoneAllowancetextField.setFont(new Font("Arial", Font.PLAIN, 16));
		phoneAllowancetextField.setColumns(10);
		phoneAllowancetextField.setBounds(735, 142, 221, 25);
		frmEmployeeManagement.getContentPane().add(phoneAllowancetextField);
		
		clothingAllowancetextField = new JTextField();
		clothingAllowancetextField.setFont(new Font("Arial", Font.PLAIN, 16));
		clothingAllowancetextField.setColumns(10);
		clothingAllowancetextField.setBounds(735, 178, 221, 25);
		frmEmployeeManagement.getContentPane().add(clothingAllowancetextField);
		
		basicSalarytextField = new JTextField();
		basicSalarytextField.setFont(new Font("Arial", Font.PLAIN, 16));
		basicSalarytextField.setColumns(10);
		basicSalarytextField.setBounds(734, 245, 221, 25);
		frmEmployeeManagement.getContentPane().add(basicSalarytextField);
		
		hourlyRatetextField = new JTextField();
		hourlyRatetextField.setFont(new Font("Arial", Font.PLAIN, 16));
		hourlyRatetextField.setColumns(10);
		hourlyRatetextField.setBounds(735, 289, 221, 25);
		frmEmployeeManagement.getContentPane().add(hourlyRatetextField);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("Arial", Font.BOLD, 12));
		btnSearch.setBackground(new Color(240, 248, 255));
		btnSearch.setBounds(15, 403, 200, 31);
		frmEmployeeManagement.getContentPane().add(btnSearch);
	}
}

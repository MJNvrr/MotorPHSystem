package motorPH;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeProfilePage {

	private JFrame frmEmployeeProfilePage;
	private JTextField employeeNotextField;
	private JTextField lastNametextField;
	private JTextField firstNametextField;
	private JTextField birthdaytextField;
	private JTextField phoneNotextField;
	private JTextField addresstextField;
	private JTextField ssstextField;
	private JTextField tinNotextField;
	private JTextField pagibigtextField;
	private JTextField philHealthtextField;
	private JTextField statustextField;
	private JTextField positiontextField;
	private JTextField immediateSupervisortextField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeProfilePage window = new EmployeeProfilePage();
					window.frmEmployeeProfilePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeProfilePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeProfilePage = new JFrame();
		frmEmployeeProfilePage.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.setTitle("Employee Profile Page");
		frmEmployeeProfilePage.getContentPane().setBackground(new Color(192, 192, 192));
		frmEmployeeProfilePage.setBounds(100, 100, 1015, 881);
		frmEmployeeProfilePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeProfilePage.getContentPane().setLayout(null);
		
		JLabel personalInformationLabel = new JLabel("Personal Information");
		personalInformationLabel.setBounds(49, 40, 153, 14);
		personalInformationLabel.setFont(new Font("Arial", Font.BOLD, 14));
		personalInformationLabel.setBackground(new Color(255, 255, 255));
		frmEmployeeProfilePage.getContentPane().add(personalInformationLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setBounds(49, 133, 85, 14);
		lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(lastNameLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setBounds(49, 166, 85, 14);
		firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(firstNameLabel);
		
		JLabel employeeNoLabel = new JLabel("Employee No:");
		employeeNoLabel.setBounds(50, 95, 85, 15);
		employeeNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(employeeNoLabel);
		
		JLabel birthdayLabel = new JLabel("Birthday:");
		birthdayLabel.setBounds(49, 205, 85, 14);
		birthdayLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(birthdayLabel);
		
		JLabel phoneNoLabel = new JLabel("Phone No:");
		phoneNoLabel.setBounds(49, 247, 85, 14);
		phoneNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(phoneNoLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setBounds(49, 286, 85, 14);
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(addressLabel);
		
		JLabel sssLabel = new JLabel("SSS:");
		sssLabel.setBounds(49, 403, 85, 14);
		sssLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(sssLabel);
		
		JLabel pagibigLabel = new JLabel("Pagibig:");
		pagibigLabel.setBounds(49, 487, 85, 14);
		pagibigLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(pagibigLabel);
		
		JLabel philhealthLabel = new JLabel("Philhealth:");
		philhealthLabel.setBounds(49, 534, 85, 14);
		philhealthLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(philhealthLabel);
		
		JLabel tinNoLabel = new JLabel("Tin No:");
		tinNoLabel.setBounds(49, 446, 85, 14);
		tinNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(tinNoLabel);
		
		JLabel GovermentIdsInformationLabel = new JLabel("Goverment Id's Information");
		GovermentIdsInformationLabel.setBounds(49, 353, 210, 14);
		GovermentIdsInformationLabel.setFont(new Font("Arial", Font.BOLD, 14));
		GovermentIdsInformationLabel.setBackground(Color.WHITE);
		frmEmployeeProfilePage.getContentPane().add(GovermentIdsInformationLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(614, 107, 1, 1);
		frmEmployeeProfilePage.getContentPane().add(layeredPane);
		
		JLabel statusLabel = new JLabel("Status:");
		statusLabel.setBounds(552, 396, 85, 14);
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(statusLabel);
		
		JLabel CompanyDeploymentLabel = new JLabel("Company Deployment");
		CompanyDeploymentLabel.setBounds(498, 356, 210, 14);
		CompanyDeploymentLabel.setFont(new Font("Arial", Font.BOLD, 14));
		CompanyDeploymentLabel.setBackground(Color.WHITE);
		frmEmployeeProfilePage.getContentPane().add(CompanyDeploymentLabel);
		
		JLabel positionNewLabel = new JLabel("Position:");
		positionNewLabel.setBounds(552, 443, 85, 14);
		positionNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(positionNewLabel);
		
		JLabel immediateSupervisorLabel = new JLabel("Immediate \r\nSupervisor:");
		immediateSupervisorLabel.setBounds(511, 535, 135, 14);
		immediateSupervisorLabel.setVerticalAlignment(SwingConstants.TOP);
		immediateSupervisorLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeProfilePage.getContentPane().add(immediateSupervisorLabel);
		
		employeeNotextField = new JTextField();
		employeeNotextField.setBounds(141, 86, 221, 25);
		frmEmployeeProfilePage.getContentPane().add(employeeNotextField);
		employeeNotextField.setColumns(10);
		
		lastNametextField = new JTextField();
		lastNametextField.setBounds(141, 126, 221, 25);
		lastNametextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(lastNametextField);
		
		firstNametextField = new JTextField();
		firstNametextField.setBounds(141, 162, 221, 25);
		firstNametextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(firstNametextField);
		
		birthdaytextField = new JTextField();
		birthdaytextField.setBounds(141, 198, 221, 25);
		birthdaytextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(birthdaytextField);
		
		phoneNotextField = new JTextField();
		phoneNotextField.setBounds(141, 236, 221, 25);
		phoneNotextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(phoneNotextField);
		
		addresstextField = new JTextField();
		addresstextField.setBounds(141, 275, 221, 25);
		addresstextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(addresstextField);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setBounds(789, 83, 144, 37);
		profileButton.setBackground(new Color(240, 248, 255));
		profileButton.setFont(new Font("Arial", Font.BOLD, 12));
		frmEmployeeProfilePage.getContentPane().add(profileButton);
		
		JButton btnLeaveRequest = new JButton("Leave Request");
		btnLeaveRequest.setBounds(789, 132, 144, 37);
		btnLeaveRequest.setFont(new Font("Arial", Font.BOLD, 12));
		btnLeaveRequest.setBackground(new Color(240, 248, 255));
		frmEmployeeProfilePage.getContentPane().add(btnLeaveRequest);
		
		ssstextField = new JTextField();
		ssstextField.setBounds(141, 397, 221, 25);
		ssstextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(ssstextField);
		
		tinNotextField = new JTextField();
		tinNotextField.setBounds(141, 439, 221, 25);
		tinNotextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(tinNotextField);
		
		pagibigtextField = new JTextField();
		pagibigtextField.setBounds(141, 483, 221, 25);
		pagibigtextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(pagibigtextField);
		
		philHealthtextField = new JTextField();
		philHealthtextField.setBounds(141, 526, 221, 25);
		philHealthtextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(philHealthtextField);
		
		statustextField = new JTextField();
		statustextField.setBounds(644, 392, 221, 25);
		statustextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(statustextField);
		
		positiontextField = new JTextField();
		positiontextField.setBounds(644, 439, 221, 25);
		positiontextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(positiontextField);
		
		immediateSupervisortextField = new JTextField();
		immediateSupervisortextField.setBounds(644, 483, 221, 25);
		immediateSupervisortextField.setColumns(10);
		frmEmployeeProfilePage.getContentPane().add(immediateSupervisortextField);
		
		JLabel lblNewLabel_2 = new JLabel("Picture");
		lblNewLabel_2.setBounds(507, 35, 63, 20);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		frmEmployeeProfilePage.getContentPane().add(lblNewLabel_2);
		
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(141, 644, 135, 37);
		saveButton.setBackground(new Color(255, 255, 255));
		saveButton.setFont(new Font("Arial", Font.BOLD, 12));
		frmEmployeeProfilePage.getContentPane().add(saveButton);
		
		JButton editButton = new JButton("Edit");
		editButton.setBounds(442, 644, 135, 37);
		editButton.setFont(new Font("Arial", Font.BOLD, 12));
		editButton.setBackground(new Color(255, 255, 255));
		frmEmployeeProfilePage.getContentPane().add(editButton);
		
		JButton searchButton = new JButton("Dashboard");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchButton.setBounds(776, 644, 135, 37);
		searchButton.setFont(new Font("Arial", Font.BOLD, 12));
		searchButton.setBackground(new Color(255, 255, 255));
		frmEmployeeProfilePage.getContentPane().add(searchButton);
		
		JButton btnPayroll = new JButton("Payroll");
		btnPayroll.setFont(new Font("Arial", Font.BOLD, 12));
		btnPayroll.setBackground(new Color(240, 248, 255));
		btnPayroll.setBounds(789, 224, 144, 37);
		frmEmployeeProfilePage.getContentPane().add(btnPayroll);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.setFont(new Font("Arial", Font.BOLD, 12));
		btnAttendance.setBackground(new Color(240, 248, 255));
		btnAttendance.setBounds(789, 179, 144, 37);
		frmEmployeeProfilePage.getContentPane().add(btnAttendance);
		
		JSeparator PIseparator_3 = new JSeparator();
		PIseparator_3.setBounds(36, 316, 367, 14);
		frmEmployeeProfilePage.getContentPane().add(PIseparator_3);
		
		JSeparator PIseparator_4 = new JSeparator();
		PIseparator_4.setOrientation(SwingConstants.VERTICAL);
		PIseparator_4.setBounds(35, 40, 17, 279);
		frmEmployeeProfilePage.getContentPane().add(PIseparator_4);
		
		JSeparator PIseparator2 = new JSeparator();
		PIseparator2.setOrientation(SwingConstants.VERTICAL);
		PIseparator2.setBounds(402, 46, 17, 272);
		frmEmployeeProfilePage.getContentPane().add(PIseparator2);
		
		JSeparator PIseparator_1 = new JSeparator();
		PIseparator_1.setBounds(196, 44, 208, 14);
		frmEmployeeProfilePage.getContentPane().add(PIseparator_1);
		
		JSeparator GIseparator_3 = new JSeparator();
		GIseparator_3.setBounds(38, 585, 367, 14);
		frmEmployeeProfilePage.getContentPane().add(GIseparator_3);
		
		JSeparator GIseparator_4 = new JSeparator();
		GIseparator_4.setOrientation(SwingConstants.VERTICAL);
		GIseparator_4.setBounds(35, 357, 17, 229);
		frmEmployeeProfilePage.getContentPane().add(GIseparator_4);
		
		JSeparator GIseparator_1 = new JSeparator();
		GIseparator_1.setBounds(242, 359, 160, 14);
		frmEmployeeProfilePage.getContentPane().add(GIseparator_1);
		
		JSeparator GIseparator_2 = new JSeparator();
		GIseparator_2.setOrientation(SwingConstants.VERTICAL);
		GIseparator_2.setBounds(401, 360, 17, 228);
		frmEmployeeProfilePage.getContentPane().add(GIseparator_2);
		
		JSeparator CDseparator_3 = new JSeparator();
		CDseparator_3.setBounds(494, 573, 460, 14);
		frmEmployeeProfilePage.getContentPane().add(CDseparator_3);
		
		JSeparator CDseparator_4 = new JSeparator();
		CDseparator_4.setOrientation(SwingConstants.VERTICAL);
		CDseparator_4.setBounds(493, 361, 17, 215);
		frmEmployeeProfilePage.getContentPane().add(CDseparator_4);
		
		JSeparator CDseparator_2 = new JSeparator();
		CDseparator_2.setOrientation(SwingConstants.VERTICAL);
		CDseparator_2.setBounds(951, 366, 17, 210);
		frmEmployeeProfilePage.getContentPane().add(CDseparator_2);
		
		JSeparator CDseparator_1 = new JSeparator();
		CDseparator_1.setBounds(655, 362, 299, 14);
		frmEmployeeProfilePage.getContentPane().add(CDseparator_1);
		
		JSeparator pictureSeparator_1 = new JSeparator();
		pictureSeparator_1.setBounds(563, 40, 391, 14);
		frmEmployeeProfilePage.getContentPane().add(pictureSeparator_1);
		
		JSeparator pictureSeparator_4 = new JSeparator();
		pictureSeparator_4.setOrientation(SwingConstants.VERTICAL);
		pictureSeparator_4.setBounds(494, 40, 17, 272);
		frmEmployeeProfilePage.getContentPane().add(pictureSeparator_4);
		
		JSeparator pictureSeparator_3 = new JSeparator();
		pictureSeparator_3.setBounds(498, 305, 456, 14);
		frmEmployeeProfilePage.getContentPane().add(pictureSeparator_3);
		
		JSeparator pictureSeparator_2 = new JSeparator();
		pictureSeparator_2.setOrientation(SwingConstants.VERTICAL);
		pictureSeparator_2.setBounds(951, 40, 17, 265);
		frmEmployeeProfilePage.getContentPane().add(pictureSeparator_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(644, 527, 221, 25);
		frmEmployeeProfilePage.getContentPane().add(textField);
		
		JLabel DepartmentLabel = new JLabel("Department");
		DepartmentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		DepartmentLabel.setBounds(552, 491, 85, 14);
		frmEmployeeProfilePage.getContentPane().add(DepartmentLabel);
		
		JLabel lblNewLabel = new JLabel("Image (Passport Size)");
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setBounds(535, 86, 188, 175);
		frmEmployeeProfilePage.getContentPane().add(lblNewLabel);
	}
}

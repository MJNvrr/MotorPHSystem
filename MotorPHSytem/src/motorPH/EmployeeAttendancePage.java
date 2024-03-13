package motorPH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;
import java.util.concurrent.TimeUnit;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.time.Month;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeAttendancePage {

	private JFrame frameEmployeeAttendancePage;
	private JTextField employeeNotextField;
	private JTextField textField;
	private JTextField firstNametextField;
	private JTextField birthdaytextField;
	private JTextField phonetextField;
	private JTextField textField_1;
	private JTextField timeIntextField;
	private JTextField timeOuttextField;
	private JTextField overTimetextField;
	private JTextField statustextField;
	private JTextField positiontextField;
	private JTextField departmenttextField;
	private JTextField immediateSupervisortextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeAttendancePage window = new EmployeeAttendancePage();
					window.frameEmployeeAttendancePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeAttendancePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameEmployeeAttendancePage = new JFrame();
		frameEmployeeAttendancePage.setTitle("Employee Attendance Page");
		frameEmployeeAttendancePage.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frameEmployeeAttendancePage.setFont(new Font("Arial", Font.PLAIN, 12));
		frameEmployeeAttendancePage.getContentPane().setBackground(new Color(192, 192, 192));
		frameEmployeeAttendancePage.setBounds(100, 100, 1015, 881
				);
		frameEmployeeAttendancePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEmployeeAttendancePage.getContentPane().setLayout(null);
		
		JLabel employeeNoLabel = new JLabel("EmployeeNo:");
		employeeNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		employeeNoLabel.setBounds(62, 85, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(employeeNoLabel);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLastName.setBounds(62, 126, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFirstName.setBounds(62, 175, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblFirstName);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBirthday.setBounds(62, 215, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblBirthday);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhoneNo.setBounds(62, 260, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblPhoneNo);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAddress.setBounds(61, 306, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblAddress);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Arial", Font.BOLD, 14));
		lblPersonalInformation.setBounds(62, 38, 194, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblPersonalInformation);
		
		employeeNotextField = new JTextField();
		employeeNotextField.setFont(new Font("Arial", Font.PLAIN, 12));
		employeeNotextField.setBounds(167, 80, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(employeeNotextField);
		employeeNotextField.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(167, 121, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(textField);
		
		firstNametextField = new JTextField();
		firstNametextField.setFont(new Font("Arial", Font.PLAIN, 12));
		firstNametextField.setColumns(10);
		firstNametextField.setBounds(167, 166, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(firstNametextField);
		
		birthdaytextField = new JTextField();
		birthdaytextField.setFont(new Font("Arial", Font.PLAIN, 12));
		birthdaytextField.setColumns(10);
		birthdaytextField.setBounds(168, 209, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(birthdaytextField);
		
		phonetextField = new JTextField();
		phonetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		phonetextField.setColumns(10);
		phonetextField.setBounds(167, 254, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(phonetextField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(167, 298, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(textField_1);
		
		JLabel lblAttendance = new JLabel("Attendance");
		lblAttendance.setFont(new Font("Arial", Font.BOLD, 14));
		lblAttendance.setBounds(62, 390, 194, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblAttendance);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDate.setBounds(62, 437, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblDate);
		
		JLabel lblTimeIn = new JLabel("Time In:");
		lblTimeIn.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTimeIn.setBounds(62, 480, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblTimeIn);
		
		JLabel lblTimeOut = new JLabel("Time Out:");
		lblTimeOut.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTimeOut.setBounds(62, 527, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblTimeOut);
		
		JLabel lblOvertime = new JLabel("Overtime:");
		lblOvertime.setFont(new Font("Arial", Font.PLAIN, 12));
		lblOvertime.setBounds(62, 570, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblOvertime);
		
		JComboBox<String> datecomboBox = new JComboBox<String>();
		datecomboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		datecomboBox.setModel(new DefaultComboBoxModel(Month.values()));
		datecomboBox.setBounds(167, 426, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(datecomboBox);
		
		
		
		timeIntextField = new JTextField();
		timeIntextField.setFont(new Font("Arial", Font.PLAIN, 12));
		timeIntextField.setColumns(10);
		timeIntextField.setBounds(167, 473, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(timeIntextField);
		
		timeOuttextField = new JTextField();
		timeOuttextField.setFont(new Font("Arial", Font.PLAIN, 12));
		timeOuttextField.setColumns(10);
		timeOuttextField.setBounds(167, 517, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(timeOuttextField);
		
		overTimetextField = new JTextField();
		overTimetextField.setFont(new Font("Arial", Font.PLAIN, 12));
		overTimetextField.setColumns(10);
		overTimetextField.setBounds(167, 558, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(overTimetextField);
		
		JLabel lblCompanyDeployment = new JLabel("Company Deployment");
		lblCompanyDeployment.setFont(new Font("Arial", Font.BOLD, 14));
		lblCompanyDeployment.setBounds(507, 391, 194, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblCompanyDeployment);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		lblStatus.setBounds(538, 437, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblStatus);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPosition.setBounds(538, 480, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblPosition);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDepartment.setBounds(538, 527, 114, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblDepartment);
		
		JLabel lblImmediateSupervisor = new JLabel("Immediate Supervisor:");
		lblImmediateSupervisor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblImmediateSupervisor.setBounds(515, 570, 137, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblImmediateSupervisor);
		
		statustextField = new JTextField();
		statustextField.setFont(new Font("Arial", Font.PLAIN, 12));
		statustextField.setColumns(10);
		statustextField.setBounds(649, 426, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(statustextField);
		
		positiontextField = new JTextField();
		positiontextField.setFont(new Font("Arial", Font.PLAIN, 12));
		positiontextField.setColumns(10);
		positiontextField.setBounds(649, 473, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(positiontextField);
		
		departmenttextField = new JTextField();
		departmenttextField.setFont(new Font("Arial", Font.PLAIN, 12));
		departmenttextField.setColumns(10);
		departmenttextField.setBounds(649, 522, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(departmenttextField);
		
		immediateSupervisortextField = new JTextField();
		immediateSupervisortextField.setFont(new Font("Arial", Font.PLAIN, 12));
		immediateSupervisortextField.setColumns(10);
		immediateSupervisortextField.setBounds(649, 567, 220, 25);
		frameEmployeeAttendancePage.getContentPane().add(immediateSupervisortextField);
		
		JLabel lblPicture = new JLabel("Picture");
		lblPicture.setFont(new Font("Arial", Font.BOLD, 14));
		lblPicture.setBounds(507, 39, 194, 14);
		frameEmployeeAttendancePage.getContentPane().add(lblPicture);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setFont(new Font("Arial", Font.BOLD, 12));
		profileButton.setBackground(new Color(240, 248, 255));
		profileButton.setBounds(776, 81, 144, 37);
		frameEmployeeAttendancePage.getContentPane().add(profileButton);
		
		JButton btnLeaveRequest = new JButton("Leave Request");
		btnLeaveRequest.setFont(new Font("Arial", Font.BOLD, 12));
		btnLeaveRequest.setBackground(new Color(240, 248, 255));
		btnLeaveRequest.setBounds(776, 129, 144, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnLeaveRequest);
		
		JButton btnPayroll = new JButton("Payroll");
		btnPayroll.setFont(new Font("Arial", Font.BOLD, 12));
		btnPayroll.setBackground(new Color(240, 248, 255));
		btnPayroll.setBounds(777, 222, 144, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnPayroll);
		
		JSeparator PIseparator_1 = new JSeparator();
		PIseparator_1.setBounds(214, 45, 208, 14);
		frameEmployeeAttendancePage.getContentPane().add(PIseparator_1);
		
		JSeparator PIseparator2 = new JSeparator();
		PIseparator2.setOrientation(SwingConstants.VERTICAL);
		PIseparator2.setBounds(420, 48, 17, 301);
		frameEmployeeAttendancePage.getContentPane().add(PIseparator2);
		
		JSeparator PIseparator_3 = new JSeparator();
		PIseparator_3.setBounds(46, 345, 376, 14);
		frameEmployeeAttendancePage.getContentPane().add(PIseparator_3);
		
		JSeparator PIseparator_4 = new JSeparator();
		PIseparator_4.setOrientation(SwingConstants.VERTICAL);
		PIseparator_4.setBounds(46, 48, 17, 301);
		frameEmployeeAttendancePage.getContentPane().add(PIseparator_4);
		
		JSeparator Aseparator_1 = new JSeparator();
		Aseparator_1.setBounds(146, 397, 276, 14);
		frameEmployeeAttendancePage.getContentPane().add(Aseparator_1);
		
		JSeparator Aseparator_2 = new JSeparator();
		Aseparator_2.setOrientation(SwingConstants.VERTICAL);
		Aseparator_2.setBounds(420, 397, 17, 228);
		frameEmployeeAttendancePage.getContentPane().add(Aseparator_2);
		
		JSeparator Aseparator_3 = new JSeparator();
		Aseparator_3.setBounds(46, 623, 376, 14);
		frameEmployeeAttendancePage.getContentPane().add(Aseparator_3);
		
		JSeparator Aseparator_4 = new JSeparator();
		Aseparator_4.setOrientation(SwingConstants.VERTICAL);
		Aseparator_4.setBounds(46, 396, 17, 229);
		frameEmployeeAttendancePage.getContentPane().add(Aseparator_4);
		
		JSeparator CDseparator_1 = new JSeparator();
		CDseparator_1.setBounds(662, 397, 284, 14);
		frameEmployeeAttendancePage.getContentPane().add(CDseparator_1);
		
		JSeparator CDseparator_2 = new JSeparator();
		CDseparator_2.setOrientation(SwingConstants.VERTICAL);
		CDseparator_2.setBounds(944, 399, 17, 226);
		frameEmployeeAttendancePage.getContentPane().add(CDseparator_2);
		
		JSeparator CDseparator_3 = new JSeparator();
		CDseparator_3.setBounds(489, 623, 457, 14);
		frameEmployeeAttendancePage.getContentPane().add(CDseparator_3);
		
		JSeparator CDseparator_4 = new JSeparator();
		CDseparator_4.setOrientation(SwingConstants.VERTICAL);
		CDseparator_4.setBounds(488, 397, 17, 228);
		frameEmployeeAttendancePage.getContentPane().add(CDseparator_4);
		
		JLabel lblNewLabel = new JLabel("Image (Passport Size)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setBounds(507, 85, 188, 175);
		frameEmployeeAttendancePage.getContentPane().add(lblNewLabel);
		
		JButton btnView = new JButton("View");
		btnView.setFont(new Font("Arial", Font.BOLD, 12));
		btnView.setBackground(Color.WHITE);
		btnView.setBounds(167, 664, 135, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnView);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(662, 664, 135, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnLogout);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDashboard.setFont(new Font("Arial", Font.BOLD, 12));
		btnDashboard.setBackground(new Color(255, 255, 255));
		btnDashboard.setBounds(420, 664, 144, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnDashboard);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.setFont(new Font("Arial", Font.BOLD, 12));
		btnAttendance.setBackground(new Color(240, 248, 255));
		btnAttendance.setBounds(776, 176, 144, 37);
		frameEmployeeAttendancePage.getContentPane().add(btnAttendance);
		
		JSeparator pictureSeparator_1 = new JSeparator();
		pictureSeparator_1.setBounds(561, 43, 391, 14);
		frameEmployeeAttendancePage.getContentPane().add(pictureSeparator_1);
		
		JSeparator pictureSeparator_2 = new JSeparator();
		pictureSeparator_2.setOrientation(SwingConstants.VERTICAL);
		pictureSeparator_2.setBounds(949, 46, 17, 303);
		frameEmployeeAttendancePage.getContentPane().add(pictureSeparator_2);
		
		JSeparator pictureSeparator_3 = new JSeparator();
		pictureSeparator_3.setBounds(489, 345, 463, 14);
		frameEmployeeAttendancePage.getContentPane().add(pictureSeparator_3);
		
		JSeparator pictureSeparator_4 = new JSeparator();
		pictureSeparator_4.setOrientation(SwingConstants.VERTICAL);
		pictureSeparator_4.setBounds(488, 45, 17, 302);
		frameEmployeeAttendancePage.getContentPane().add(pictureSeparator_4);
	}
}

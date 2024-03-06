package motorPH;


	import java.util.Date;

	public abstract class EmployeeLeave {
		private int employeeNo;
		private String lastname;
		private String firstName;
		private Date startDate;
		private Date endDate;
		private LeaveType leaveType;

		
		public void employeeLeave(int employeeNo, String lastName,
				String firstName,Date startDate,Date endDate,LeaveType leaveType) {
		
		this.setEmployeeNo(employeeNo);
		this.setLastname(lastName);
		this.setFirstName(firstName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setLeaveType(leaveType);
		
		
		}


		public int getEmployeeNo() {
			return employeeNo;
		}


		public void setEmployeeNo(int employeeNo) {
			this.employeeNo = employeeNo;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public Date getStartDate() {
			return startDate;
		}


		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}


		public Date getEndDate() {
			return endDate;
		}


		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}


		public LeaveType getLeaveType() {
			return leaveType;
		}


		public void setLeaveType(LeaveType leaveType) {
			this.leaveType = leaveType;
		}	

	}



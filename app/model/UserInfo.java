package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the userinfo database table.
 * 
 */
@Entity
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private int id;

	@Column (name = "CONTACT_PERSON_ID")
	private int contactPersonId;

	@Temporal (TemporalType.DATE)
	@Column (name = "CREATE_DATE")
	private Date createDate;

	@Column (name = "CREATED_BY")
	private String createdBy;

	@Column (name = "CREATED_BY_PROC")
	private String createdByProc;

	@Column (name = "CUSTOMER_ID")
	private int customerId;

	private String email;

	@Column (name = "EMPLOYEE_ID")
	private int employeeId;

	@Column (name = "EMPLOYEE_ROLE")
	private String employeeRole;

	private String firstname;

	private String gender;

	private int isactive;

	private int isadmin;

	private int iscontactperson;

	@Temporal (TemporalType.DATE)
	@Column (name = "LAST_LOGON")
	private Date lastLogon;

	private String lastname;

	@Column (name = "LOGON_CNT")
	private int logonCnt;

	@Column (name = "OS_NAME")
	private String osName;

	private String password;

	private String phone;

	private int type;

	@Temporal (TemporalType.DATE)
	@Column (name = "UPDATE_DATE")
	private Date updateDate;

	@Column (name = "UPDATED_BY")
	private String updatedBy;

	@Column (name = "UPDATED_BY_PROC")
	private String updatedByProc;

	@Column (name = "USER_CODE")
	private String userCode;

	public UserInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContactPersonId() {
		return this.contactPersonId;
	}

	public void setContactPersonId(int contactPersonId) {
		this.contactPersonId = contactPersonId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedByProc() {
		return this.createdByProc;
	}

	public void setCreatedByProc(String createdByProc) {
		this.createdByProc = createdByProc;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeRole() {
		return this.employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIsactive() {
		return this.isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public int getIsadmin() {
		return this.isadmin;
	}

	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}

	public int getIscontactperson() {
		return this.iscontactperson;
	}

	public void setIscontactperson(int iscontactperson) {
		this.iscontactperson = iscontactperson;
	}

	public Date getLastLogon() {
		return this.lastLogon;
	}

	public void setLastLogon(Date lastLogon) {
		this.lastLogon = lastLogon;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getLogonCnt() {
		return this.logonCnt;
	}

	public void setLogonCnt(int logonCnt) {
		this.logonCnt = logonCnt;
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedByProc() {
		return this.updatedByProc;
	}

	public void setUpdatedByProc(String updatedByProc) {
		this.updatedByProc = updatedByProc;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
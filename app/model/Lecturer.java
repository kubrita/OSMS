package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the lecturer database table.
 * 
 */
@Entity
public class Lecturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="email_id")
	private String emailId;

	@Column(name="last_access")
	private Timestamp lastAccess;

	private String password;

	@Column(name="user_name")
	private String userName;

	public Lecturer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Timestamp getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Timestamp lastAccess) {
		this.lastAccess = lastAccess;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
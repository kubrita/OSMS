package model;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the student database table.
 * 
 */
@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	@Column (name = "email_id")
	private String emailId;

	@Column (name = "last_access")
	private Timestamp lastAccess;

	@JsonIgnore
	private String password;

	@Column (name = "user_name")
	private String userName;

	//bi-directional many-to-one association to Grade
	@OneToMany (mappedBy = "student")
	private List<Grade> grades;

	//bi-directional many-to-one association to StudentCourse
	@OneToMany (mappedBy = "student")
	private List<StudentCourse> studentCourses;

	//bi-directional many-to-one association to StudentEnrollment
	@OneToMany (mappedBy = "student")
	private List<StudentEnrollment> studentEnrollments;

	//bi-directional many-to-one association to StudentProfile
	@OneToMany (mappedBy = "student")
	private List<StudentProfile> studentProfiles;

	public Student() {
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

	public List<Grade> getGrades() {
		return this.grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<StudentCourse> getStudentCourses() {
		return this.studentCourses;
	}

	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public List<StudentEnrollment> getStudentEnrollments() {
		return this.studentEnrollments;
	}

	public void setStudentEnrollments(List<StudentEnrollment> studentEnrollments) {
		this.studentEnrollments = studentEnrollments;
	}

	public List<StudentProfile> getStudentProfiles() {
		return this.studentProfiles;
	}

	public void setStudentProfiles(List<StudentProfile> studentProfiles) {
		this.studentProfiles = studentProfiles;
	}

}